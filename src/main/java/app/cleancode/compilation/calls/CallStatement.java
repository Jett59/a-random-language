package app.cleancode.compilation.calls;

import java.util.ArrayList;
import java.util.List;

import app.cleancode.compilation.Statement;

public class CallStatement extends Statement {
public final String function;
public final String params;

	public CallStatement(String params, String function) {
		super(Type.CALL);
		this.function = function;
		this.params = params;
	}

	@Override
	public List<String> compile() {
		return new ArrayList<>();
	}

}
