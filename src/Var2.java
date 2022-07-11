
public class Var2 {
	public static void main(String [] args) {
		
		float num=0.0F; //초기값(나중에 쓰더라도 미리 초기화 하기)
		double num2=0.0; //초기값
		num = 2.1234F; //double과 구분하기 위해 F를 붙인다
		num2 = 2.1234;
		
		float num3 = num; //리터럴의 타입이 같아야 저장 가능
		System.out.println(num3);
		
		
		int kor=0;
		int math=0;
		int eng=0;
		int total=kor+math+eng;
		
		kor=50;
		math=50;
		eng=50;
		System.out.println(total); //위에서 아래로 실행되기 때문에 total은 150이 아니라 0
		
		char ch=' '; //초기값
		ch='뀨'; //한 글자만 담을 수 있다
		System.out.println(ch);
		
		boolean check = false; //초기값
		boolean check2 = true;
		check2=false;
		
				
		//변수 선언 공식
		//데이터타입명 변수명
		String name=""; //초기값
		String name2=new String(); //정석 표현
		
		System.out.println('b'); //char타입
		System.out.println('1'); //char타입
		System.out.println("abc"); //String타입
				
	}
}
