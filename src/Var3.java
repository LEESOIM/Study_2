import java.util.Scanner;

public class Var3 {
	public static void main(String [] args) {
		//클래스의 첫 글자는 대문자
		//변수의 첫 글자는 소문자

		System.out.println("Start");
		
		//키보드와 연결
		Scanner sc = new Scanner(System.in);

		int gion=0;
		//자동완성 sysout Ctral+Space
		System.out.println("현재 온도를 입력하세요."); 
		gion = sc.nextInt();
		
		double cheon=0.0;
		System.out.println("현재 체온을 입력하세요.");
		cheon=sc.nextDouble();
		
		String name="";
		System.out.println("이름을 입력하세요.");
		name=sc.next(); //문자열 받을때는 next(), nextLine()
		
		System.out.print("현재 온도는 ");
		System.out.println(gion);
		System.out.print("현재 체온은 ");
		System.out.println(cheon);
		System.out.print("마이 네임 이즈 ");
		System.out.println(name);
		
		
		System.out.println("Finish");
	}
}
