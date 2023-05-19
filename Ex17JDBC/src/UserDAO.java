import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
   //DAO : Data Access Object 
   //데이터에 접근하는 기능을 가지고 있음
   
   Connection conn = null;
   PreparedStatement pstm = null; //쿼리문 실행시키는 객체
   ResultSet rs = null; //쿼리문을 통해 발생한 응답을 받을 수 있는 객체
   
   //DB연결
   public void getConn() {

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String id = "service";
         String pw = "12345";
         
         conn = DriverManager.getConnection(url, id, pw);
         
      } catch (ClassNotFoundException | SQLException e) {
         e.printStackTrace();
      }
   }
   
   //DB닫기
   public void close() {
      //DB 연결 끊기 → 역순
      try {
         if(rs != null) {
            rs.close();
         }
         if(pstm != null) {
            pstm.close();
         }
         if(conn != null) {
            conn.close();
         }
      }catch(SQLException e){
         e.printStackTrace();
      }
   }
   
   //쿼리문 작성
   
   //로그인
   public String login(String inputId, String inputPw) {
      getConn();
      String nick = null;
      try {
         String sql = "select NICK from member where ID = ? and PW = ?";
         pstm = conn.prepareStatement(sql);
         pstm.setString(1,  inputId);
         pstm.setString(2,  inputPw);
         
         rs = pstm.executeQuery();
         
         while(rs.next()) {
            nick = rs.getString("NICK");
            System.out.println(nick + "님 환영합니다!\n");
            
            }
         }catch(SQLException e) {
            System.out.println("쿼리문 오류");
            e.printStackTrace();
         }
      close();
      return nick;
   }
   
   //회원가입
   public void join(String inputId, String inputPw, String inputNick) {
      
      getConn();
      int result =0;
      try {
         String sql = "insert into member values (?, ?, ?)";
         pstm = conn.prepareStatement(sql);
         pstm.setString(1,  inputId);
         pstm.setString(2,  inputPw);
         pstm.setString(3,  inputNick);
         
         result = pstm.executeUpdate();
         
         
      } catch (SQLException e) {
         System.out.println("쿼리문 오류!");
         e.printStackTrace();
      }
      close();
      return result;
   }
   
   //전체 회원 조회
   public void memberList() {
      getConn();
      try {
         String sql = "select * from member";
         pstm = conn.prepareStatement(sql);
         
         rs = pstm.executeQuery();
         
         while(rs.next()) {
            String id = rs.getString("ID"); //1
            String pw = rs.getString("PW"); //2
            String nick = rs.getString("NICK"); //3
            System.out.printf("아이디 : %s  비밀번호 : %s  닉네임 : %s\n", id, pw, nick);
            }
         }catch(SQLException e) {
            System.out.println("쿼리문 오류");
            e.printStackTrace();
         }
      
      
      System.out.println();
      close();
   }
   
}