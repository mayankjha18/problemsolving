package dp;

import java.util.Arrays;

/*
Longest Common Subsequence
LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.
 */
public class Problem1 {

    public static void main(String[] args) {
        String text1 = "AGGTAB";
        String text2 = "GXTXAYB";
        System.out.println("Length"+longestCommonSubsequence(text1.toCharArray(), text2.toCharArray(), text1.length(), text2.length()));
    }

    public static int longestCommonSubsequence(char[] x, char[] y, int m, int n)
    {
        int[][] arr = new int[m+1][n+1];

        for(int  i=0; i<=m ; i++)
        {
            for(int j=0; j<=n ; j++)
            {
                if(i==0 || j==0)
                {
                    arr[i][j]=0;
                }
                else if(x[i-1]==y[j-1])
                {
                    arr[i][j] =  1 + arr[i-1][j-1];
                }
                else
                {
                   arr[i][j] = arr[i][j-1] > arr[i-1][j] ?  arr[i][j-1] : arr[i-1][j];
                }
            }
        }
//        System.out.println(Arrays.deepToString(arr));
        return arr[m][n];
    }
}
