package Lec28;

import Lec25.Stack;

public class Dynamic_Stack extends Stack{
		
		@Override
		public void push(int item) throws Exception{
			if(isFull()) {
//				int[] new_arr = new int[2 * arr.length]; since arr is private then it can't be inherit
				int[] new_arr = new int[2 * arr.length]; // arr is protected here in stack.java 
				for (int i = 0; i < arr.length; i++) {
					new_arr[i] = arr[i];
				}
				arr = new_arr;
			}
			super.push(item);
		}
		
		public static void main(String[] args) throws Exception {
			Dynamic_Stack st = new Dynamic_Stack();
			st.push(10);
			st.push(10);
			st.push(20);
			st.push(10);
			st.push(10);
			st.push(40);
			st.push(10);
			st.push(10);
			st.Display();
		}

}
