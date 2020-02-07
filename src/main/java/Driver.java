import grammar.HtmlLexer;

import java.io.*;

public class Driver {

    public static void main(String[] args) {

        if (args.length != 2) {
            throw new IllegalArgumentException("Must provide input and output files in format: inputFile.html outputFile.txt");
        }

        String inputFileName = args[0];
        String outputFileName = args[1];

        try {
            System.setErr(new PrintStream("error.log"));
            System.setOut(new PrintStream(new FileOutputStream(outputFileName)));

            Reader inputReader = new FileReader(inputFileName);
            HtmlLexer lexer = new HtmlLexer(inputReader);
            lexer.yylex();
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Input file not found");
        } catch (IOException e) {
            System.exit(1); //Oops
        }
    }
}
