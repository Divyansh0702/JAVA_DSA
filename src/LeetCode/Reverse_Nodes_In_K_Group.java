package LeetCode;

public class Reverse_Nodes_In_K_Group {

	static class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	
	ListNode head;
	ListNode tail;

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        
        int cnt = 0;
        while(cnt < k){
            if(temp == null){
                return head;
            }
            temp = temp.next;
            cnt++;
        }

        ListNode nextNode = reverseKGroup(temp, k);

        temp = head; cnt = 0;
        while(cnt < k){
            ListNode next = temp.next;
            temp.next = nextNode;
            nextNode = temp;
            temp = next;
            cnt++;
        }
        return nextNode;
    }
    
    
    public static void display(ListNode head) {
    	ListNode temp = head;
    	while(temp != null) {
    		System.out.print(temp.val + "->");
    		temp = temp.next;
    	}
    	System.out.println(".");
    }
    
    public static ListNode createList(int[] arr) {
    	ListNode dummy = new ListNode(0);
    	ListNode current = dummy;
    	
    	for(int num : arr) {
    		current.next = new ListNode(num);
    		current = current.next;
    	}
    	return dummy.next;
    }

	public static void main(String[] args) {
    	 Reverse_Nodes_In_K_Group ll = new Reverse_Nodes_In_K_Group();
    	 
    	 int[] arr = {1,2,3,4,5,6,7};
    	 int  k = 3;
    	 
    	 ListNode list = createList(arr);
    	 display(list);
    	 
    	 ListNode result = ll.reverseKGroup(list, k);
    	 display(result);
     }


}