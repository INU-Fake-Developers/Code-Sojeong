/* 21.03.08 
 * 3개의 정수를 입력하면 작은 수에서 큰 수로 정렬하여 출력하기 work1
 * 작성자: 신소정
 */

import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("3개의 정수를 빈칸으로 분리하여 입력하시오 : ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt(); // 정수읽기
		int num2 = scanner.nextInt(); // 정수읽기
		int num3 = scanner.nextInt(); // 정수읽기
		
		// case를 두 개로 나누어 가짓 수 나누기; case1
		while(num1<num2) {
			if(num1<num3) {
				if(num2<num3) {
					System.out.println("작은 수대로 나열하면 " + num1 + "," + num2 + "," + num3 + " 입니다.");
				}
				else {
					System.out.println("작은 수대로 나열하면 " + num1 + "," + num3 + "," + num2 + " 입니다.");
				}
			}
			else {
				System.out.println("작은 수대로 나열하면 " + num3 + "," + num1 + "," + num2 + " 입니다.");
			}
		break;
		}
		
		// case를 두 개로 나누어 가짓 수 나누기; case2
		while(num2<num1) {
			if(num2<num3) {
				if(num1<num3) {
					System.out.println("작은 수대로 나열하면 " + num2 + "," + num1 + "," + num3 + " 입니다.");
				}
				else {
					System.out.println("작은 수대로 나열하면 " + num2 + "," + num3 + "," + num1 + " 입니다.");
				}
			}
			else {
				System.out.println("작은 수대로 나열하면 " + num3 + "," + num2 + "," + num1 + " 입니다.");
			}
		break;
		}

	}

}
