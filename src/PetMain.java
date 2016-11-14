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

public class PetMain{
    public static void main(String[] args){
    Dog a_dog;
    Cat a_cat;
    Pet a_pet;
    
    //Anonymous Implementation for MakeSound Method Valid only for a_pet
    a_pet = new Pet("Frankie"){

		@Override
		void MakeSound() {
			 System.out.print(super.name+" the Dog says: Shh! Shh!");
		}
    	
    };
    a_pet.wakeUp();
    a_cat = new Cat(" Kitty");
    a_cat.wakeUp();
    
    a_dog = new Dog(" Doggie");
    a_dog.wakeUp();
    
    
    }
    
}