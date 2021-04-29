package app.cleancode.compilation;

import java.util.List;

public abstract class Statement {
public abstract List<String> compile ();

public final Type type;

protected Statement(Type type) {
	this.type = type;
}

protected static enum Type {
	CALL,
	RETURN,
	IF,
	ASSIGN,
	DECLARE,
	DEFINE,
	FUNCTION
}
}
