package app.cleancode.compilation.calls;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import app.cleancode.compilation.Rule;
import app.cleancode.compilation.Statement;

public class CallRule extends Rule implements Rule.Handler {
private Pattern pattern;

	public CallRule() {
		super("^\\s*(\\S+?)\\s*\\((.*)\\)\\s*$");
		pattern = Pattern.compile(super.pattern);
		super.handler = this;
	}

	public Statement handle(String line) {
		Matcher matcher = pattern.matcher(line);
		if (matcher.find()) {
			String function = matcher.group(1);
			String params = matcher.group(2);
			System.out.printf("%s was called with %s\n", function, params);
			return new CallStatement (function, params);
		}
		return null;
	}

}
