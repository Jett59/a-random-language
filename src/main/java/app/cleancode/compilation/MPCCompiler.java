package app.cleancode.compilation;

public class MPCCompiler {
private static Rule [] rules = new Rule [] {
	
};

public static void compile (String input) {
	String code = CodeCleaner.clean(input);
	System.out.println(code);
}
}
