package runner;

import people.People;
import person.Person;

public class Runner {
	
	public static void main(String[] args) {
		
		// creating a reference to the People class
		People people = new People();
		
		// Creating Person objects
		Person perOne = new Person("Johnold", 35, "Inspector Detecter");
		Person perTwo = new Person("Jimothy", 23, "Twitch Streamer");
		Person perThree = new Person("Elizabeth", 28, "Executioner");

		// Adding the Person objects to the people array
		people.addPeople(perOne);
		people.addPeople(perTwo);
		people.addPeople(perThree);
	
		// Using the Search For Person method
		System.out.println("Searching for Jimothy");
		people.SearchForPerson("Jimothy");
		
		System.out.println("=".repeat(20));
		
		// Using the Output People method
		System.out.println("Outputting people \n");
		people.OutputPeople();
	}
}