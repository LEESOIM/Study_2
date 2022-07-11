import java.util.Scanner;

public class Var5 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자(정수)를 5번 입력하세요.");
		
		int a = 0;
		int sum = 0;
		
		a = sc.nextInt();
		sum = sum+a;

		a = sc.nextInt();
		sum = sum+a;

		a = sc.nextInt();
		sum = sum+a;

		a = sc.nextInt();
		sum = sum+a;

		a = sc.nextInt();
		sum = sum+a;
		
		System.out.println("입력한 숫자의 총 합은 "+sum);
		
	}
}
