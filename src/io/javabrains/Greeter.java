package io.javabrains;

public class Greeter {
	
	public void greet(Greeting greeting){
		greeting.perform();
	}

	public static void main(String[] args) {		
		Greeter greeter=new Greeter();
		HelloWorldGreeting helloWorldGreeting =new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
		Greeting myLambdaExpression=() -> System.out.println("Hello World");
		
		MyAdd addFn=(int a, int b) ->a+b;
		
		myLambdaExpression.perform();
		
		//Anonymous inner class: Creating an implementation of Greeting interface
		Greeting innerClassGreeting=new Greeting(){
			public void perform(){
				System.out.println("Hello World");
			}
		};
		
		innerClassGreeting.perform();
		
		greeter.greet(myLambdaExpression);
		greeter.greet(innerClassGreeting);

	}
	
	

}

interface MyLamda{
	void foo();
	
}

interface MyAdd{
	int addFn(int a, int b);
}
