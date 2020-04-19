import  java.io.BufferedWriter;
import  java.io.FileWriter;
import java.io.IOException;


public class Parser_IO {

    private lexer_grammerParser  coolParser ;

    public Parser_IO (Lexer_IO lexer){
         coolParser = new lexer_grammerParser(lexer.getTokenStream());
         coolParser.removeErrorListeners();
         coolParser.addErrorListener(ParsingErrorListener.parsingErrorListenerObject);

    }

    public String getCST(){
        lexer_grammerParser.ProgramContext ProgramContext = coolParser.program();
        String tree = ProgramContext .toStringTree(coolParser);
        return tree;
    }
    public void writeCST (String filename){

        String tree = getCST();

        try{

            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            bw.write(tree);
            bw.close();



        }
        catch(IOException e){

            throw new RuntimeException(e);
        }

    }
}
