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
  

Class Magicien

Class Sorcier

Class Gnome

Class SuperPouvoir



Class GnomeJardin

