import java.util.Scanner;

public class Var4 {
	public static void main(String [] args) {
		System.out.println("회원가입을 해주세요");
		
		//키보드와 연결
		Scanner sc = new Scanner(System.in);
		
		String id="";
		System.out.println("[아이디]");
		id=sc.next();
		
		String pw="";
		System.out.println("[비밀번호]");
		pw=sc.next();
		
		String name="";
		System.out.println("[이름]");
		name=sc.next();
		
		int birth=0;
		System.out.println("[생년월일]");
		birth=sc.nextInt();
		
		String gender="";
		System.out.println("[성별]");
		gender=sc.next();
		
		String email="";
		System.out.println("[이메일]");
		email=sc.next();
				
		
		System.out.print("아이디 : ");
		System.out.println(id);
		System.out.print("비밀번호 : ");
		System.out.println(pw);
		System.out.print("이름 : ");
		System.out.println(name);
		System.out.print("생년월일 : ");
		System.out.println(birth);
		System.out.println("성별 : "+ gender);
		System.out.println("이메일 : "+ email);
		
		System.out.println(name+"님 회원가입이 완료 되었습니다.");
	}
}
