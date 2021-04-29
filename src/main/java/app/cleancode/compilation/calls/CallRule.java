package app.cleancode.compilation.calls;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import app.cleancode.compilation.Rule;

public class CallRule extends Rule implements Rule.Handler {
private Pattern pattern;

	public CallRule() {
		super("^\\s*(\\S+?)\\s*\\((.*)\\)\\s*$");
		pattern = Pattern.compile(super.pattern);
		super.handler = this;
	}

	public void handle(String line) {
		Matcher matcher = pattern.matcher(line);
		System.out.println("checking "+line);
		if (matcher.find()) {
			String function = matcher.group(1);
			String params = matcher.group(2);
			System.out.printf("%s was called with %s\n", function, params);
		}
	}

}
