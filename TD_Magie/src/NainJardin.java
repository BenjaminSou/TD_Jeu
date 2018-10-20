public class NainJardin extends Victime {
    private String name;
    int solidite;

    NainJardin(String name){
       this.name = name;
       this.solidite = (int)(Math.random()*100);
    }

    public void subitFrappe(int coup, Personage p){
        if(coup >= this.solidite){
            System.out.print(p.getNom()+" détruit un nain de jardin et perd "+ this.solidite + " pdv: ");
            p.addVie(-this.solidite);
            this.solidite = 0;
            System.out.println(p.getNom());
        }
        else{
            System.out.print(p.getNom()+" se fait mal sur un nain de jardin trop solide et perd "+ coup + " pdv: ");
            p.addVie(-coup);
            System.out.println(p.getNom());
        }
    }
    public void subitCharme(int coup, Personage p) {
        System.out.print(p.getNom()+" se fatigue pour rien sur un nain de jardin et perd 1 pdv: ");
        p.addVie(-1);
        System.out.println(p.getNom());
    }
}
