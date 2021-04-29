package app.cleancode;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) throws Exception {
	List<String> inputFiles = new ArrayList<String>();
	String outputFile = null;
	for (int i = 0; i < args.length; i++) {
		String s = args [i];
		if (Files.exists(Paths.get(s))) {
			inputFiles.add(s);
		}else if (s.equals("-o")) {
			outputFile = args [i + 1];
			// skip next argument
			i ++;
		}else {
			System.err.printf("MPC: Warning: unused command line option '%s'\n", s);
		}
	}
	if (outputFile == null) {
		outputFile = "a.out";
	}
	if (inputFiles.size() < 1) {
		System.err.println ("MPC: Error: no input files");
		System.exit(-1);
	}
}
}
