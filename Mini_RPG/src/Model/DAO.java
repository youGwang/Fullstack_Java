package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {

	private static final ArrayList<ItemVO> SwordList = null;
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	private void connect() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin@127.0.0.1:1521:xe";
			String db_id = "service";
			String db_pw = "12345";
			try {
				conn = DriverManager.getConnection(url, db_id, db_pw);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void getClose() {
		try {
			if (rs != null) {

				rs.close();
			}

			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//활 정보를 전부 가져오는 메서드
	public ArrayList<ItemVO> BowcheckAll(){
		ArrayList<ItemVO> BowList = new ArrayList<>();
		
		connect();
		
		try {
			String sql = "slect * from Bow";
			
			psmt = conn.prepareStatement(sql);
			rs =psmt.executeQuery();
			//rs 의 커서를 기준으로 다음에 데이터가 있는지 없는지 확인한다.
			while(rs.next()) {
				BowVO item = new BowVO(0, null, 0, 0);
				item.setItemNum(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setAttackPower(rs.getInt(3));
				item.setDurability(rs.getInt(4));
				BowList.add(item); // upcasting => BowVO는 ItemVO보다 아래 있지만 upcasting해서 해당 ArrayList에 들어갈 수 있다.
				
			}
			getClose();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return BowList;
	}
	
	//칼 정보를 전부 가져오는 메서드
	public ArrayList<ItemVO> SwordcheckAll(){
		ArrayList<ItemVO> = new ArrayList<>();
		connect();
		
		String sql = "select * from Sword";
		psmt = conn.prepareStatement(sql);
		rs = psmt.executeQuery();
		
		while(rs.next()) {
			SwordVO item = new SwordVO(0,null,0);
			item.setItemNum(rs.getInt(1));
			item.setName(rs.getString(2));
			item.setAttackPower(rs.getInt(3));
			SwordList.add(item);
		}
		getClose();
		
	}



}
