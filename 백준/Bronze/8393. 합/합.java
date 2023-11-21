import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int hap = 0;

		for(int i =1; i<=T; i++){
			hap += i;
		}
		System.out.println(hap);


	}
}