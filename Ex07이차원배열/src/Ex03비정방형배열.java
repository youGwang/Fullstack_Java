import java.util.Scanner;

public class Ex03비정방형배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[4][];

		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[4];
		arr[3] = new int[6];

		int score = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "반 점수 입력\n");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((i + 1) + "반" + (j + 1) + "번쨰 학생 점수 >> ");
				score = sc.nextInt();
				arr[i][j] = score;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "반>> ");
			int sum = 0;
			double avg = 0;
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				sum = sum + arr[i][j];
				avg = (double) sum / arr[i].length;

			}
			System.out.println("\n총점 : " + sum + " 평균 : " + avg + "\n");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
