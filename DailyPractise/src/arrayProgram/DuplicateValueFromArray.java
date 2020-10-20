package arrayProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateValueFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = { "Java", "Python", "Java", "QA", "RCODE" };

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j]))

				{
					System.out.println("Duplicate Value :" + str[i]);
				}
			}
		}

		HashSet<String> hs = new HashSet<String>();

		for (String elem : str) {
			if (hs.add(elem) != true) {
				System.out.println("Duplicate value:- " + elem);
			}
		}

		List<String> ls = Arrays.asList(str);
		List<String> finalresult = ls.stream().distinct().collect(Collectors.toList());
		System.out.println(finalresult);
		
		
	}
}