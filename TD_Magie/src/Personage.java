public abstract class Personage extends Victime {

    String name;
    private int pdv;

    Personage(String name) {
        this.name = name;
        this.pdv = (int) (Math.random() * 100);
    }

    public String toString() {
        if (!this.mort()) {
            return "Je m'appelle " + this.getNom() + " et j'ai " + this.pdv + " points de vie.";
        } else {
            return this.name + " est mort.";
        }
    }

    String getNom(){
        return this.name+"("+this.getVie()+")";
    }

    boolean mort(){
        return (this.getVie()<=0);
    }

    int getVie(){
        return this.pdv;
    }

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
