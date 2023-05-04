package 탐색;

import java.util.Arrays;

public class Ex02이진탐색 {

	public static void main(String[] args) {

		int[] arr = {1,7,16,25,30,33,41,66,78,90};
	      
	      //lowIndex : 최소 Index값
	      int lowIndex=0;
	      //highIndex :배열이 가지는 최대 Index값
	      int highIndex=arr.length-1;
	      
	      //내가 찾고 싶은 숫자를 하나 정해주자
	      int num=66;
	      while(true) {
	         //middleIndex를 초기화 시킴
	         int middleIndex = (lowIndex + highIndex)/2;
	         //현재 보고있는 배열 구역의 센터 인덱스 값을 초기화 
	         if(arr[middleIndex] == num) {
	            System.out.println(middleIndex);
	            break;
	         }
	         else {
	            //arr[middleIndex] != num 일때
	            //arr[middleIndex] 보다 작은지 큰지 판단하고
	            //lowIndex값과, highIndex값을 다시 설정
	            if(arr[middleIndex] > num) {
	               highIndex = middleIndex-1;
	            }else {
	               //arr[middleIndex]<num
	               lowIndex = middleIndex +1;
	            }
	         }
	      }
		
	}

}
