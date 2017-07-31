package Lab2;

import java.util.*;
public class Lab2Main {
	 
	public static void main(String[] args) {
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		Random randomGenerator = new Random();
		
		for (int i=0; i<10; i++)
		{
			double randomInt = randomGenerator.nextInt(10);
			if(i%2<randomInt)
			{
				double randomInt1 = randomGenerator.nextInt(10);
				Circle c =new Circle(randomInt1);
				shapes.add(c);
			}
			else{
				double randomInt2 = randomGenerator.nextInt(10);
				double randomInt3 = randomGenerator.nextInt(10);
				Square s =new Square(randomInt2, randomInt3);
				shapes.add(s);
			}
		}
		
		for(int j=0; j< shapes.size(); j++)
		{
			System.out.println(shapes.get(j)+ "... CLASS : [ "+ shapes.get(j).getClass()+ "]");
		}
		
		Sphere sp = new Sphere(5);
		System.out.println(sp.toString()+ "... CLASS : [ "+ sp.getClass()+ "]");
	}

}
