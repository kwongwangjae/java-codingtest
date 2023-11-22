import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// int[] arr = new int[N];

		// StringTokenizer st =new StringTokenizer(br.readLine());
		int time = Integer.parseInt(br.readLine());
		for(int i =0; i< time; i++ ){
			String[] parts = br.readLine().split(" ");
			int num1 = Integer.parseInt(parts[0]);
			int num2 = Integer.parseInt(parts[1]);
			bw.write(String.valueOf(num1 + num2) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}