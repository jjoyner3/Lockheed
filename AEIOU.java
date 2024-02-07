import java.util.Scanner;

public class AEIOU{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            char[] line = sc.nextLine().toLowerCase().toCharArray();
            int count = 0;
            for(char c : line){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}