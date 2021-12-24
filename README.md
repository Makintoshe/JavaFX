# JavaFX
Ensemble des mini projets académiques réalisés au tour de JavaFX 

Conception d'interfaces graphiques utilisateur (GUI pour graphical user interface) en Java: 

- Principaux patrons d'architecture et de conceptions dédiés à la réalisation de GUI 
(Présentation-Model : MVP, Model-View-Controller : MVC , Model-View-Adapter : MVVM)

- Principes de bases de la programmation de GUI avec Java (notions de conteneurs, layout, listeners)

- Mise en oeuvre de ces principes avec la librairies JavaFX


# Configuration
Ajouter le SDK 11 de JavaFX dans votre projet, suivre la démarche :

  1) En premier lieu, il faut télécharger la SDK JavaFX. Cela peut être fait de deux façons :
◦ En la téléchargeant à cette adresse : http://gluonhq.com/products/javafx/
◦ Ou, en l’installant à partir des dépôts pour les utilisateurs de Ubuntu :
 ```$sudo apt install openjfx```
 
  2) Suivre le tutoriel suivant : http://openjfx.io/openjfx-docs/


jusqu'à avoir la possibilité de : 

  3) Prenez soin de vérifier et noter le chemin du répertoire de la librairie :
◦ l’endroit où vous l’avez décompréssée, e.g. un dossier de votre répertoire personnel
◦ ou le chemin /usr/share/openjfx/ si elle a été installé via les dépôts Ubuntu.
Ce chemin sera noté /path/to/javafx dans la suite de ces explications, il faudra penser à la remplacer par le bon chemin.

  4) Importer de la librairie JavaFX dans Eclipse
Il faut maintenant importer la librairie JavaFX dans Eclipse, pour pouvoir l’associer à vos futurs projets Java :
◦ Lancez Eclipse
◦ Menu Window > Preferences > Java > Build Path > User Libraries > New
◦ Nommez la librairie JavaFX et validez
◦ Sélectionnez la librairie créée puis allez dans add External JARs...
◦ Ajoutez tous les fichiers .jar que vous trouverez dans le répertoire /path/to/javafx/lib
◦ Validez et revenez à la fenêtre principale d’Eclipse

  5) Ajouter JavaFX dans les projets
