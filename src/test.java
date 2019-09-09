import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class test {
	
	//bubble sort also
	
	public static void main(String[] args) {
		test t = new test();
		t.array();
		t.arrList();
		t.Stak();
		t.hMap();
	}
	
	
	public void array(){
		System.out.println("array");
		//declare & initialize
		String[] arr = new String[3];
		
		//add to data structure
		arr[0] = "a";
		arr[1] = "b";
		arr[2] = "c";
		
		//access element
		System.out.println(arr[0]);
		
		//loop through
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public void arrList(){
		System.out.println("array list");
		//declare & initialize
		ArrayList<String> arrList = new ArrayList<>();
		
		//add to data structure
		arrList.add("a");
		arrList.add("b");
		arrList.add("c");
		
		//access element
		System.out.println(arrList.get(0));
		
		//loop through
		for(int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
	}
	
	public void Stak(){
		System.out.println("stack");
		//declare & initialize
		Stack<String> stak = new Stack<>();
		
		//add to data structure
		stak.push("a");
		stak.push("b");
		stak.push("c");
		
		//access element
		System.out.println(stak.pop());
		
		stak.push("c");
		
		//loop through
		while(stak.size() > 0) {
			System.out.println(stak.pop());
		}
	}
	
	public void hMap(){
		System.out.println("hash map");
		//declare & initialize
		HashMap<Integer,String> hMap = new HashMap<>();
		
		//add to data structure
		hMap.put(1, "a");
		hMap.put(2, "b");
		hMap.put(3, "c");
		
		//access element
		System.out.println(hMap.get(1));
		
		//loop through
		for(int i : hMap.keySet()) {
			System.out.println(i + ", " + hMap.get(i));
		}
	}
}
