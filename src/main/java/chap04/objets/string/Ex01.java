package chap04.objets.string;

/**
 * Created by franck on 23/02/16.
 */
public class Ex01 {

    private String uneChaine;

    protected void strToUpper(String chaine){
        uneChaine = chaine.toUpperCase();
    }

    public String getUneChaine() {
        return uneChaine;
    }

    public void setUneChaine(String uneChaine) {
        this.uneChaine = uneChaine;
    }

    public boolean isObjContentEqual(String str1, String str2){
        return str1.equals(str2);
    }

    public boolean isObjRefEqual(String str1, String str2){
        return str1==str2;
    }

    public boolean isObjEmpty(String str){

        try{
            if(!str.isEmpty())
                return false;
            else
                return true;
        }catch (Exception e){
            return true;
        }
    }
}
