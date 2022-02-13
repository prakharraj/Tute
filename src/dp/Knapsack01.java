package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

class gfg {
    public static void main(String args[]) throws IOException {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        //reading total testcases
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());

            int val[] = new int[n];
            int wt[] = new int[n];

            String st[] = read.readLine().trim().split("\\s+");

            //inserting the values
            for (int i = 0; i < n; i++)
                val[i] = Integer.parseInt(st[i]);

            String s[] = read.readLine().trim().split("\\s+");

            //inserting the weigths
            for (int i = 0; i < n; i++)
                wt[i] = Integer.parseInt(s[i]);

            //calling method knapSack() of class Knapsack
            System.out.println(new SolutionTabulation().knapSack(w, wt, val, n));
        }
    }
}

class SolutionMemo {
    static int knapSack(int W, int wt[], int val[], int n) {
        int t[][] = new int[1002][1002];
        for (int i = 0; i < 1002; i++)
            t[i][i] = t[i][0] = -1;
        return knapSackRecur(W, wt, val, n, t);
    }

    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSackRecur(int W, int wt[], int val[], int n, int t[][]) {
        if (n == 0 || W == 0)
            return 0;
        if (t[n][W] != -1)
            return t[n][W];
        if (wt[n - 1] <= W)
            return t[n][W] = Math.max(knapSackRecur(W - wt[n - 1], wt, val, n - 1, t) + val[n - 1],
                                        knapSackRecur(W, wt, val, n - 1, t));

        else return t[n][W] = knapSackRecur(W, wt, val, n - 1, t);
    }
}

class SolutionTabulation {
    static int knapSack(int W, int wt[], int val[], int n) {
        int t[][] = new int[n + 1][W + 1];

        for (int i = 1; i < n+1; i++)
            for (int j = 1; j < W+1; j++) {

                if (wt[i - 1] <= j)
                    t[i][j]=Math.max(val[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
                else
                     t[i][j]=t[i-1][j];
            }
        return t[n][W];
    }
}