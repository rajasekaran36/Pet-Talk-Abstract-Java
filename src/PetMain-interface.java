interface PetActions {
    void MakeSound();
}
class Pet implements PetActions{
    String name;
    Pet(String name){
        this.name = name;
    }
    void wakeUp(){
        MakeSound();
    }
    public void MakeSound() {
        System.out.println(this.name + " the Pet says: Shh! Shh!");
    }
}
class Cat extends Pet{

    Cat(String name) {
        super(name);
    }

    public void MakeSound() {
        System.out.println(super.name+" the Cat says: Meow! Meow!");
    }
    
}
class Dog extends Pet {

    Dog(String name) {
        super(name);
    }

    public void MakeSound() {
        System.out.println(super.name+" the Dog says: Woof! Woof!");
        
    }
    
}
public class Main{
    public static void main(String[] args){
    Dog a_dog;
    Cat a_cat;
    Pet a_pet;
    
    a_cat = new Cat("Kitty");
    a_cat.wakeUp();
    
    a_dog = new Dog("Doggie");
    a_dog.wakeUp();
    
    a_pet = new Pet("Frankie");
    a_pet.wakeUp();
    }
    
}
