import java.util.Scanner;

public class Calculator {

	private static Scanner sacner = new Scanner(System.in);
	
	public static void main(String[] args) {

		while(true) {
			System.out.println("Выберите команду");
			System.out.println("1.Сложение 2.Вычитание 3.Умножение 4.Деление 5.Выход");
			
			int command = sacner.nextInt();
			switch (command) {
				case 1: {
					double[] operands = Input();
					PrintAnswer(Add(operands[0], operands[1]));
					break;
				}
				case 2: {
					double[] operands = Input();
					PrintAnswer(Substract(operands[0], operands[1]));
					break;
				}
				case 3: {
					double[] operands = Input();
					PrintAnswer(Multiply(operands[0], operands[1]));
					break;
				}
				case 4: {
					double[] operands = Input();
					PrintAnswer(Division(operands[0], operands[1]));
					break;
				}
				case 5: {
					System.exit(0);
				}
				default: {
					System.out.println("Нет такой команды");
				}
			}
		}
		
	}
	
	public static double Add(double a, double b) {
		return a + b;
	}
	
	public static double Substract(double a, double b) {
		return a - b;
	}
	
	public static double Multiply(double a, double b) {
		return a * b;
	}
	
	public static double Division(double a, double b) {
		return a / b;
	}
	
	private static double[] Input() {
		
		double[] operands = new double[2];
		
		System.out.print("Введите а:");
		operands[0] = sacner.nextDouble();
		System.out.print("Введите b:");
		operands[1] = sacner.nextDouble();
		
		return operands;
	}
	
	private static void PrintAnswer(double answer) {
		System.out.printf("Ответ: %f\n", answer);
	}
}