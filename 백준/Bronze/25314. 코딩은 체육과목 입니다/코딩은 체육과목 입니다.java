import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Long num = sc.nextLong();
		String answer = "";
		while (num >= 4){
			answer += "long ";
			num -= 4;
		}
		answer = answer + "int";
		System.out.println(answer);


	}
}