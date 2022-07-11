
public class Var1 {
	public static void main(String [] args) {
		//변수 선언 공식
		//데이터타입 변수명
		byte num;
		//대입 연산자 왼=오 : 오른쪽의 결과를 왼쪽에 대입하라
		num=10;
		System.out.println(num);
		num=35;
		System.out.println(num);
		//num=3000000; <<에러  
		//byte는 -128~127만 담을 수 있다
		
		int num2; //int는 -20억~20억
		num2=2000000000;
		
		long num3;
		num3=9200000000000000000L; //int와 구분하기 위해 L을 붙인다

		byte num4=100+10;
		//num4=num4+10;	<<에러
		//리터럴의 정수형 숫자는 대부분 int를 사용
		
		
		
		
		long num5=100L; //long 8바이트 메모리를 확보 하고 시작점을 num5로 해서 100을 담아라
		//long num5=2L;	<<에러 중복선언
		
		
		
		
		
		//선언
		int num6;
		
		//초기화(값을 대입)
		//모든 변수는 선언만 하고 초기화 하지 않으면 에러 발생
		num6=10;
		
		
		//선언과 초기화를 동시에 가능
		//에러를 방지 하기 위해 0으로 미리 초기화
		int num7=0;
		
	}
}
