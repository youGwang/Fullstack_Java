package 숫자게임만들기;

public class Member {
	private String nickName;
	private String pw;

	public Member(String nickName, String pw) {
		this.nickName = nickName;
		this.pw = pw;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;

	}
}
