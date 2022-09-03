
// Введите первое число:
// 5
// Введите второе число:
// 10
// Введите желаемую операцию
// *
// Результат: 50
// Хотите продолжить?
// Нет
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while (flag == true) {
			System.out.println("Введите первое число: ");
			int num1 = sc.nextInt();
			System.out.println("Введите второе число: ");
			int num2 = sc.nextInt();
			System.out.println("Введите желаемую операцию: ");
			String sim = sc.next();
			if (sim.equals("+")) {
				System.out.println("Результат: " + (num1 + num2));
			}
			else if (sim.equals("-")) {
				System.out.println("Результат: " + (num1 - num2));
			}
			else if (sim.equals("*")) {
				System.out.println("Результат: " + (num1 * num2));
			}
			else if (sim.equalsIgnoreCase("/")) {
				System.out.println("Результат: " + (num1 / num2));
			}
			System.out.println("Хотите продолжить? no/yes");
			String answer = sc.next();
			if(answer.equalsIgnoreCase("no")){
				flag = false;
			}
		}
		sc.close();
	}
}