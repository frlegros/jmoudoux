package chap07.exceptions;

/**
 * Created by franck on 29/02/16.
 */
public class TestSaisieErroneeException {

    public static void controle(String chaine) throws SaisieErroneeException{
        if (chaine.equals("")==true)
            throw new SaisieErroneeException();
    }
    public static void main(String[] args){
        String chaine1 = "";
        String chaine2 = "bonjour";

        System.out.println("Test chaine1");
        try{
            controle(chaine1);
        }catch (Exception e){
            System.out.println("Chaine1 saisie erronée");
        }

        System.out.println("Test chaine2");
        try{
            controle(chaine2);
        }catch (Exception e){
            System.out.println("Chaine2 saisie erronée");
        }

    }
}
