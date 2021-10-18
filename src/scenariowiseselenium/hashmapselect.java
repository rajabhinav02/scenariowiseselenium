package scenariowiseselenium;

import java.util.ArrayList;
import java.util.HashMap;

public class hashmapselect {

	public static void main (String[] args) {
		
		ArrayList<String> al1 = new ArrayList<>();
		HashMap<String, ArrayList> hm = new HashMap<>();
		
		al1.add("one");
		al1.add("two");
		
		hm.put("great", al1);
		hm.put("super", al1);
		
		System.out.println(hm.get("super"));
	}
	
}
