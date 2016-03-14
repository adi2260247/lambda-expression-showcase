package org.self.learn;

public class LambdaExpressionBasics {
	
	public static void main(String[] args) {
		new Runner().run(new Executable() {
		
			@Override
			public String execute(int num) {
				System.out.println("I am inside an anonymous class definition");
				return "Anonymous class";
			}
		});
		
		System.out.println("*************************************");
		new Runner().run((a) -> "Lambda executable");
		
		System.out.println("*************************************");
		new Runner().run((int a) -> {
			System.out.println("I am inside a Lambda executable block");
			return "Lambda executable block with arg: "+a;
		});
		
		System.out.println("*************************************");
		new Runner().run((int a) -> {
			System.out.println("I am inside a Lambda executable block");
			return "Lambda executable block with arg: "+ a + " and different style";
		});
		
		System.out.println("*************************************");
		new Runner().run(a -> {
			System.out.println("I am inside a Lambda executable block");
			return "Lambda executable block with arg: "+ a + " and yet another style";
		});
		
		System.out.println("*************************************");
		new Runner().run((a, b) -> {
			System.out.println("I am inside a Lambda executable block");
			return a + b;
		});
		
	}

}
