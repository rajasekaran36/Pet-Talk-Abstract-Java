public class Anonymous {
    static class Pet {
        char name;
        Action(int id) {
            this.id = id;
        }
        void makeSound(){
            System.out.println(name+ " the Pet says..."+ id);
        }
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        actions.add(new Pet("NoName"));
        actions.add(new Pet("Kitty") {void makeSound() {System.out.println(name+ " the Cat says: Meow! Meow!" );}});
        actions.add(new Pet("Doggie"){void makeSound() {System.out.println(name+ " the Dog says: Woof! Woof!");}});
        for (Pet p: pets) {
            p.makeSound();
        }
    }
}
