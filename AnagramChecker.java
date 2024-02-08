//https://lmcodequestacademy.com/problem/anagram-checker
import java.util.*;

public class AnagramChecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String line = sc.nextLine();
            StringTokenizer st = new StringTokenizer(line,"|");
            char[] a = st.nextToken().toCharArray();
            char[] b = st.nextToken().toCharArray();
            boolean sameEqual = Arrays.equals(a, b);
            Arrays.sort(a);
            Arrays.sort(b);
            boolean sortEqual = Arrays.equals(a,b);
            if(!sameEqual && sortEqual){
                System.out.println(line + " = ANAGRAM");
            }else{
                System.out.println(line + " = NOT AN ANAGRAM");
            }
        }
        sc.close();
    }
}