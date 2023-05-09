package 도서관리프로그램;

// 책을 표현하는 클래스(책 정보를 가지고 있음)
public class BookData {
	
	//필드
	private String title;
	private int price;
	private String writer;
	
	//생성자
	public BookData(String title, int price, String writer) {
		this.title = title;
		this.price = price;
		this.writer = writer;
	}
	
	// 정보 생성은 setter
	//getter가져오다 메서드          
	public String gettitle() {
		return title;
	}
	public int getprice() {
		return price;
	}
	public String getwriter() {
		return writer;
	}
	
}
