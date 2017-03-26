package io.javabrains;

public class TypeInferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringLengthLambda myLambda=(String s)-> s.length();

		StringLengthLambda myLambda2=(s)-> s.length();
		
		StringLengthLambda myLambda3=s-> s.length();
		System.out.println(myLambda.getLength("Hello Lambda"));
		System.out.println(myLambda2.getLength("Hello Lambda"));
		System.out.println(myLambda3.getLength("Hello Lambda"));
		
		printLambda(s->s.length());

	}
	
	public static void printLambda(StringLengthLambda l){
		System.out.println(l.getLength("Hello Lambda"));
	}
	
	interface StringLengthLambda{
		int getLength(String s);
	}

}


//OutPut
//12
//12
//12
//12
