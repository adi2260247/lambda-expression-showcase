package org.self.learn;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.self.learn.Person.Sex;

public class SocialNetworking {

	public static void main(String[] args) {
		// Invoke custom method
		processElements(
				() -> {
					return Arrays.asList(
						new Person("X", LocalDate.of(1986, 6, 29), Sex.MALE, "x@abc.com"),
						new Person("Y", LocalDate.of(1992, 1, 31), Sex.MALE, "y@abc.com")
						);
				}, 
				p -> p.getGender() == Sex.MALE
					&& p.getDob().getYear() > 1990, 
				p -> p.getEmailAddress(), 
				email -> System.out.println(email)
				);
		
		// Use Aggregate Operations
		Arrays.asList(
				new Person("X", LocalDate.of(1986, 6, 29), Sex.MALE, "x@abc.com"),
				new Person("Y", LocalDate.of(1992, 1, 31), Sex.MALE, "y@abc.com")
				)
		.stream()
		.filter(p -> p.getGender() == Sex.MALE
					&& p.getDob().getYear() > 1990)
		.map(p -> p.getEmailAddress())
		.forEach(email -> System.out.print(email));
	}
	
	public static <X, Y> void processElements(
			Supplier<Iterable<X>> source, 
			Predicate<X> tester, 
			Function <X, Y> mapper, 
			Consumer<Y> block) {
		
	    for (X p : source.get()) {
	        if (tester.test(p)) {
	            Y data = mapper.apply(p);
	            block.accept(data);
	        }
	    }
	}
}
