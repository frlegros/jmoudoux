package chap102.testsauto.mock.monservice;

/**
 * Created by frlegros on 15/03/16.
 */
public class MonService {

    protected  Calculatrice creerCalculatrice(){
        return new CalculatriceImpl();
    }

    public long additionner(int val1, int val2){
        long retour =0l;

        Calculatrice calculatrice = creerCalculatrice();
        try {
            retour = calculatrice.additionner(val1,val2);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            return -1;
        }
        return retour;
    }

    public long calculer(int val1, int val2, int val3){
        long retour = 0;

        Calculatrice calculatrice = new CalculatriceImpl();
        try {
            long somme=calculatrice.additionner(val1, val2);
            retour = calculatrice.soustraire((int) somme ,val3);

        }catch (IllegalArgumentException ia){
            ia.printStackTrace();
            return -1;
        }
        return retour;

    }
}
