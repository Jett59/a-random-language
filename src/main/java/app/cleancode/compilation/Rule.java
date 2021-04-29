package app.cleancode.compilation;

public class Rule {
public final String pattern;
public final Handler handler;

protected Rule(String pattern, Handler handler) {
	this.pattern = pattern;
	this.handler = handler;
}

protected static interface Handler {
	void handle (String line);
}
}
