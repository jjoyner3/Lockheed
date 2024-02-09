
//https://lmcodequestacademy.com/problem/finding-nimo
import java.util.*;

public class Nimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String line = sc.nextLine();
            StringTokenizer st = new StringTokenizer(line);
            int pos = 1;
            while (st.hasMoreTokens()) {
                if (st.nextToken().equals("Nimo")) {
                    break;
                }
                pos++;
            }
            System.out.println(pos);

        }
        sc.close();
    }
}
