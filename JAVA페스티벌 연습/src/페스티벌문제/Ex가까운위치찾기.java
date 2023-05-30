package 페스티벌문제;

public class Ex가까운위치찾기 {

	public static void main(String[] args) {

		// 문제에있는 숫자가 담긴 point라는 배열 선언 및 초기화
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		// 가장 거리가 가까운(최솟값) 인덱스 값을 찾아줘야한다.
		// 1. 기준값 만들기 point[0] - point[1]
		// Math.abs(point[0]-point[1])
		int min = Math.abs(point[0] - point[1]);

		// 배열의 인덱스 위치를 알수 있는 변수 : 2개
		int a = 0;
		int b = 0; // 인덱스 값 2개 저장할 공간 : 가까운 거리를 가진

		// 비교해서 가까운 거리를 찾아라
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {

				// i랑 j랑 같은 숫자가 아닐떄 아래 코드가 실행되게 만들자
				if (i != j) {
					if (Math.abs(point[i] - point[j]) < min) {
						min = Math.abs(point[i] - point[j]);
						a = i;
						b = j;
					}
				}

			}
		}
		// 단, 자기 자신과 비교하면 값이 0이 나옴
		System.out.println("result = [" + a + "," + b + "]");
	}

}
