import java.util.Scanner;

public class Gugudan {
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		// 구구단
		for(int i = 1; i < 10; i++) {
			int[] result = calculate(i);
			print(result);
		}
		
		
//		int[] result = new int[9];
//		for(int i = 0; i < result.length; i++) {
//			result[i] = 2 * (i + 1);
//		}
//
//		for(int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
		
		
		
		// for 문 
//		for(int i = 1; i < 10; i++) {
//			System.out.println(i + "단 ");
//			
//			for(int j = 1; j < 10; j++) {
//				String result = i+" * "+ j +" = " + i * j;
//				System.out.println(result);
//			};
//		};
		
		// while 문 
//		int i = 0;
//		
//		while(i < 10) {
//			i++;
//			System.out.println(5 * i);
//		}
		
		// use scanner object
//		System.out.println("몇 단을 출력할까요? : ");
//		Scanner scanner = new Scanner(System.in);
//		
//		int number = scanner.nextInt();
//		
//		if(number < 2) {
//			System.out.println("입력 값은 2 이상만 가능합니다.");
//		} else if (number > 9 ) {
//			System.out.println("입력 값은 9 이하만 가능합니다.");
//		} else {
//			System.out.println(number + "단 ");
//			for(int i = 1; i < 10; i++) {
//				String result = number+" * "+ i +" = " + number * i;
//				System.out.println(result);
//			};
//		}

		
		
	}
}
