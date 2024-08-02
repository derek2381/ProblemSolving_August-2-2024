// problem link
// https://codeforces.com/problemset/problem/1840/A


import java.util.*;

public class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine(), res = "";
            
            int s = 0, e = 1;
            while(e < n){
                if(str.charAt(s) == str.charAt(e)){
                    res += str.charAt(s);
                    s = e+1;
                    e = s+1;
                }else{
                    e++;
                }
            }
            
            System.out.println(res);
        }
    }
}