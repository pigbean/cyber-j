import java.util.Scanner; 
import java.util.Date;

class Jhg extends Cals
{

	private static Scanner sc;

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);		
				
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();		
		
	
		System.out.printf("실행자 : 11604435 지호근\n");
		System.out.printf("오늘 날짜는  %tY년 %tm월 %td일\n", new Date(), new Date(), new Date());
		
		Jhg jhg = new Jhg(); 
		jhg.output(num1, num2); // 사칙연산 실행 Class 호출
							
		System.out.printf("\n실행결과\n");
		System.out.printf("1. %d + %d : %d\n", num1, num2, sum);
		System.out.printf("2. %d - %d : %d\n", num1, num2, minu);
		System.out.printf("3. %d * %d : %d\n", num1, num2, multi);
		System.out.printf("4. %d / %d : %s\n", num1, num2, div);
		
	}

}

class Cals //사칙연산 실행 Class
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
		catch(ArithmeticException ae) // 예외처리 
		{
			System.out.print("0으로 나눌 수 없습니다. 다시 실행해주세요");
			System.exit(0); // 0으로 나누기 실행 시 계산없이 종료
		}
	
	}
	
}

	