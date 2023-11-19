import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int time = sc.nextInt();

		for(int i = 0; i < time; i++){
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			int result = 0;
			double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));


			if(x1 == x2 && y1 == y2 && r1 == r2 ){
				result = -1;
			} else if (r1 + r2 == d) {
				result = 1;
			} else if (Math.abs(r1 - r2) == d) {
				result = 1;
			} else if (Math.abs(r1 - r2) < d && d < r1 + r2) {
				result = 2;
			}else {
				result = 0;
			}
			System.out.println(result);
			
		}


	}

}