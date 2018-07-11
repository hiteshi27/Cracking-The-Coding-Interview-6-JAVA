package chapter3_stacks_and_queues;
import java.util.*;
public class q6_AnimalShelter {

	List<String> animalShelter = new ArrayList<>();
	List<Integer> dogs = new ArrayList<>();
	List<Integer> cats = new ArrayList<>();
	int order=0;
	public static void main(String[] args) {
		q6_AnimalShelter list = new q6_AnimalShelter();
		list.enqueue("dog");
		list.enqueue("cat");
		list.enqueue("dog");
		list.enqueue("cat");
		list.enqueue("dog");
		list.enqueue("cat");
		list.enqueue("cat");
		list.enqueue("dog");
		list.enqueue("cat");
		list.dequeueAny();
		list.dequeueCat();
		list.dequeueDog();

	}
	public void enqueue(String animal){

		//		animalShelter.add(animal.toLowerCase());

		if(animal.toLowerCase().equals("dog")){
			order+=1;
			dogs.add(order);System.out.println("\n\n add to index : "+ animal + " "+order);
		}else if(animal.toLowerCase().equals("cat")){
			order+=1;
			cats.add(order);System.out.println("\n\n add to index : "+ animal + " "+order);
		}else{
			return;
		}

	}

	public void dequeueAny(){
		//		if(animalShelter.size()<=0){
		//			System.out.println("\n\n no animal available" );
		//			return;
		//		}
		if(cats.size()<=0&&dogs.size()<=0){
			System.out.println("\n\n no animal available" );
			return;
		}


		//		animalShelter.remove(0);
		if(cats.size()<=0){
			System.out.println("\n\n remove from index : "+ "dog"+" "+1);
			dogs.remove(0);return;
		}else if(dogs.size()<=0){
			System.out.println("\n\n remove from index : "+ "cat"+" "+1);
			cats.remove(0);return;
		}

		else if(peek(cats)<peek(dogs)){
			System.out.println("\n\n remove from index : "+ "cat"+" "+1);
			cats.remove(0);
		}else{

			dogs.remove(0);
		}
	}

	public void dequeueDog(){
		//		if(animalShelter.indexOf("dog")<0){
		//			System.out.println("\n\n dogs not available" );
		//			return;
		//		}		System.out.println("\n\n remove from index : "+ "dog" + " "+(animalShelter.indexOf("dog")+1));
		//
		//		animalShelter.remove(animalShelter.indexOf("dog"));

		if(dogs.size()<=0){
			System.out.println("\n\n dogs not available" );
			return;
		}
		System.out.println("\n\n remove from index : "+ "dog"+" "+1);
		dogs.remove(0);
	}
	public void dequeueCat(){
		//		if(animalShelter.indexOf("cat")<0){
		//			System.out.println("\n\n cats not available" );
		//			return;
		//		}		System.out.println("\n\n remove from index : "+ "cat" + " "+ (animalShelter.indexOf("cat")+1));
		//
		//		animalShelter.remove(animalShelter.indexOf("cat"));
		if(cats.size()<=0){
			System.out.println("\n\n cats not available" );
			return;
		}
		System.out.println("\n\n remove from index : "+ "cat"+" "+1);
		cats.remove(0);
	}
	public int peek(List<Integer> animal){

		return animal.get(0);
	}
}
