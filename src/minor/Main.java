package minor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int[] ans = new int[10];
    public static void main(String args[]){
        printFibo(9);
        Arrays.stream(ans).forEach(System.out::println);
    }
   static int printFibo(int n){
        if(n==0)
            return ans[0]=0;
        if(n==1)
            return ans[1]=1;
         return ans[n] = printFibo(n-1)+printFibo(n-2);
   }
}





class emp extends  addr{

    public void display(String s){
        System.out.println("emp");
    }

}
class addr{
    public void display(){
        System.out.println("addr");

    }
}