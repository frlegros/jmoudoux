package chap20.flux.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URISyntaxException;

/**
 * Created by frlegros on 13/03/16.
 */
public class TestBufferedReader {

    protected String source;

    public TestBufferedReader(String source) {

        this.source = this.getClass().getClassLoader().getResource(source).getFile();
        lecture();
    }

    private void lecture() {
        try{
            String ligne;
            BufferedReader fichier = new BufferedReader(new FileReader(this.source));

            while ((ligne= fichier.readLine())!=null){
                System.out.println(ligne);
            }
            fichier.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new TestBufferedReader("source.txt");

    }
}
