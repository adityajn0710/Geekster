package recursion3;

import java.util.ArrayList;
import java.util.List;

public class letterCombinations {
	public List<String> letterCombinations(String str) {
		if (str.equals("")) {
			List<String> result = new ArrayList<>();
			return result;
		}
		return keypadCombi(str);
	}

	public List<String> keypadCombi(String str) {
		if (str.length() == 0) {
			List<String> result = new ArrayList<>();
			result.add("");
			return result;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		List<String> res = keypadCombi(ros);
		List<String> result = new ArrayList<>();
		String key = key(ch);
		for (String s : res) {
			for (int i = 0; i < key.length(); i++) {
				result.add(key.charAt(i) + s);
			}
		}
		return result;
	}

	public static String key(char key) {
		switch (key) {
		case '2':
			return "abc";
		case '3':
			return "def";
		case '4':
			return "ghi";
		case '5':
			return "jkl";
		case '6':
			return "mno";
		case '7':
			return "pqrs";
		case '8':
			return "tuv";
		case '9':
			return "wxyz";
		}
		return "  ";
	}
}
