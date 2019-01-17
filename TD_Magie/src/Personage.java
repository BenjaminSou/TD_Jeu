public abstract class Personage extends Victime {

    String name;
    private int pdv;

    Personage(String name) {
        this.name = name;
        this.pdv = (int) (Math.random() * 100);
    }

/*
 * Return name and life points or declare the death.
 */
    public String toString() {
        if (!this.mort()) {
            return "Je m'appelle " + this.getNom() + " et j'ai " + this.pdv + " points de vie.";
        } else {
            return this.name + " est mort.";
        }
    }
    
/*
 * Return pdv.
 */
    int getVie(){
        return this.pdv;
    }
    
/*
 * Return "name(pdv)".
 */
    String getNom(){
        return this.name+"("+this.getVie()+")";
    }

/*
 * Return if Personnage has still pdv left or not.
 */
    boolean mort(){
        return (this.getVie()<=0);
    }

/*
 * Add a positive or negative number to pdv, set pdv to 0 in case of death.
 */
    void addVie(int nb){
        this.pdv += nb;
        if(this.pdv<=0){
            this.pdv = 0;
            System.out.println("... et "+this);
        }
    }

    protected abstract void attaque(Victime p);

    protected abstract void subitFrappe(int coup, Personage p);

    protected abstract void subitCharme(int coup, Personage p);

}
