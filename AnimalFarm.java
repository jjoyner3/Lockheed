//https://lmcodequestacademy.com/problem/animal-farm
import java.util.*;

public class AnimalFarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int turkeys = sc.nextInt();
            int goats = sc.nextInt();
            int horses = sc.nextInt();
            System.out.println(2*turkeys + 4*(goats+horses));
        }
        sc.close();
    }
}
