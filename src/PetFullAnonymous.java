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
        //Each Pet is unique and has it's own makeSound();
        pets.add(new Pet("NoName"){/*This makeSound is only for This Pet*/ void makeSound(){System.out.println(name+ " I am not a pet");}});
        pets.add(new Pet("Kitty") { /*This makeSound is only for This Kitty*/ void makeSound() {System.out.println(name+ " the Cat says: Meow! Meow!" );}});
        pets.add(new Pet("Doggie"){/*This makeSound is only for This Doggie*/void makeSound() {System.out.println(name+ " the Dog says: Woof! Woof!");}});
        for(Object a:pets){
        	Pet x=(Pet)a;
        	x.wakeUp();
    }
}
}
