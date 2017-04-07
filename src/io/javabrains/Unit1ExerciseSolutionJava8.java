package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person>  people= Arrays.asList(
				new Person("Santosh", "Bhaskar", 24),
				new Person("Clark", "Kent", 24),
				new Person ("Diana", "Princess",22),
				new Person("Barry", "Allen", 24),
				new Person("Arthur", "Curry", 24));
		
		//Step1: Sort list by Last name
		
		Collections.sort(people, ( p1,  p2)->p1.getLastName().compareTo(p2.getLastName()));		
		
		//Step2: Create a method that prints all elements in the list
		
		printAll(people);
		//Step 3: Create a method that prints all people that have age 24
		
		//printAge24(people);
		
		//Step 4: Create a method that prints all people that have last name begin with C
		
		//printLastNameBeginningWithC(people);
		
		System.out.println("Print Conditionally with all the people whose last Name begins with C");
		
		printConditionally(people, p->p.getLastName().startsWith("C"));		

		System.out.println("Print Conditionally with all the people whose first Name begins with S");
		
		printConditionally(people, p->p.getFirstName().startsWith("S"));		


	}

	private static void printAge24(List<Person> people) {
		// TODO Auto-generated method stub
		for(Person p: people){
			if(p.getAge()==24){
				System.out.println(p);
			}
		}
		
	}

	private static void printLastNameBeginningWithC(List<Person> people) {
		// TODO Auto-generated method stub
		
		for(Person p:people){
			if(p.getLastName().startsWith("C")){
				System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		// TODO Auto-generated method stub
		
		for(Person p: people){
			System.out.println(p);
		}
		
	}
	
	private static void printConditionally(List<Person> people, Condition condition){
		for(Person p:people){
			if(condition.test(p)){
				System.out.println(p);
			}
		}
	}
 

}
