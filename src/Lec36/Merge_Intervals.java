package Lec36;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Merge_Intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
		
	}
	
	public static int[][] mergeIntervals(int[][] intervals){
		Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
		PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
		PriorityQueue<int[]> pq1 = new PriorityQueue<>((a,b) -> a[1] - b[1]);
		
		pq.add(intervals[0]);
		for (int i = 1; i < intervals.length; i++) {
			if(intervals[i][0] <= pq.peek()[1]) {
				pq1.add(pq.poll());
				pq.add(intervals[i]);
			}
			else {
				pq1.add(pq.poll());
				
			}
		}
	}

}
