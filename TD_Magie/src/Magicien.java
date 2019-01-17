public class Magicien extends Sorcier implements SuperPouvoir {

    Magicien(String name){
        super(name);
        this.name = name;
        this.pouvoir *= extra;
    }

    public double sort(){
        return this.pouvoir*Math.random();
    }

    public void subitCharme(int coup, Personage p){
        System.out.println("COUP = "+coup);
        int tape = (int)(coup*sort());
        System.out.print("!!! Le sorcier "+ p.getNom()+" a fait l'erreur de charmer "+ this.getNom()+" !!!");
        p.addVie(-tape);
        System.out.println(this.getNom()+" renvoie le charme d'une puissance de "+tape+" sur "+p.getNom()+".");
    }
}
