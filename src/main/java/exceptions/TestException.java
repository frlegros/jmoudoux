package exceptions;

/**
 * Created by franck on 29/02/16.
 */
public class TestException {

    public static void main(String[] args){
        int i=3;
        int j=0;
        try {
            System.out.println("Result: "+(i/j));
            int k= i/j;
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception: Div by zero impossible");
            System.out.println("getmessage");
            System.out.println(e.getMessage());
            System.out.println("printStackTrace");
//            e.printStackTrace();

        }catch (Exception e){
            System.out.println("Exception globale");
        }finally {
            System.out.println("Whatever happens, I am executed");
        }
    }
}
