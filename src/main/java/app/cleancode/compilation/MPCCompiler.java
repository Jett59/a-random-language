package app.cleancode.compilation;

import app.cleancode.compilation.calls.CallRule;

public class MPCCompiler {
private static Rule [] rules = new Rule [] {
	new CallRule()
};

public static void compile (String input) {
	String code = CodeCleaner.clean(input);
	String [] lines = code.split(";");
	for (String line : lines) {
		eval (line);
	}
}
public static void eval (String line) {
	for (Rule rule : rules) {
		rule.handler.handle(line);
	}
}
}
