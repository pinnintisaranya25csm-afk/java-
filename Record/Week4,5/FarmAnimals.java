package records;

class FarmAnimal {
 String name;
 String stays;
 String food;
 String sound;

 FarmAnimal(String name, String stays, String food, String sound) {
     this.name = name;
     this.stays = stays;
     this.food = food;
     this.sound = sound;
 }

 void displayDetails() {
     System.out.println("Animal  : " + name);
     System.out.println("Stays   : " + stays);
     System.out.println("Eats    : " + food);
     System.out.println("Sound   : " + sound);
     System.out.println();
 }
}

public class FarmAnimals {
 public static void main(String[] args) {

     FarmAnimal cow = new FarmAnimal(
         "Cow", "Cowshed", "Grass and Hay", "Moo"
     );

     FarmAnimal pig = new FarmAnimal(
         "Pig", "Pigsty", "Grains and Vegetables", "Oink"
     );

     FarmAnimal horse = new FarmAnimal(
         "Horse", "Stable", "Grass and Hay", "Neigh"
     );

     System.out.println("FARM ANIMALS ");
     cow.displayDetails();
     pig.displayDetails();
     horse.displayDetails();
 }
}




