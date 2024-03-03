import java.util.*;

class Main {
    StringBuilder process = new StringBuilder();
    int count = 0; 

    public void hanoi(int n, int from, int to, int aux) {
        if (n == 1) {
            process.append(from).append(" ").append(to).append("\n");
            count++; 
            return;
        }

        hanoi(n - 1, from, aux, to);

        process.append(from).append(" ").append(to).append("\n"); 
        count++;

        hanoi(n - 1, aux, to, from);
    }

    public String solution(int n) {
        hanoi(n, 1, 3, 2); 
        return count + "\n" + process.toString(); 
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        System.out.println(T.solution(num));
    }
}
