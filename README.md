# TD_Jeu
Jeu de magicien se battant avec des monstres


Class Victime:

Toute Victime peut subir soit des Frappes soit des Charmes.

Class Personnage:

  Every Personnage is a Victime.
  name : Each have a singular name.
  pdv : lifepoints, hazardous number in range 1 to 100.
  
  Methods:
  
  - toString : Return name and life points or declare the death.
  - getVie : Return pdv.
  - getNom : Return "name(pdv)".
  - mort : Return if Personnage has still pdv left or not.
  - addVie : Add a positive or negative number to pdv, set pdv to 0 in case of death.


Class Monstre:

  Every Monstre is a Personnage.
  
  Methods:
  
  - subitFrappe : Lose pdv of the attack and if this die, print it.
  - attaque : When attacking, lose pdv.
  - subitCharme : Similar to subitFrappe but from magician attacks not monster ones.
  

Class Magicien:

  Methods:
  
  - sort : Define a random sort from the Sorcier power.
  - subitCharme : Lose pdv from an attack.
  
Class Sorcier:

  Methods:
  
    - sort : Define a random sort from the Sorcier power.
    - subitFrappe : Loose pdv from a Frappe of a monster, print if dead.
    - subitCharme : Loose pdv from a Charm of a Sorcier, print if dead.

Class SuperPouvoir:
  
  double sort method.

Class GnomeJardin:

  Methods:
  
  - subitCharme : Gnome can't lose pdv and reflect the charme to the Personnage.

Class NainJardin:

  Methods:
  
  - subitFrappe : Die, or reflect the attack to the Personnage who send it.
  - subitCharme : The Personnage who attacked lose 1 pdv.
