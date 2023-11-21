import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int priceRight = 0;
		int num = sc.nextInt();
		for(int i = 0; i<num; i++){
			int product = sc.nextInt();
			int buy = sc.nextInt();
			priceRight += product*buy;
		}
		if(priceRight == price){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}
}