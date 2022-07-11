
public class Var6 {
	public static void main(String [] args) {
		System.out.println("Start");
		
		//선언&초기화
		int num1=10;
		long num2=20L;
		
		//형변환(Cascading)
		num1 = (int)num2; //강제형변환: long타입(8바이트)을 int타입(4바이트)으로 잘라서 변환하겠다
		System.out.println(num1);
		
		num2 = num1; //자동형변환: 작은 타입에서 큰 타입으로 변환할 때는 자동 바이트 추가
		System.out.println(num2);
		
		
		//byte(1) < short(2) < char(2) < int(4) < long(8) < float(4) < double(8)
		char ch='a';
		System.out.println(ch);
		
		num1=ch; //자동형변환: int(4) > char(2)
		System.out.println(num1);
		
		num2=num1; // long(8) > int(4)
		System.out.println(num2);
		
		float f = num2; //자동형번환??????? float(4) > long(8)
		//1.000000001 소수점은 근사치 1로 생각
		//float은 표현 범위가 더 크기 때문에 더 큰 타입으로 들어간다
		System.out.println(f);

		
	
		
		
		
		int k=35;
		int m=35;
		int e=37;
		int t=k+m+e;

		int v = t/3;	
		double v2 = t/3;
		double v3 = (double)t/3; //둘 중 하나를 더블로 변환
		double v4 = t/3.0;
		
		System.out.println(t);
		System.out.println(v); //35
		System.out.println(v2); //35.0
		System.out.println(v3); //35.666666666666664
		System.out.println(v4); //35.666666666666664
		
		//문자를 숫자로 변환
		num1 = 'a';
		System.out.println(num1);
		num1 = 'b';
		System.out.println(num1);
		num1 = 'z';
		System.out.println(num1);
		
		//숫자를 문자로 변환
		char c = (char)85480030;
		System.out.println(c);
		
		
		System.out.println("Finish");
	}
}
