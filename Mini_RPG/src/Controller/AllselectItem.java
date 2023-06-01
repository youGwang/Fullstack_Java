package Controller;

import java.util.ArrayList;

import Model.DAO;
import Model.ItemVO;

public class AllselectItem {
	public void rangeAll(int select) {
		if(select == 1) {
			
		}else if(select == 2) {
			allSword();
		}else if(select ==3) {
			
		}else {
			System.out.println("잘못된 선택입니다.");
		}
	}
	
	
	public void allSword() {
		DAO dao = new DAO();
		ArrayList<ItemVO> Sword_db = dao.SwordcheckAll();
		System.out.println("num\tname\tpower");
		System.out.println("--------------------");
		for(ItemVO SwordObject:Sword_db) {
			System.out.println(SwordObject.getItemNum()+"\t");
			System.out.println(SwordObject.getName()+"\t");
			System.out.println(SwordObject.getAttackPower()+"\t");
		}
	}
	public void allBow() {
		DAO dao = new DAO();
		ArrayList<ItemVO> bow_db = dao.BowcheckAll();
		System.out.println("num\tname\tpower\tdurbility");
		System.out.println("---------------------------");
		for(ItemVO bowObject : bow_db) {
			System.out.println(bowObject.getItemNum()+"\t");
			System.out.println(bowObject.getName()+"\t");
			System.out.println(bowObject.getAttackPower()+"\t");
			System.out.println((BowVo));
		}
	}
}
