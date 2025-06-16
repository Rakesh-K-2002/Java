package strings;

import java.util.HashMap;

public class Count_of_Repeated_Letters {
	
	public static void main(String[] args) {
		
		String str = "Hi this is rakesh from chennai";
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		Integer count = 1;
		
		String[] split = str.split(" ");
		
		for(int i=0; i<split.length; i++)
		{
			if(!map.containsKey(split[i]))
			{
				map.put(split[i], count);
			}
			else
			{
				map.put(split[i], count+1);
			}
		}
		
		for(String x : map.keySet())
		{
			System.out.println("Count Of Word: "+x+" = " + map.get(x));
		}
	}
	
}
