import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T--!=0) {
            int n = scan.nextInt();

            int a=0, b=0;

            for (int i = 2; i <= n/2; i++) {
                if (prime(i)&&prime(n-i)) {
                    a = i;
                    b = n-i;
                }
            }
            System.out.println(a+" "+b);
        }
    }

    public static boolean prime(int a) {
        int std = (int) Math.sqrt(a);

        if (a==2||a==3)
            return true;
        for (int i=2; i<=std ;i++){
            if(a%i==0)
                return false;
            if(i==std) {
                return true;
            }
        }
        return false;
    }
}