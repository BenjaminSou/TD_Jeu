public class GnomeJardin extends NainJardin {
    private int soli2 = (int)(Math.random()*this.solidite);
    GnomeJardin(String name){
        super(name);
    }

    public void subitCharme(int coup, Personage p){

        if(coup<soli2) {
            System.out.print(p.getNom() + " se fait renvoyer son sort par un gnome de jardin et subit un coup de " + (soli2-coup) + " pdv: ");
            p.addVie(coup-soli2);
            if(!p.mort()){
                System.out.println(p.getNom());
            }
        }
        else{
            super.subitCharme(coup, p);
        }
    }
}
