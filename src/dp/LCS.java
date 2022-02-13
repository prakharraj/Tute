package dp;

public class LCS {

    public static void main(String arg[]){

        int t[][] = new int[8][8];
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                 t[i][j] = -1;

        int x = lcs(6,6,"ABCDGH","AEDFHR",t);
        System.out.println(x);

    }

    static int lcs(int n, int m, String x, String y,int [][]t)
    {
        if(n==0 || m==0)
            return 0;
        else if (t[n][m]!=-1)
            return t[n][m];
        else{
            if(x.charAt(n-1)==y.charAt(m-1))
                return t[n][m]=1+lcs(n-1,m-1,x,y,t);
            else
                return t[n][m]=Math.max(lcs(n-1,m,x,y,t),
                        lcs(n,m-1,x,y,t));
        }
    }

    static int lcSubstring(int n, int m, String x, String y,int [][]t)
    {
        if(n==0 || m==0)
            return 0;
        else if (t[n][m]!=-1)
            return t[n][m];
        else{
            if(x.charAt(n-1)==y.charAt(m-1))
                return t[n][m]=1+lcs(n-1,m-1,x,y,t);
            else
                return t[n][m]=0;
        }
    }
}
