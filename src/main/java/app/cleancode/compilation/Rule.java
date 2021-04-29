package app.cleancode.compilation;

public class Rule {
public final String pattern;
protected Handler handler;

protected Rule(String pattern) {
	this.pattern = pattern;
}

public static interface Handler {
	void handle (String line);
}
}
