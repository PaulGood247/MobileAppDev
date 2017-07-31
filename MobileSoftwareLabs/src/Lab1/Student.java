package Lab1;

public class Student extends Person implements PublishDetails {
	
	private int studentID;
	private String courseCode;
	
	public Student(String name, char gender, int studentID, String courseCode) {
		super(name, gender);
		this.studentID = studentID;
		this.courseCode = courseCode;
	}
	
	private static int idCounter = 0;
	
	public Student(String name, char gender)
	{
		super(name, gender);
		studentID=++idCounter;
	}
	
	

	@Override
	public String toString() {
		return "Students ID is " + studentID + ", and courseCode is " + courseCode;
	}

	
	public String confirmDetails()
	{
		return "This student is " + super.getName() + " , whose gender is " + super.getGender() + " with student ID "+ studentID + " in course "+courseCode ;
	}
	public String getCourseCode()
	{
		return "Student "+ super.getName()+ "'s course code is "+courseCode;
	}
	
}
