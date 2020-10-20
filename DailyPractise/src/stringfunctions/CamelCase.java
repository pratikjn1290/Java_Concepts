package stringfunctions;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hi hi how How Letter letter";

		String words [] = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(String word : words)
		{
			char firstChar = word.charAt(0);
			if(!Character.isUpperCase(firstChar))
			{
				sb.append(Character.toUpperCase(firstChar)).append(word.substring(1)).append(" ");
			}
			else
						sb.append(word.substring(0)).append(" ");
		}
		
			String result = sb.toString().trim();
			System.out.println(result);

	}

}
