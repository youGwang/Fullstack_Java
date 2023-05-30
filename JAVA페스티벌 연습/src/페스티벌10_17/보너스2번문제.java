package 페스티벌10_17;

public class 보너스2번문제 {

	public static void main(String[] args) {
		System.out.println(getmiddle("test"));
		System.out.println(getmiddle("power"));
	}

	
	
	public static String getmiddle(String a) {
		
		int len = a.length()/2;
		
		if(a.length()%2==0) {
			return ""+a.charAt(len-1)+a.charAt(len);
		}else {// ""+char 뒤에 있는걸 문자열로 형변환
			return ""+a.charAt(len);
		}
	
	}
	
}
