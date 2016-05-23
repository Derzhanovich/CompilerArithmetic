
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import org.antlr.runtime.*;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

public class Test {
	private static java.util.Scanner sc = new java.util.Scanner(System.in);
	
	public static StringTemplateGroup templates;
	
	public static void main(String[] args) throws Exception {
		String filename = args[0];
		
		String templateFileName = "src/javaTemplate.stg";
		StringTemplateGroup templates = new StringTemplateGroup(new FileReader(templateFileName),
						    AngleBracketTemplateLexer.class);

		try {		
			CharStream input = new ANTLRFileStream(filename);
		
			mgLexer lexer = new mgLexer(input);
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			
			mgParser parser = new mgParser(tokens);
		
			parser.setTemplateLib(templates);
			
			RuleReturnScope r = parser.program();
			
			if(parser.isOk()) {
				PrintWriter out = new PrintWriter(new FileWriter("C:/Users/NotePad/workspace/test/src/target_code.java"), true);
				out.println(r.getTemplate().toString());
				
				System.out.println("Java file generated!");
		}
	
		} catch(Exception e) {
			System.out.println("Error! "+e);
		}
	}

}