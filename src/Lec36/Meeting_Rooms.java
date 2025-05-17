package Lec36;

import java.util.*;

public class Meeting_Rooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] intervals = {{0, 30},{5, 10},{15, 20}};
		int[][] intervals = {{7, 10}, {2, 4}};
		
		System.out.println(attendMeetings(intervals));
	
	}
	
	public static boolean attendMeetings(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
		
		pq.add(intervals[0]);
		for (int i = 1; i < intervals.length; i++) {
			if(intervals[i][0] >= pq.peek()[1]) {
				pq.poll();
				pq.add(intervals[i]);
			}
			else {
				return false;	
			}
		}
		return true;
	}
}
