package chap102.testsauto.mock.monservice;

/**
 * Created by frlegros on 15/03/16.
 */
public class CalculatriceImpl implements Calculatrice {

    public long additionner(int val1, int val2) {
        if (val1<0 || val2<0){
            throw new IllegalArgumentException("La valeur ne peut pas être négative");
        }
        return val1+val2;
    }

    public long soustraire(int val1, int val2) {
        return val1-val2;
    }
}
