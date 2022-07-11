import java.util.Scanner;

public class Var9 {
	public static void main(String [] args) {
		System.out.println("편의점 계산 자동화 프로그램");
		
		Scanner sc = new Scanner(System.in);
		
		//물건 가격의 총합계
		int price = 0;
		System.out.println("물건 가격을 입력하세요");
		price = sc.nextInt();
		
		//손님이 낸 돈
		int money = 0;
		System.out.println("손님이 낸 돈을 입력하세요");
		money = sc.nextInt();
		
		//잔돈
		int jandon = money - price; //15500
		System.out.println("잔돈 : "+jandon+" 원");
		
		//만원짜리 갯수를 담을 변수
		int man = jandon / 10000;
		System.out.println("만원 " + man + "개");
				
		//천원짜리 갯수를 담을 변수
		int chon = jandon % 10000 / 1000;
		System.out.println("천원 " + chon + "개");
			
		//백원짜리 갯수를 담을 변수
		int back = jandon % 1000 / 100;
		System.out.println("백원 " + back + "개");
		
		//십원짜리 갯수를 담을 변수
		int sib = jandon % 100 / 10;
		System.out.println("십원 " + sib + "개");
				
		System.out.println("Finish");
	}

}
