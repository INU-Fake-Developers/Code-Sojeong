/* 21.03.08 
 * 3���� ������ �Է��ϸ� ���� ������ ū ���� �����Ͽ� ����ϱ� work1
 * �ۼ���: �ż���
 */

import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("3���� ������ ��ĭ���� �и��Ͽ� �Է��Ͻÿ� : ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt(); // �����б�
		int num2 = scanner.nextInt(); // �����б�
		int num3 = scanner.nextInt(); // �����б�
		
		// case�� �� ���� ������ ���� �� ������; case1
		while(num1<num2) {
			if(num1<num3) {
				if(num2<num3) {
					System.out.println("���� ����� �����ϸ� " + num1 + "," + num2 + "," + num3 + " �Դϴ�.");
				}
				else {
					System.out.println("���� ����� �����ϸ� " + num1 + "," + num3 + "," + num2 + " �Դϴ�.");
				}
			}
			else {
				System.out.println("���� ����� �����ϸ� " + num3 + "," + num1 + "," + num2 + " �Դϴ�.");
			}
		break;
		}
		
		// case�� �� ���� ������ ���� �� ������; case2
		while(num2<num1) {
			if(num2<num3) {
				if(num1<num3) {
					System.out.println("���� ����� �����ϸ� " + num2 + "," + num1 + "," + num3 + " �Դϴ�.");
				}
				else {
					System.out.println("���� ����� �����ϸ� " + num2 + "," + num3 + "," + num1 + " �Դϴ�.");
				}
			}
			else {
				System.out.println("���� ����� �����ϸ� " + num3 + "," + num2 + "," + num1 + " �Դϴ�.");
			}
		break;
		}

	}

}
