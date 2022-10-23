package DSA_Assesment;

import java.util.HashSet;

import org.junit.Test;

public class VowelsinSubstring {

	/*Given a string s and a number k, 
	 * find the maximum number of vowels in substring of size k.
	String: "workaattech" k: 3
			
			PSEUDOCODE:
			
			- 	declare a set of vowels="a,e,i,o,u,A,E,I,O,U" and vow to count the vowels
			-	declare len=s.length()
			- 	traverse through the given string s till k and find the count of vow
			-	traverse through string from k to len
			- 	find the count and return
			
				Test case
				input s=workaattech k=3
				output maxVowelCount=
	
	*/
	
	private void maxVowelsinString(String s,int k)
	{
		int maxVowelCount=Integer.MIN_VALUE,vow=0;
		int len=s.length();
		HashSet<String> vowels=new HashSet<>();
		for(int i=0;i<k;i++)
		{
			if(vowels.contains(s.charAt(i)))
					{
				vow++;
					}
		}
		
		maxVowelCount=Math.max(maxVowelCount, vow);
		
		for(int i=k;i<len;k++)
		{
			if(vowels.contains(s.charAt(i)))
			{
				vow=;
				
			}
		}
	}
	
	
	
	@Test
	public void test1()
	{
		String s="workaattech";
		int k=3;
		maxVowelsinString(s,k);
	}
	
}
