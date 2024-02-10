//https://lmcodequestacademy.com/problem/autocorrect
import java.util.*;

public class Autocorrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int d = sc.nextInt();
            int w = sc.nextInt();
            sc.nextLine();
            String[] dic = new String[d];
            for(int i=0; i<d; i++){
                dic[i] = sc.nextLine();
            }
            String[] words = new String[w];
            for(int i=0; i<w; i++){
                words[i] = sc.nextLine();
            }
            for(int a=0; a<words.length; a++){
                int minHam = Integer.MAX_VALUE;
                int ans = -1;
                for(int b=0; b<dic.length; b++){
                    if(words[a].length()!=dic[b].length()) continue;
                    else {
                        int z = findHam(words[a], dic[b]);
                        if(z < minHam){
                            minHam=z;
                            ans = b;
                        }
                    }
                }
                System.out.println(dic[ans]);
            }

        }
        sc.close();
    }

    public static int findHam(String x, String y){
        int ham = 0;
        for(int i=0; i<x.length(); i++){
            if(x.charAt(i)!=y.charAt(i)) ham++;
        }
        return ham;
    }
}
