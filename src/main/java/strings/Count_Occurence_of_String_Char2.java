package strings;

import java.util.HashMap;

public class Count_Occurence_of_String_Char2 {
	
	public static void main(String[] args) {
		
		String str = "rakesh";
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		String[] split = str.split("_");
		
		for(String c : split)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c) + 1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
	}
	
}
