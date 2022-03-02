package person;

public class Person {
	
	private String name;
	private int age;
	private String jobTitle;
	
	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	// End of Getters and Setters
	
	@Override
	public String toString() {
		return "Person \n" 
							+ "Name = " + name + ", \n" 
							+ "Age = " + age + ", \n"
							+ "Job Title = " + jobTitle + "\n";
	}
}
