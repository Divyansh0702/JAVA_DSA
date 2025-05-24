package Lec38;

public class HashMap_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Raj", 77);
		map.put("Vivek", 57);
		map.put("Ankit", 87);
		map.put("Raju", 77);
		map.put("Ankita", 67);
		map.put("Pooja", 53);
		map.put("Kunal", 55);
		map.put("Ankita", 89);
 	
		System.out.println(map.get("Ankita"));
		System.out.println(map.get("Pooja"));
		
		System.out.println(map);
	}

}
