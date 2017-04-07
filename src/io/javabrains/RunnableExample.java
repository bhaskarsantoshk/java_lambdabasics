package io.javabrains;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread myThread= new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Printed inside Runnable");
			}
			
		});
		
		myThread.run();
		
		Thread myLambdaThread =new Thread(()-> System.out.println("Lambda Runnable"));
		myLambdaThread.run();
	}

}
