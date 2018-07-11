package chapter3_stacks_and_queues;
import java.util.*;
public class q6_AnimalShelter2 {

	List<String> animalShelter = new ArrayList<>();


	public static void main(String[] args) {
		q6_AnimalShelter2 list = new q6_AnimalShelter2();
				list.enqueue("dog");
				list.enqueue("dog");
				list.enqueue("dog");
				list.enqueue("cat");
				list.enqueue("dog");
//				list.enqueue("cat");
//				list.enqueue("cat");
//				list.enqueue("dog");
//				list.enqueue("cat");
		list.dequeueAny();
		list.dequeueCat();
		list.dequeueDog();

	}
	public void enqueue(String animal){
		System.out.println("\n\n add to index : "+ animal + " "+(animalShelter.size()+1));
		animalShelter.add(animal.toLowerCase());
	}
	public void dequeueAny(){
		if(animalShelter.size()<=0){
			System.out.println("\n\n no animal available" );
			return;
		}
		System.out.println("\n\n remove from index : "+ animalShelter.get(animalShelter.size()-1)+" "+(animalShelter.size()));

		animalShelter.remove(animalShelter.size()-1);
	}

	public void dequeueDog(){
		if(animalShelter.lastIndexOf("dog")<0){
			System.out.println("\n\n dogs not available" );
			return;
		}		System.out.println("\n\n remove from index : "+ "dog" + " "+(animalShelter.lastIndexOf("dog")+1));

		animalShelter.remove(animalShelter.lastIndexOf("dog"));
	}
	public void dequeueCat(){
		if(animalShelter.lastIndexOf("cat")<0){
			System.out.println("\n\n cats not available" );
			return;
		}		System.out.println("\n\n remove from index : "+ "cat" + " "+ (animalShelter.lastIndexOf("cat")+1));

		animalShelter.remove(animalShelter.lastIndexOf("cat"));
	}

}