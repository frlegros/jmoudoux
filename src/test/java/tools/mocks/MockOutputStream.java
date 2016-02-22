package tools.mocks;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created by frlegros on 13/02/16.
 */
public class MockOutputStream {


    public OutputStream getOutputStream() {
        // Prepare to capture output
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        return os;
    }

}
