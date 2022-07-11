import java.util.Scanner;

public class Var8 {
	public static void main(String [] args) {
		System.out.println("Start");
		
		//암호화 연산식
		//0 -> 0
		//1 -> 1
		//2 -> 2
		//3 -> 3
		//4 -> 10
		//5 -> 11
		//6 -> 12
		//7 -> 13
		//8 -> 20
		//9 -> 21
		//10 -> 22
		//11 -> 23
		
		
		int input=0;
		int output=0;
		
		Scanner sc = new Scanner(System.in);
		
		input=sc.nextInt();
		output = input / 4 * 10 + input % 4;
		System.out.println(output);
		
		System.out.println("Finish");
	}
}
