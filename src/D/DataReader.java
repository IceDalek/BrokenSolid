package D;

public class DataReader {
    private ConsoleReader consoleReader = new ConsoleReader();
    private TextFileReader textFileReader = new TextFileReader();
    void processText(String what){
        if(what.equals("console")){
            consoleReader.read();
        }
        else if(what.equals("file")){
            textFileReader.read("123.txt");
        }
    }
}
