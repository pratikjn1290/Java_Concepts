package stringfunctions;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "#$#@$@#$$#Helloo$%#%#$^$^DVHHHH";
		String regex = "[^A-Z a-z]";

		System.out.println(s.replaceAll(regex, ""));

		String s1 = "23213TRYRRRR3434";
		String reg = "[^\\d]";
		System.out.println(s1.replaceAll(reg, ""));
	}
}
