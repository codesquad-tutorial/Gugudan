import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		System.out.println("Enter a times : ");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] splitInput = inputValue.split(",");
		
		for(int i = 0; i < splitInput.length; i++ ) {
			int[] result = Gugudan.calculate(Integer.parseInt(splitInput[i]));
			Gugudan.print(result);
		}
		
	}
}

