package strings;

import java.util.HashMap;

public class Count_Occurence_of_String_Char {

	
	
	public static void main(String[]args)
	{
		String str = "rakesh.kannan0202";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] charArray = str.toCharArray();
		
		for(char c: charArray)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+ 1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
