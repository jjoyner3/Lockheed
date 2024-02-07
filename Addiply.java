//https://lmcodequestacademy.com/problem/addiply
import java.util.Scanner;

public class Addiply{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("%d %d\n",a+b, a*b);
        }
        sc.close();
    }
}