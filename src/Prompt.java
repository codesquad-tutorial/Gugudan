import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT="cal> ";
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int year = 2018;
		int month = 1;
		int weekday = 0;

		System.out.println("연도를 입력하세요.");
		System.out.print("YEAR> ");
		year = scanner.nextInt();
		
		while(month != -1) {
			
			System.out.println("달을 입력하세요. ");
			System.out.print("MONTH> ");
			month = scanner.nextInt();

//			System.out.println("첫째 날의 요일을 입력하세요.");
//			System.out.print("WEEK> ");
//			weekday = scanner.nextInt();
			
			if(month < 1) {
				runPrompt();
				break;
			}
			if(month > 12) {
				continue;
			}
			cal.printCalendar(year, month);
		}

		System.out.print("Bye~");
		scanner.close();
	}

	public static void main(String[] args) {
		// 쉘 실행

		System.out.print("Hello!\n");
		Prompt p = new Prompt();
		p.runPrompt();
		
	}
}
