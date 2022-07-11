import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		//나이를 입력 받아서 10대 유무를 판별
		
		int age = sc.nextInt();
		String result = age >= 10 && age <= 19 ? "10대" : "노10대";
		System.out.println(result);
		
		
		
		
		System.out.println("물건의 가격을 입력하세요");
		//물건의 가격이 30000원 이상이면 배송료 무료
		
		int price = sc.nextInt();
		int result2 = price >= 30000 ? price : (int)(price*1.1); //형변환
		System.out.println("최종 지불비용 : "+result2);
		
	}

}
