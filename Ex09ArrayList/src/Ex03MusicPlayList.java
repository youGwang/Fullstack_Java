import java.util.ArrayList;
import java.util.Scanner;

public class Ex03MusicPlayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musiclist = new ArrayList<String>();

		String music = "";
		int number = 0;
		while (true) {
			System.out.print("[1]노래 추가 [2]노래 삭제 [3]종료 >> ");
			number = sc.nextInt();

			if (number == 3) {
				System.out.print("프로그램이 종료되었습니다.");
				break;
			}

			System.out.print("========== 현재 재생 목록 ==========\n");

			if (musiclist.size() == 0) {
				System.out.print("재생 목록이 없습니다.\n");
			}

			for (int i = 0; i < musiclist.size(); i++) {
				System.out.println(i + 1 + "." + musiclist.get(i));

			}
			System.out.print("=================================\n");

			if (number == 1) {

				System.out.print("[1]마지막위치에 추가 [2]원하는 위치에 추가 >> ");
				number = sc.nextInt();
				if (number == 1) {
					System.out.print("추가 할 노래 입력 : ");
					music = sc.next();
					musiclist.add(music);
					System.out.print("추가가 완료되었습니다.\n");
				} else if (number == 2) {

					System.out.print("추가 할 노래 입력 : ");
					music = sc.next();
					System.out.print("추가할 위치 입력 >>");
					number = sc.nextInt();
					musiclist.add(number - 1, music);

				}
      
			} else if (number == 2) {
				System.out.print("[1]선택삭제 [2]전체삭제 >> ");
				number = sc.nextInt();
				if (number == 1) {
					System.out.print("삭제할 노래 선택 >> ");
					number = sc.nextInt();
					String a = musiclist.remove(number - 1);
					System.out.print("노래가 삭제되었습니다.\n");

				} else {
					musiclist.clear();
					System.out.print("전체 list가 삭제되었습니다.\n");
				}

			}

		}

	}

}
