package scu;
/* �䱸����
1. Ŭ���� �̸��� ���� �̸� �̴ϼ�
2. ��Ģ���� Ŭ���� : �� ���� �μ��� �޾� ��Ģ���� ����� ���(+ - * / �޼ҵ�)
3. ������ �޼ҵ忡�� 0���� ������ ����ó��
4. ���� Ŭ���� : ��Ģ���� Ŭ������ ���(�ΰ��� �μ��� �Է¹޾� ��Ģ���� �޼ҵ� ȣ���� ���� ��� ���)



1. ��Ģ������ �����ϴ� Ŭ������ �����ϰ� �ش� Ŭ������ ����Ͽ� ��Ģ������ �����ϴ� ���α׷� ����
	1-1. Ŭ���� �̸��� ������ �̴ϼ� ��� -> JHG
	1-2. ��Ģ���� Ŭ���� : �� ���� �μ��� �޾� ��Ģ���� ����� ���
		����, ����, ����, ������
		������ �޼ҵ��� ��� 0���� ������ ����� ����ó��
	1-3. ���� Ŭ���� : ��Ģ���� Ŭ������ ���
		���� �� �ΰ��� �μ��� �Է¹޾� ��Ģ���� �޼ҵ� ȣ���� ���� ��� ���
		�й�/�̸�/�Ͻø� ȭ�鿡 ���

���� ��
-java jhg 4 2

���� ���
������ : 16054435 ��ȣ��
������ : ���� ��¥�� 

������
1. 4 + 2 = 6
2. 4 - 2 = 2
3. 4 * 2 = 8
4. 4 / 2 = 2
 */

import java.util.Scanner; 
import java.util.Date;

class jhg extends cals
{

	private static Scanner sc;

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);		
				
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();		
				
		scu.cals.output(num1, num2);
		
		System.out.printf("������ : 11604435 ��ȣ��\n");
		System.out.printf("���� ��¥��  %tY�� %tm�� %td��\n", new Date(), new Date(), new Date());
				
		System.out.printf("������\n");
		System.out.printf("1. %d + %d : %d\n", num1, num2, sum);
		System.out.printf("2. %d - %d : %d\n", num1, num2, minu);
		System.out.printf("3. %d * %d : %d\n", num1, num2, multi);
		System.out.printf("4. %d / %d : %s\n", num1, num2, div);
		
	}

}

class cals
{
	
	static int sum;
	static int minu;
	static int multi;
	static double div;
	
	
	public static void output(int i, int j)
	{
		try
		{
			sum = i + j;
			minu = i - j;
			multi = i * j;
			div = i / j;
		}
		catch(ArithmeticException ae)
		{
			System.out.print("0���� ���� �� �����ϴ�.");
		}
	
	}
	
}

	