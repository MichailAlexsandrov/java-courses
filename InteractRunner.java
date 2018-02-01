import java.util.Scanner;

public class InteractRunner {

	public static void main(String[] arg) {
		
		Scanner reader = new Scanner(System.in);
		try {

			Calculator calc = new Calculator();
			String exit = "no";

			

			while (!exit.equals("yes")) {
				System.out.println("Enter first arg");
				String first = reader.next();
				System.out.println("Enter second arg");
				String second = reader.next();	

			System.out.println("Select the operation: amount/difference/subtraction/multiplication");
			String operation = reader.next();

				if (operation.equals("amount")) {
					calc.add_summ(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result: " + calc.getResult());
				}
				else if (operation.equals("difference")){
					calc.add_dif(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result: " + calc.getResult());	
				}			
				else if (operation.equals("subtraction")){
					calc.add_sub(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result: " + calc.getResult());
				}
				else if (operation.equals("multiplication")){
					calc.add_mul(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result: " + calc.getResult());
				}
				else
				{
					System.out.println("Select does't operation");
				}

				calc.cleanResult();
				System.out.println("Exit: yes/no");
				exit = reader.next();
			}

						
		}

		finally {

			reader.close();
		}
	}
}