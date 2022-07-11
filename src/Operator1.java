
public class Operator1 {
	public static void main(String [] args) {
		
		int count = 0;
		count = count + 1; //1
		count = count + 1; //2
		
		
		
		
		count = 0;
		++count; //선행(우선수위 높음) count+1
		count++; //후행(우선순위 낮음) count+1
		
		System.out.println(++count); //3 
		System.out.println(count++); //3 -> 프린트를 먼저 출력하고 나중에 1 증가 시켜라
		System.out.println(count); //4
		
		
		
				
		count = 0;
		int result = ++count;
		System.out.println(count); //1
		System.out.println(result); //1
		
		result = count++; // result에 값을 먼저 대입 하고, 후에 count 1 증가 시켜라
		System.out.println(count); //2
		System.out.println(result); //1
		
		
		
		
		result = result-4;
		result-= 4;
		
	}
}
