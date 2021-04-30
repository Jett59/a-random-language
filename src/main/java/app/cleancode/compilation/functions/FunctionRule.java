package app.cleancode.compilation.functions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import app.cleancode.compilation.Rule;
import app.cleancode.compilation.Statement;

public class FunctionRule extends Rule implements Rule.Handler {
private Pattern pattern;

	public FunctionRule () {
		super("^\\s*([a-z]+?)\\s+(\\S+?)\\s+(\\S+?)\\s*\\((.*?)\\)\\s*\\{(.*?)$");
		this.pattern= Pattern.compile(super.pattern);
		super.handler = this;
	}

	@Override
	public Statement handle(String line) {
		Matcher matcher = pattern.matcher(line);
		if (matcher.find()) {
			String visibility = matcher.group(1);
			String type = matcher.group(2);
			String name = matcher.group(3);
			String params = matcher.group(4);
			System.out.printf("function %s is %s, returns a %s and takes [%s] as arguments\n", name, visibility, type, params);
			return new FunctionStatement(visibility, type, name, params);
		}
		return null;
	}

}
