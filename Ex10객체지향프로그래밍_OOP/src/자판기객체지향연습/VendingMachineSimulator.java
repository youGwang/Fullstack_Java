package 자판기객체지향연습;

import java.util.Scanner;

public class VendingMachineSimulator {

	public static void main(String[] args) {
		// 자판기 프로그램을 만들어보자.
		VendingMachine vm = new VendingMachine();
		
		vm.inputMoney();
		
		vm.menuChoice();
		
		vm.changeMoney();
		
	}

}
