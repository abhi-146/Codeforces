package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Football {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		int max = 0;
		String team = "";
		while(t-- > 0)
		{
			String str = br.readLine();
			
			map.put(str, map.getOrDefault(str, 0) + 1);
			
			if(map.get(str) > max)
			{
				max = map.get(str);
				team = str;
			}
			
		}System.out.println(team);
	}

}
