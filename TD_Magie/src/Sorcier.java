public class Sorcier extends Personage {

    double pouvoir = Math.random();

    Sorcier(String name) {
        super(name);
    }

    public void attaque(Victime p) {
        if (!this.mort()) {
            p.subitCharme((int) ((double) this.getVie()*(this.pouvoir)), this);
        }
    }

    protected void subitFrappe(int coup, Personage p){
        System.out.println(p.getNom() +" frappe "+ this.getNom()  + " avec une force de "+coup+".");
        this.addVie(-coup);
        if(!this.mort()) {
            System.out.print(this.getNom() + " renvoie " + (int) ((double) this.getVie()*(this.pouvoir)) + " dégats");
            p.addVie(-(int) ((double) this.getVie()*(this.pouvoir)));
            if(!p.mort()){
                System.out.println(" à "+p.getNom()+".");
            }
        }
    }

    protected void subitCharme(int coup, Personage p){
        System.out.print("Le sorcier "+ p.getNom() + " charme le sorcier "+ this.getNom()+", ça n'est pas très efficace et se fatigue: ");
        p.addVie(-1);
        if(!p.mort()){
            System.out.println(p.getNom()+".");
        }
    }
}
