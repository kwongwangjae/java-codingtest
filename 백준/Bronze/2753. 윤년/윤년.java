import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		if(num1 % 400 == 0){
			System.out.println("1");
		} else if (num1 % 4 == 0 && num1 % 100 != 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}