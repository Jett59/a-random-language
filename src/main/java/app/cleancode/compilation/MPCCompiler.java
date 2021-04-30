package app.cleancode.compilation;

import app.cleancode.compilation.calls.CallRule;

public class MPCCompiler {
private static Rule [] rules = new Rule [] {
	new CallRule()
};

public static void compile (String input) {
	String code = CodeCleaner.clean(input);
	String [] lines = code.split(";");
	for (int i = 0; i < lines.length; i++) {
		String s = lines [i];
		eval (s, i);
	}
}
public static void eval (String line, int lineNumber) {
	Statement result = null;
	for (Rule rule : rules) {
		if ((result = rule.handler.handle(line)) != null) {
			break;
		}
	}
	if (result == null) {
		System.out.printf("Error: unknown statement %s; on line %d\n", line, lineNumber + 1);
	}
}
}
