package 주소록관리프로그램;

public class Address {

	// 설계도 : 실행 x
	// 1. 필드
	private String name; // 이름
	private int age; // 나이
	private String phoneNumber; // 전화번호

	// 2. 메서드
	// 생성자 : 필드를 초기화 시켜주는 생성자
	public Address(String name, int age, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
// public Address(){
//
// }

	// getter/setter
	// getter : 필드를 확인(출력)할떄 사용하는 메서드
	// setter : 필드를 수정할떄 사용하는 메서드
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	// private : 클래스 외부에서 함부로 접근할 수 없도록 만들어주는 제한자
	// 클래스 내부에 있는 메서드를 통해서만 접근이 가능하도록 하는

}
