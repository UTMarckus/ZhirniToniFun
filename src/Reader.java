import java.util.Scanner;

public class Reader {
	int i, k;
	
	public void Scan() {
		System.out.println("Введите первое число");
		Scanner scn = new Scanner(System.in);
		i = scn.nextInt();
		System.out.println("Введите второе число");
		k = scn.nextInt();
	}
}
