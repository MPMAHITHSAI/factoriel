package Factorie;
import java.util.*;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(fact(input));

    }

    static int fact(int t) {
        if(t==0){
            return 1;
        }
    
       return fact(t-1)*t;
}
}