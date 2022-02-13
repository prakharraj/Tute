package recursion;

import java.util.Arrays;

public class Main {

    static int[] ans = new int[10];


    public static void main(String args[]) {

        String s = "abc";
       //permutationFind(s, "");
        //printFibo(9);
       // Arrays.stream(ans).forEach(n->System.out.print(n+", "));
       System.out.println(facto(4));
    }

    public static void permutationFind(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        String out1 = output;
        String out2 = output + input.charAt(0);

        permutationFind(input.substring(1), out1);
        permutationFind(input.substring(1), out2);
    }
    static int printFibo(int n){
        if(n==0)
            return ans[0]=0;
        if(n==1)
            return ans[1]=1;
        return ans[n] = printFibo(n-1)+printFibo(n-2);
    }

    static int facto(int n){
        if(n==1)
            return 1;
        return facto(n-1)*n;
    }
}

