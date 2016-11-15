public class Anonymous {
    static class Pet {
        String name;
        Pet(String petname) {
            this.name = petname;
        }
        void makeSound(){
            System.out.println(name+ " the Pet says...");
        }
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet("NoName"));
        pets.add(new Pet("Kitty") {void makeSound() {System.out.println(name+ " the Cat says: Meow! Meow!" );}});
        pets.add(new Pet("Doggie"){void makeSound() {System.out.println(name+ " the Dog says: Woof! Woof!");}});
        
        for (Pet p: pets) {
            p.makeSound();
        }
    }
}
