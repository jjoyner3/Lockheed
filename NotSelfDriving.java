
//https://lmcodequestacademy.com/problem/not-so-self-driving
import java.util.*;

public class NotSelfDriving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(sc.nextLine(), ":");
            double speed = Double.parseDouble(st.nextToken());
            double dist = Double.parseDouble(st.nextToken());
            if (speed >= dist)
                System.out.println("SWERVE");
            else if (speed * 5 >= dist)
                System.out.println("BRAKE");
            else
                System.out.println("SAFE");
        }
        sc.close();
    }
}
