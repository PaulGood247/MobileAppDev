package Lab1;

public class lab1Main {

	public static void main(String[] args) {
		
		Person p =new Person("Joe", 'M');
		Person p1=new Person("Mary", 'F');
		Student s=new Student("Pete", 'M' , 1234, "DT228");
		Student s1=new Student("John", 'M' );
		Student s2=new Student("Bill", 'M');
		Student s3=new Student("Jane", 'F');
		
		System.out.println(p.toString());
		System.out.println(p1.toString());
		System.out.println(s.toString());
		System.out.println(s.confirmDetails());
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
	}

}
