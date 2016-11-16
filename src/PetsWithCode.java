import java.util.Scanner;

abstract class Pet {
    String name;
    Pet(String name){
        this.name = name;
    }
    public void wakeUp(){
        MakeSound();
    }
    abstract void MakeSound();
	
	void IAmAlive (int n) { System.out.println("PET:: Pet " + n + " is now alive."); }
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
//Utility class has the information about pets
class PetDetails {
	String name;
	int code;
}
//Utility Class has the static methods to handle pets

class HandlePets{
	
	public static PetDetails getPetCode(String data){
		PetDetails petInfo = new PetDetails();
		//Data "1 Polly" is splited in to "1" as code and "Polly" as name and stored in "processedData" Array.
		String[] processedData = data.split(" ");
		//Preparation of petInfo 
		petInfo.code=Integer.parseInt(processedData[0]);
		petInfo.name=processedData[1];
		return petInfo;
	}
	
	public static Pet[] growPets(){
		Pet[] pets = new Pet[10];
		//System will get the pet name with code exacly 10 inputs needed ( You can Link a File that contain inputs)
		
		Scanner in = new Scanner(System.in);
		for(int i = 0;i<10;i++){
			String data = in.nextLine();
			PetDetails petinfo = HandlePets.getPetCode(data);
			//Compars the input name and creats the pets
			if(petinfo.name.equals("Kitty")){
				pets[i] = new Cat("Kitty");
			}
			else if (petinfo.name.equals("Doggie")){
				pets[i] = new Dog("Doggie");
			}
			else if (petinfo.name.equals("Polly")){
				pets[i] = new Parrot("Polly");
			}
		}
		//Array of pets return to the caller.
		return pets;
	}
}

class Parrot extends Pet {

	Parrot(String name) {
        super(name);
    }

    public void MakeSound() {
        System.out.print(super.name+" the Parrot says: Hello! Hello!");
        
    }
    
}

public class PetsWithCode{
    public static void main(String[] args){
	    //Array of pets will be created in this case 10
    Pet[] pets = HandlePets.growPets();
    int num_of_pets = pets.length;
    for(int i=0;i<num_of_pets;i++){
    	pets[i].wakeUp();
    System.out.println("");
    }
    System.out.println("\n\n"+num_of_pets);
    }
    
}


//Sample Input
/*
1 Kitty
2 Doggie
3 Polly
1 Kitty
2 Doggie
3 Polly
1 Kitty
2 Doggie
3 Polly
1 Kitty
*/

//OutPut
/*
 * 
Kitty the Cat says: Meow! Meow!
Doggie the Dog says: Woof! Woof!
Polly the Parrot says: Hello! Hello!
Kitty the Cat says: Meow! Meow!
Doggie the Dog says: Woof! Woof!
Polly the Parrot says: Hello! Hello!
Kitty the Cat says: Meow! Meow!
Doggie the Dog says: Woof! Woof!
Polly the Parrot says: Hello! Hello!
Kitty the Cat says: Meow! Meow!


10

 */
