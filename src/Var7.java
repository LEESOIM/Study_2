
public class Var7 {
	public static void main(String [] args) {
		int age=20;
		String name="Soim";
		System.out.println("나는야 "+name+", 나이는 "+age);
		
		System.out.println(1+1); //2
		System.out.println(1+"1"); //11
		System.out.println(1+1+"1"); //21
		System.out.println("1"+1+1); //111
		System.out.println(1+'1');//50 : char(2)가 int(4) 타입으로 자동형변환된다
		
		
		int count = 32;
		int ex = count % 5; // % 는 나머지 구하는 연산자
		System.out.println(ex);
		
	}
}

