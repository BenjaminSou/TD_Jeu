public class Monstre extends Personage {

    Monstre(String name){
        super(name);
    }
    
/*
 * Lose pdv of the attack and if this die, print it.
 */
    public void subitFrappe(int coup, Personage p) {
        System.out.println(p.getNom()+" frappe "+ this.getNom() + " avec une force de "+coup+".");
        this.addVie(-coup);
        if(!this.mort()) {
            System.out.print(this.getNom() + " retourne "+ getVie() / 2+" dégats ");
            p.addVie(-this.getVie() / 2);
            if(!p.mort()){
                System.out.println(" à "+p.getNom()+".");
            }
        }

    }
    
/*
 * When attacking, lose pdv.
 */
    @Override
    public void attaque(Victime p) {
        if(!this.mort()){
            p.subitFrappe(this.getVie()/2, this);
        }
    }

    
/*
 * Lose pdv of the charm and if this die, print it.
 */
    public void subitCharme(int coup, Personage p){
        System.out.println(p.getNom()+" charme "+ this.getNom() + " avec une force de " + coup+".");
        this.addVie(-coup);
        p.addVie(this.getVie() / 2);
        System.out.println( "Il recupère "+ getVie()/2 + " pdv: "+p.getNom()+".");
    }
}
