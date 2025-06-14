package Lec44;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		int ans = Integer.MAX_VALUE;
		int[][] dp = new int[matrix.length][matrix[0].length];
		for(int[] a: dp) {
			Arrays.fill(a, -99999);
		}
		
		for (int i = 0; i < matrix[0].length; i++) {
			ans = Math.min(ans, Path_Sum(matrix, 0, i, dp));
		}
		System.out.println(ans);
		
	}
	
	public static int Path_Sum(int[][] matrix, int cr, int cc, int[][] dp) {
		if(cr == matrix.length - 1) {
			return matrix[cr][cc];
		}
		
		if(dp[cr][cc] != -99999) {
			return dp[cr][cc];
		}
		
		int ans = Integer.MAX_VALUE;
		for (int col = 0; col < dp[0].length; col++) {
			if(col == cc) {
				continue;
			}
			ans = Math.min(ans, Path_Sum(matrix, cr + 1, col, dp));
		}
		
		return dp[cr][cc] = ans + matrix[cr][cc];
	}

}
