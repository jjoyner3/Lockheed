import java.util.*;

public class AreEuclidingMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            StringTokenizer st = new StringTokenizer(sc.nextLine(),",");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            while(a!=b){
                int temp = a;
                a = Math.max(a,b);
                b = Math.min(temp,b);
                System.out.printf("%d-%d=%d\n",a,b,a-b);
                a = a-b;
            }
            System.out.printf("%d-%d=%d\n",a,b,a-b);
            System.out.println(a==1?"COPRIME":"NOT COPRIME");
        }
        sc.close();
    }
}
