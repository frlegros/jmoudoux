package exceptions;

/**
 * Created by franck on 29/02/16.
 */
public class SaisieErroneeException extends Exception {

    public SaisieErroneeException(){
        super();
    }
    public SaisieErroneeException(String s){
        super(s);
    }
}
