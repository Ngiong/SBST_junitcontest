package sbst.runtool;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Writer writer = new PrintWriter(System.out);
        Reader reader = new InputStreamReader(System.in);
        EvosuiteTool tool = new EvosuiteTool();
        RunTool runTool = new RunTool(tool, reader, writer);
        runTool.run();
    }

}
