//import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // Initialisations

        String namePlayer[] = {"Rocky", "Henri", "Jacques", "Charmant", "Arthur le magicien"};
        int i, attaquant, defenseur, mort, compteur = 0;
        double ifcase;
        //Scanner perso = new Scanner(System.in);
        Personage tableauPersonnage[] = new Personage[10];
        for (i = 0; i <= tableauPersonnage.length-2; i+=2)
        {
            /*System.out.println("Choisissez le nom de votre Monstre: ");
            tableauPersonnage[i] = new Monstre(perso.nextLine());
             */
            tableauPersonnage[i] = new Monstre(namePlayer[i]);
            /*System.out.println("Choisissez le nom de votre Sorcier: ");
            tableauPersonnage[i+1] = new Sorcier(perso.nextLine());
             */
            tableauPersonnage[i+1] = new Sorcier(namePlayer[i+1]);
            tableauPersonnage[tableauPersonnage.length-1] = new Magicien(namePlayer[tableauPersonnage.length-1]);
        }
        //Le jeu lance les attaques
        System.out.println("\n*** LA PARTIE COMMENCE ***");

       do{
           ifcase = Math.random();
           System.out.println();
           do{
                attaquant = (int)(Math.random()*10);
                }while(tableauPersonnage[attaquant].mort());
           if(ifcase<0.3){
               ifcase = Math.random();
               if(ifcase<0.5){
                   NainJardin nouveauNain = new NainJardin("Nain");
                   tableauPersonnage[attaquant].attaque(nouveauNain);
               }
               else{
                   GnomeJardin nouveauNain = new GnomeJardin("Gnome");
                   tableauPersonnage[attaquant].attaque(nouveauNain);
               }
           }
           else {
               do {
                   defenseur = (int) (Math.random() * 10);
               } while (attaquant == defenseur || tableauPersonnage[defenseur].mort());
               tableauPersonnage[attaquant].attaque(tableauPersonnage[defenseur]);
           }

           mort = 0;

           for(i = 0; i < tableauPersonnage.length; i++)
           {
               if(tableauPersonnage[i].mort())
               {
                   mort ++;
               }
           }
           compteur++;
       }while(mort <= 8);

       // Fin de la boucle et résultat.

       System.out.println("\n\n------------- RESULTATS --------------\nAu bout de "+compteur+" tours\n");

       for(i = 0; i < tableauPersonnage.length; i++) {
           if (i%2 == 0){
               System.out.print("Le monstre : ");
           }
           else if(i == 9){
               System.out.print("Le magicien : ");
           }
           else {
               System.out.print("Le sorcier : ");
           }
           System.out.println(tableauPersonnage[i]);
       }
    }
}
