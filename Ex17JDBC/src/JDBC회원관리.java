import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC회원관리 {

   public static void main(String[] args) { 
      
      Scanner sc = new Scanner(System.in);

      //(1)로그인 (2)회원가입 (3)전체 회원 조회 (4)종료
      //4번을 누르기 전까지 1,2,3 메뉴를 계속 선택할 수 있도록 만들어 주세요!
      int menu;
      String inputId;
      String inputPw;
      String inputNick;
      UserDAO dao = new UserDAO();
      while(true) {
         
         System.out.print("(1)로그인 (2)회원가입 (3)전체 회원 조회 (4)종료 >> ");
         menu = sc.nextInt();
         System.out.println();
         
         if(menu == 1) {
            System.out.println("========== 로그인 ==========");
            System.out.print("아이디 입력 >> ");
            inputId = sc.next();
            System.out.print("비밀번호 입력 >> ");
            inputPw = sc.next();
            
            //사용자로부터 id, pw를 입력받아서 모두 DB에 있는 내용과 맞다면 
            //"NICK님 환영합니다" 출력
            dao.login(inputId, inputPw);
            
            String nick = dao.login(inputId, inputPw);
            if(nick != null) {
            	System.out.println(nick+"님 환영합니다!");
            }
            
         }else if(menu == 2) {
            System.out.println("========== 회원가입 ==========");
            //id, pw, nick를 사용자로부터 입력받아서 member 테이블에 저장!
            System.out.print("아이디 입력 >> ");
            inputId = sc.next();
            System.out.print("비밀번호 입력 >> ");
            inputPw = sc.next();
            System.out.print("닉네임 입력 >> ");
            inputNick = sc.next();
            
            
            dao.join(inputId, inputPw, inputNick);
            int result = dao.join(inputId, inputPw, inputNick);
            if(result>0) {
            	System.out.println("회원가입 성공");
            }else {
            	System.out.println("회원가입 실패");
            }
         }else if(menu == 3) {
            System.out.println("========== 닉네임 조회 ==========");
            //ID : 승환 비밀번호 : 123 닉네임 : 점심짜장저녁냉면 출력!
            dao.memberL0ist();
         }else {
            System.out.println("프로그램을 종료합니다.");
            break;
         }
      
      }
      
   }
   
}
