package scu;
/* 요구사항
1. 클래스 이름은 본인 이름 이니셜
2. 사칙연산 클래스 : 두 수를 인수로 받아 사칙연산 결과를 출력(+ - * / 메소드)
3. 나눗셈 메소드에서 0으로 나눌때 예외처리
4. 실행 클래스 : 사칙연산 클래스를 상속(두개의 인수를 입력받아 사칙연산 메소드 호출을 통해 결과 출력)



1. 사칙연산을 수행하는 클래스를 생성하고 해당 클래스를 상속하여 사칙연산을 수행하는 프로그램 개발
	1-1. 클래스 이름은 본인의 이니셜 사용 -> JHG
	1-2. 사칙연산 클래스 : 두 수를 인수로 받아 사칙연산 결과를 출력
		덧셈, 뺄셈, 곱셈, 나눗셈
		나눗셈 메소드의 경우 0으로 나누는 경우의 예외처리
	1-3. 실행 클래스 : 사칙연산 클래스를 상속
		실행 시 두개의 인수를 입력받아 사칙연산 메소드 호출을 통해 결과 출력
		학번/이름/일시를 화면에 출력

실행 예
-java jhg 4 2

실행 결과
실행자 : 16054435 지호근
실행일 : 오늘 날짜는 

실행결과
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
				
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();		
				
		scu.cals.output(num1, num2);
		
		System.out.printf("실행자 : 11604435 지호근\n");
		System.out.printf("오늘 날짜는  %tY년 %tm월 %td일\n", new Date(), new Date(), new Date());
				
		System.out.printf("실행결과\n");
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
			System.out.print("0으로 나눌 수 없습니다.");
		}
	
	}
	
}

	