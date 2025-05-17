package Lec36;

import java.io.PipedOutputStream;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Meeting_Rooms_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = { {9,30}, {5,10}, {15,20}, {6,9} };
		
//		Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
//		for (int i = 0; i < intervals.length; i++) {
//			for (int j = 0; j < intervals[0].length; j++) {
//				System.out.print(intervals[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		System.out.println(minMeetingRooms(intervals));
	}
	
	public static int minMeetingRooms(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
		
//		int room = 1;
		pq.add(intervals[0]);
		for (int i = 1; i < intervals.length; i++) {
			if(intervals[i][0] >= pq.peek()[1]) {
				pq.poll();
				pq.add(intervals[i]);
			}
			else {
				pq.add(intervals[i]);
//				room++;
			}
		}
		return pq.size();
		
	}
	
	
}
