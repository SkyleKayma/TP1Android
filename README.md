# Android : TP 1

## Préambule

Se connecter sur une machine de la salle A23 et à taper la commande suivante:
-> *iut-vnc -a ludgodar*

Démarrer android studio avec la commande: 
-> *android-studio*

## Si une configuration Android Studio est nécessaire

Si vous avez le choix entre **Standard** et **Custom**:
-> Choisir **Custom**

Vérifier que le chemin **JRE/JDK** soit:
-> */opt/android-studio/android-studio/jre*

Vérifier que le **Android SDK Location** soit:
-> */opt/android-sdk/android-sdk*

Terminer la configuration.
Si après-coup le chemin du SDK n’est toujours pas réglé sur */opt/android-sdk/android-sdk*, faites-le moi savoir.

# Objectifs

1. Créer un projet en choisissant **No Activity** comme configuration de départ
2. Créer une activité (ne pas oublier de l'ajouter au Manifest !)
3. Mettre en place un écran avec un **Bouton** et une **TextView**  
4. Au clic sur le bouton, afficher un texte (celui que vous voulez) dans la TextView  
5. Ajouter un **EditText** à votre écran 
6. Au clic sur le bouton, mettre le contenu de l'EditText dans la TextView

**Bonus**

1. Ajouter une seconde Activity qui sera poussée par un second bouton
2. Faire en sorte que le texte des boutons soit stockés en ressource dans un fichier **strings.txt**
3. Stylisez vos composants !
