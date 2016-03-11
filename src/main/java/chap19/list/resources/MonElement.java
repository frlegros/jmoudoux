package chap19.list.resources;

/**
 * Created by franck on 11/03/16.
 */
public class MonElement {
    private final int valeur;

    public MonElement(final int valeur){
        this.valeur = valeur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MonElement that = (MonElement) o;

        return valeur == that.valeur;

    }

    @Override
    public int hashCode() {
        return valeur/100;
    }
}
