//https://lmcodequestacademy.com/problem/bishops-move
import java.util.Scanner;
import java.util.StringTokenizer;

public class BishopsMove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            StringTokenizer st = new StringTokenizer(sc.nextLine(),",");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(sc.nextLine(),",");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(sc.nextLine(),",");
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            boolean oddEvenStart = (a%2==0) ^ (b%2==0);
            boolean oddEvenEnd = (c%2==0) ^ (d%2==0);
            boolean inBounds = (a>=1 && a<=x) && (b>=1 && b<=y) && (c>=1 && c<=x) && (d>=1 && d<=y);
            System.out.println((oddEvenStart==oddEvenEnd && inBounds) ? "Yes" : "No");
        }
        sc.close();
    }
}
