package Assignment_5;

public class Palindromic_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Axis_Orbit("naan"));
	}


// Axis-Orbit (Optimized Approach)
// O(N^2)

	public static int Axis_Orbit(String s) {
		int odd = 0;
		for (int axis = 0; axis < s.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
				if(s.charAt(axis - orbit) != s.charAt(axis + orbit)) {
					break;
				}
				odd++;
			}
		}
		
		int even = 0;
		for (double axis = 0.5; axis < s.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
				if(s.charAt((int)(axis - orbit)) != s.charAt((int)(axis + orbit))) {
					break;
				}
				even++;
			}
		}
		
		return odd + even;
		
	}
	
}	


// BruteForce Approach
// O( N^3 )

//		String s = "aaa";
//		int cnt = 0;
//
//        for(int i = 0; i < s.length(); i++){
//            for(int j = i; j < s.length(); j++){
//            	if(isPalindrome(s, i, j));
//            	cnt++;
//            }
//        }
//        
//        System.out.println(cnt);
//    }
//
//    public static boolean isPalindrome(String s, int i, int j){
//        while(i < j){
//            if(s.charAt(i) != s.charAt(j)){
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
//    }
		
