import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();

		if(min - 45 <0){
			--hour;
			if(hour < 0){
				hour = 24 - Math.abs(hour);
			}
			min = 60 - Math.abs(min - 45);
		} else if (min - 45 >=0) {
			min = min - 45;
		}
		System.out.printf("%d %d", hour,min);
	}
}