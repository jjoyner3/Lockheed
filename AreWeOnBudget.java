import java.util.*;
public class AreWeOnBudget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = Integer.parseInt(sc.nextLine());
            StringTokenizer line1 = new StringTokenizer(sc.nextLine());
            StringTokenizer line2 = new StringTokenizer(sc.nextLine());
            double variance = 0;
            for(int i=0; i<n; i++){
                double budget = Double.parseDouble(line1.nextToken());
                double cost = Double.parseDouble(line2.nextToken());
                variance += cost - budget;
            }

            System.out.printf("%.2f\n",variance/n);
            
        }
        sc.close();
    }
}
