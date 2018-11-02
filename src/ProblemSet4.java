/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 p4 = new ProblemSet4();
		/* System.out.println(p4.surroundMe("<<>>", "abc"));
		System.out.println(p4.surroundMe("[[]]", "xyz"));
		System.out.println(p4.surroundMe("abc", "abc"));
		System.out.println(p4.surroundMe("(())", "qwerty")); 
		System.out.println(p4.endsMeet("hello", 2));
		System.out.println(p4.endsMeet("telephone", 3));
		System.out.println(p4.endsMeet("mountain", 2)); 
		System.out.println(p4.middleMan("candy"));
		System.out.println(p4.middleMan("programming"));
		System.out.println(p4.middleMan("even"));
		System.out.println(p4.middleMan("null")); 
		System.out.println(p4.doubleVision("qwerty"));
		System.out.println(p4.doubleVision("a"));
		System.out.println(p4.doubleVision("null")); 
		System.out.println(p4.centered("candy", "and"));
		System.out.println(p4.centered("programming", "ram"));
		System.out.println(p4.centered("qwerty", "qwe"));
		System.out.println(p4.centered("sundae", "nda"));
		System.out.println(p4.centered("sundae", "und")); */
		System.out.println(p4.upOrDown(12.7, 'r'));
		System.out.println(p4.upOrDown(12.2, 'r'));
		System.out.println(p4.upOrDown(12.7, 'f'));
		System.out.println(p4.upOrDown(12.2, 'c'));
		System.out.println(p4.upOrDown(12.7, 'x'));
	}
	
	/**
	 * @surroundMe is a public method that accepts two Strings as input, and
	 * returns a single String as output.
	 * 
	 * Given two Strings, @out and @in, return a new String built by surrounding @in
	 * with the first and last two characters of @out. Return null if the input
	 * specifications are not met.
	 * 
	 * @param out - a 4-character String of the format AABB
	 * @param in - a 3-character String of the format XYZ
	 * 
	 * @return a String constructed from @in and @out of the format AAXYZBB
	 */
	
	public String surroundMe(String out, String in) {
		String result = " ";
		int lengthIn = in.length();
		int lengthOut = out.length();
		if (lengthOut == 4 && lengthIn == 3) {
			String pad1 = out.substring(0, 2);
			String pad2 = out.substring(2, 4);	
			result = pad1 + in + pad2;
				return result;
			} else {
				return null;
			}
	}
	
	/**
	 * @endsMeet is a public method that accepts a String and an integer as input, and
	 * returns a single String as output.
	 * 
	 * Given a String, @str, and an integer, @n, return a new String built by
	 * combining the first @n and last @n characters of @str. Return null if the input
	 * specifications are not met.
	 * 
	 * @param str - a String whose length falls in the range [1, 10]
	 * @param n - an integer no greater than the length of @str
	 * 
	 * @return a String constructed from the first @n and last @n characters of @str
	 */
	
	public String endsMeet(String str, int n) {
		String result = " ";
		int lengthStr = str.length();
		if ((lengthStr > 0 && lengthStr <= 10) && n <= lengthStr) {
			String firstN = str.substring(0, n);
			String lastN = str.substring(lengthStr-n, lengthStr);
			result = firstN + lastN;
			return result;
		} else {
			return null;
		}
	}
	
	/**
	 * @middleMan is a public method that accepts a single String as input, and
	 * returns a single String as output.
	 * 
	 * Given a String whose length is odd, return a 3-character String built from the
	 * 3 middle characters of the original String. Return null if the input
	 * specifications are not met.
	 * 
	 * @param str - a String whose length is odd
	 * 
	 * @return a 3-character String constructed from the middle 3 characters of @str
	 */
	
	public String middleMan(String param) {
		String result = " ";
		int length = param.length();
		if (length % 2 == 1) {
			int offset = ((length % 3) + (((length/3) - 1) * 3)) / 4;
			result = param.substring((offset+1), (length-offset-1));
			while (result.length() != 3) {
				result = result.substring(1, (result.length())-1);
			}
			return result;
		} else {
			return null;
		}
	}
	
	/**
	 * @doubleVision is a public method that accepts a single String as input, and
	 * returns a single String as output.
	 * 
	 * Given a String whose length is at least 1, return a String built from duplicating
	 * every character from the original String. Return null if the input
	 * specifications are not met.
	 * 
	 * @param str - a String whose length is at least 1 in the format ABC
	 * 
	 * @return a String where each character in @str is duplicated in the format AABBCC
	 */
	
	public String doubleVision(String str) {
		String result = "";
		String letter = "";
		if (str.length() >= 1 && str != "null") {
			for (int i = 0; i < str.length(); i++) {
				letter = str.charAt(i) + "";
				for (int j = 0; j < 2; j++) {
					result = result + letter;
				}
			}
			return result;
		} else {
			return null;
		}
	}
	
	/**
	 * @centered is a public method that accepts a single String as input, and
	 * returns a boolean as output.
	 * 
	 * Given a String, determine whether or not a target sequence is in the middle of the
	 * original String. The middle of a String will be defined as follows: the number of
	 * characters the left and right of the target sequence differ by at most 1. Return
	 * false if the input specifications are not met.
	 * 
	 * @param str - a String that contains @target
	 * @param target - a 3-character String of the format ABC
	 * 
	 * @return true if @target is in the middle of @str and false if it is not
	 */
	
	public boolean centered(String str, String target) {
		String center = "";
		String center1 = "";
		String center2 = "";
		if (str != null && target != null && str.length() >= 3 && target.length() == 3) {
			if (str.length() % 2 == 1) {
				center = middleMan(str);
				if (center.equals(target)) {
					return true;
				} else {
					return false;
				}
			} else {
				int removal = (str.length() / 2) - 2;
				center = str.substring(removal, str.length()-removal);
				center1 = center.substring(0,3);
				center2 = center.substring(1,4);
				if (center1.equals(target) || center2.equals(target)) {
					return true;
				} else {
					return false;
				}
			} 
		} else {
			return false;
		}
	}
	
	/**
	 * @upOrDown is a public method that accepts a decimal value and a character as
	 * input, and returns an integer as output.
	 * 
	 * Given a decimal value and a character representing either rounding up (+),
	 * rounding down (-), flooring (f), or ceiling (c), return the result of the
	 * operation as an @int. Return -1 if the input specifcations are not met.
	 * 
	 * @param number - a decimal value
	 * @param operation - a @char in the set [+, -, f, c]
	 * 
	 * @return the result of the operation as an @int
	 */
	
	public int upOrDown(double number, char operation) {
		int result = 0;
		switch (operation) {
		case 'r':
			result = (int) Math.round(number);
			return result;
		case 'f':
			result = (int) Math.floor(number);
			return result;
		case 'c':
			result = (int) Math.ceil(number);
			return result;
		default:
			return -1;
		}
	}
	
	/**
	 * @countMe is a public method that accepts a String and a character as input,
	 * and returns an integer as output.
	 * 
	 * Given a String and a character, count and return the number of words in the
	 * specified String that end in the specified character. For our purposes, the
	 * end of a word will be defined as an alphabetic character followed by whitespace
	 * (i.e., a space, tab, or line break). Return -1 if the input specifcations are
	 * not met.
	 * 
	 * @param text - a sequence of alphabetic and whitespace characters
	 * @param end - a character in the range [Aa-Zz]
	 * 
	 * @return the number of words in @text that end with @end
	 */
	
	public int countMe(String text, char end) {
		if (text != null && isAlphabet(end)) {
			//text.indexOf();
		} else {
			return -1;
		}
	}
	
	public boolean isAlphabet(char letter) {
		if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * @isNotEqual is a public method that accepts a String as input, and
	 * returns a boolean as output.
	 * 
	 * Given a String of text, determine whether the number of case-sensitive appearances
	 * of the word is equals the number of case-sensitive appearances of not. Return
	 * false if the input specifcations are not met.
	 * 
	 * @param str - a String of text containing 0 or more appearances of is and not
	 * 
	 * @return true if the appearances of is == the appearances of not; false otherwise
	 */
	
	// your method signature here
	
	/**
	 * @triplets is a public method that accepts a single String as input, and
	 * returns an integer as output.
	 * 
	 * Given a String of case-insenstive letters, return the number of triplets. A triplet
	 * is defined as a case-sensitive sequence of 3 identical characters in a row. A triplet
	 * can overlap, meanning AAAA counts as 2 triplets. Return -1 if the input
	 * specifcations are not met.
	 * 
	 * @param str - a String of alphabetic letters without whitespace
	 * 
	 * @return the number of triplets in @str
	 */
	
	// your method signature here
	
	/**
	 * @addMe is a public method that accepts a String and a boolean as input, and
	 * returns an integer as output.
	 * 
	 * Given a String, compute and return either the sum of the digits or the sum of the numbers
	 * contained within that String. If @digits is true, then sum the digits individually. If it
	 * is false, sum the numbers. A number is defined as a consecutive series (possibly 1) of
	 * digits in the String. Return -1 if the input specifcations are violated.
	 * 
	 * @param str - a String of alphanumeric text
	 * @param digits - indicates whether to sum the digits or the numbers
	 * 
	 * @return the sum of the digits or numbers as specified by @digits
	 */
	
	// your method signature here
}