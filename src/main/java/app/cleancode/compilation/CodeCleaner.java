package app.cleancode.compilation;

public class CodeCleaner {
public static String clean (String code) {
	return removeTabs (removeLineFeeds (code));
}
public static String removeLineFeeds (String code) {
	return code.replace("\n", "").replace("\r", "");
}
public static String removeExcludingQuotes (String code, String pattern) {
	String result = "";
	for (int i = 0; i < code.length(); i++) {
		if (code.charAt(i) == '"') {
			result = result + code.charAt(i);
			i ++;
			for (; code.charAt(i) != '"'; i ++) {
				result = result + code.charAt(i);
			}
			result = result + code.charAt(i);
			i ++;
		}else if (code.substring(i).startsWith(pattern)) {
			continue;
		}else {
		result = result + code.charAt(i);
	}
	}
	return result;
}
public static String removeTabs (String code) {
	return removeExcludingQuotes(code, "\t");
}
}
