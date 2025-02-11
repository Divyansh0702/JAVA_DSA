package Practice;
import java.util.*;

public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {2, 3, 6, 7};
		int target = 7;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Combination(candidates, target, ll, ans, 0);
		System.out.println(ans);
	}
	
	public static void Combination(int[] candidates, int target, List<Integer> ll, List<List<Integer>> ans, int idx) {
		if(target == 0) {
//			System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = idx; i < candidates.length; i++) {
			if(target >= candidates[i]) {
				ll.add(candidates[i]);
				Combination(candidates, target - candidates[i], ll, ans, i);
				ll.remove(ll.size() - 1); 
			}
		}
	}

}
