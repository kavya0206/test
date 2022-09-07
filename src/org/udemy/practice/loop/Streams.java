package org.udemy.practice.loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Streams {
	public static void main(String[] args) { 
		ArrayList<String> names = new ArrayList<String>();
		names.add("Kavya");
		names.add("RajK");
		names.add("Don");
		names.add("Abinay");
		
		//there is no life for intermediate operation if there is no terminal operation
		
		long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		names.stream().filter(s->s.startsWith("A")).limit(1).forEach(s->System.out.println(s));
		long d = Stream.of("Kavya","Raj","Abi","Abinay").filter(s->
		{
			s.startsWith("A");
			return true;
			
		}).count();
		System.out.println(d);
		
		//print names >3 in list		
		names.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
		
		//print 1st name which is >3
		names.stream().filter(s->s.length()>3).limit(1).forEach(s->System.out.println(s));
		
		//print names with last letter "a" in uppercase
		//to manipulate the results we can use map in streams
		names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print names which starts with A with uppercase and sorted
		
		List<String> name = Arrays.asList("Kavya","Raj","Anu","Abinaya","Abi");
		name.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
		
		//Merging to lists
		Stream<String>newNames = Stream.concat(names.stream(), name.stream());
		//newNames.sorted().forEach(s->System.out.println(s));
		
		//to verify the name is present in the new list
		boolean flag = newNames.anyMatch(s->s.equalsIgnoreCase("Raj"));
		Assert.assertTrue(flag);
		System.out.println(flag);
		
		
		//collect the results ad convert into list
		
		List<String> newList = Stream.of("Kavya","Raj","Abi","Abinay").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(newList.get(0));
		
		List<Integer> num = Arrays.asList(1,2,3,5,5,6,3,7,7,9);
		
		
		num.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		List<Integer> n =num.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(n.get(3));
	}
}
