package stringfunctions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] str3 = { 'l', 'i', 's', 't', 'e', 'n','d' };
		char[] str4 = { 's', 'i', 'l', 'e', 'n', 't' };

		if(isAnagram(str3, str4))
			{
			System.out.println("Strings are anagram");
			}
		else
		{
			System.out.println("string are not anagram");
		}

	}

	public static boolean isAnagram(char[] str1, char[] str2) {

		Arrays.sort(str1);
		Arrays.sort(str2);

		int len_s1 = str1.length;
		int len_s2 = str2.length;

		if (!(len_s1 == len_s2)) {
			return false;
		}

		for (int i = 0; i < len_s1; i++) {
			if (str1[i] != str2[i]) {
				return false;
			}

		}
		return true;
	}
}