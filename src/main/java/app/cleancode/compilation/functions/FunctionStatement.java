package app.cleancode.compilation.functions;

import java.util.ArrayList;
import java.util.List;

import app.cleancode.compilation.Statement;

public class FunctionStatement extends Statement {
public final String visibility, type, name, params;

	public FunctionStatement(String visibility, String type, String name, String params) {
		super(Type.FUNCTION);
		this.visibility = visibility;
		this.type = type;
		this.name = name;
		this.params = params;
	}

	@Override
	public List<String> compile() {
		return new ArrayList<>();
	}

}
