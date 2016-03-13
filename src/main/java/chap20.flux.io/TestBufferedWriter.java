package chap20.flux.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;

/**
 * Created by frlegros on 13/03/16.
 */
public class TestBufferedWriter {

    protected String destination;

    public TestBufferedWriter(String destination) {
        this.destination = destination;

        try{
            String line;
            int nombre = 123;
            BufferedWriter fichier = new BufferedWriter(new FileWriter(this.destination));

            fichier.write("Bonjour tout le monde");
            fichier.newLine();
            fichier.write("Nous sommes le "+ new Date());
            fichier.newLine();
            fichier.write("Le chiffre est "+ nombre);
            fichier.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args){

        new TestBufferedWriter("print.txt");
    }
}
