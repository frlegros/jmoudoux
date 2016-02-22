package chap04.objets;

/**
 * Created by frlegros on 03/02/16.
 */
public class VariableDeClasse {

    static int compteur = 0;
    static final float pi = 3.1416f;
    private float rayon;

    public VariableDeClasse(float rayon){
        this.rayon = rayon;

        System.out.println("La surface de mon cercle est :"+rayon+"*"+rayon+"*"+pi+"="+ surface());

    }

    public static void main(String[] args){

        VariableDeClasse c1 = new VariableDeClasse(10);
        isInstanceOfMe(c1);
        VariableDeClasse c2 = new VariableDeClasse(20);
        isInstanceOfMe(c2);
        String c3 = "Ceci est un obsjet String";
        isInstanceOfMe(c3);

        System.out.println("compteur= "+c1.compteur);
        c1.compteur ++;
        System.out.println("compteur= "+c2.compteur);
    }

    private static void isInstanceOfMe(Object o) {
        if(o instanceof VariableDeClasse){
            System.out.println("Cet objet est une instance de ma classe VariableDeClasse: "+o.getClass().getName());
        }else{
            System.out.println("Cet objet n'est pas une instance de ma classe VariableDeClasse: "+o.getClass().getName());
        }
    }

    public float surface(){
        return rayon * rayon * pi;
    }

}
