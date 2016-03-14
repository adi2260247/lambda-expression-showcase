package org.self.learn;

public class Runner {
	public void run(Executable e) {
		String message = e.execute(12);
		System.out.println("Runner: "+message);
	}
	
	public void run(TwoParamExecutable te) {
		System.out.println("Sum: " + te.add(5, 7));
	}
}
