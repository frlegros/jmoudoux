package chap22.serialisation.binaire;

import java.io.Serializable;

/**
 * Created by frlegros on 16/03/16.
 */
public class MonBean implements Serializable{

    private String champ1;

    public String getChamp1() {
        return champ1;
    }

    public void setChamp1(String champ1) {
        this.champ1 = champ1;
    }

    @Override
    public String toString() {
        return "MonBean{" +
                "champ1='" + champ1 + '\'' +
                '}';
    }
}
