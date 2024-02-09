
//https://lmcodequestacademy.com/problem/hello-world
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
