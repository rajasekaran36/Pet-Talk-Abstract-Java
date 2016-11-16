import java.util.ArrayList;

abstract class Pet {
        String name;
        Pet(String name) {
            this.name = name;
        }
        public void wakeUp(){
        	makeSound();
        }
        abstract void makeSound();
}


public class PetFullAnonymous{
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet("NoName"){void makeSound(){System.out.println(name+ " I am not a pet");}});
        pets.add(new Pet("Kitty") {void makeSound() {System.out.println(name+ " the Cat says: Meow! Meow!" );}});
        pets.add(new Pet("Doggie"){void makeSound() {System.out.println(name+ " the Dog says: Woof! Woof!");}});
        for(Object a:pets){
        	Pet x=(Pet)a;
        	x.wakeUp();
    }
}
}