package people;

import java.util.ArrayList;
import java.util.List;

import person.Person;

public class People {

	public List<Person> peopleArr = new ArrayList<Person>();

	// Adds person objects to the people array
	public void addPeople(Person person)
	{
		this.peopleArr.add(person);
	}
	
	// Prints out all the person objects stored in the people array
	public void PrintPeople() {
		
		for(Person person : peopleArr)
		{
			System.out.println(person);
		}
	}
	
	// Searches for a person within the people array based on their name as a String
	public void SearchForPerson(String name)
	{
		for(Person person : peopleArr)
		{	// If the name passed through the method is equal to a name of a person in the people array.
			// It will return that person objects details
			if(name == person.getName())
			{
				System.out.println(person);
			}
		}	
	}
	
	// Outputs all the person objects stored within the people array into the console
	public void OutputPeople()
	{
		peopleArr.stream()
				.forEach(x -> System.out.println(x));
	}
}