abstract class Pet {
    String name;
    Pet(String name){
        this.name = name;
    }
    public void wakeUp(){
        MakeSound();
    }
    abstract void MakeSound();
}
class Cat extends Pet{

    Cat(String name) {
        super(name);
    }

    public void MakeSound() {
        System.out.print(super.name+" the Cat says: Meow! Meow!");
    }
    
}


class Dog extends Pet {

    Dog(String name) {
        super(name);
    }

    public void MakeSound() {
        System.out.print(super.name+" the Dog says: Woof! Woof!");
        
    }
    
}

//Need to be define by user

class Parrot extends Pet {

	Parrot(String name) {
        super(name);
    }

    public void MakeSound() {
        System.out.print(super.name+" the Parrot says: Hello! Hello!");
        
    }
    
}

public class ParrotMain{
    public static void main(String[] args){
    Dog a_dog;
    Cat a_cat;
    
    
    Parrot a_parrot; // What will happen when you uncomment the following lines?
    a_parrot = new Parrot(" Polly");
    Pet a_pet; //Should be removed By user
    a_pet = new Pet("Frankie"); //Should be removed By user
    a_pet.wakeUp(); //Should be removed By user
    
    a_cat = new Cat(" Kitty");
    a_cat.wakeUp();
    
    a_dog = new Dog(" Doggie");
    a_dog.wakeUp();
    
    a_parrot.wakeUp();
    }
    
}