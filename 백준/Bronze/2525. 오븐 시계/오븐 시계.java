import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();

		while (time + min >= 60){
				++hour;
				if(hour ==24){
					hour = 0;
				}
				time = time - 60;
		}
		System.out.printf("%d %d", hour,min+time);

	}
}