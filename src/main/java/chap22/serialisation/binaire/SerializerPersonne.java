package chap22.serialisation.binaire;

import chap04.objets.interfac.ex01.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by frlegros on 16/03/16.
 */
public class SerializerPersonne {

    public static void main(String[] args) {

        final Personne personne = new Personne("Dupond", "Jean", 175);

        ObjectOutputStream oos = null;

        try {
            final FileOutputStream fichier = new FileOutputStream("personne.ser");
            oos = new ObjectOutputStream(fichier);
            oos.writeObject(personne);
            oos.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if (oos!=null){
                    oos.flush();
                    oos.close();
                }
            }catch (final IOException ex){
                ex.printStackTrace();
            }

        }
    }

}
