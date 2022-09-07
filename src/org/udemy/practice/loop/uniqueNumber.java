package org.udemy.practice.loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class uniqueNumber {
	public static void main(String[] args) { 
/*		// TODO Auto-generated method stub

		int[] a ={ 4,5,5,5,-2,6,6,9,-1}; 
		// Print unique number from the list- Amazon  
		//print the string in reverse 
		
		List<Integer> d = new ArrayList<>();
		int n = a[0];
		for (int i=0; i < a.length; i++) {
			
			if(a[i]!=n) {
				
				n=a[i];
				
			}
			d.add(a[i]);
		}
		
		System.out.println(d);
		List<Integer>ab =new ArrayList<Integer>(); 
		for(int i=0;i<a.length;i++) 
		{ 
			int k=0; 
			if(!ab.contains(a[i])) 
			{ 
				ab.add(a[i]); 
				k++; 
				for(int j=i+1;j<a.length;j++) 
				{ 
					if(a[i]==a[j]) 
					{ 
						k++; 
					} 
				} 
				// System.out.println(a[i]);
				//System.out.println(k); 
				if(k==1) 
					System.out.println(a[i]+"is unique number"); 
			} 
		} 
	
		int k=0;
	for (int i=0; i <a.length ; i++)
	{
		
		if(a[i]<k)
		{
			k=a[i];
		}
	}
	System.out.println(k);
	

	for (int i=0; i <a.length ; i++)
	{
		
	}
	
	String ch1, ch2;
	String s = "helloThisIsA1234Sample";
	ch1 = s.replaceAll("[^0-9]", "");
	ch2 = s.replaceAll("[0-9]", "");
	System.out.println(ch1);
	System.out.println(ch2);
	System.out.println(ch1.concat(ch2));
	
	int[] m = {10, 12, 14, 19, 21, 24};
	
	int z = m.length;
	int sum = ((z+1)*(z+2))/2;
	
	for(int i=0; i<z; i++)
	{
		sum-=m[i];
	}
	
	System.out.println(sum);*/
	
	ArrayList<String> names = new ArrayList<String>();
		names.add("Kavya");
		names.add("RajK");
		names.add("Don");
		names.add("Abinay");
		
		
		List<String> names1 = new ArrayList<String>();
		names1.add("Kavya");
		names1.add("RajK");

		ArrayList<String> names2 = new ArrayList<String>();
		
		for(int j=0; j<names.size(); j++)
		{
			for(int i=0; i<names1.size(); i++)
			{
				if(!(names.get(j).equals(names1.get(i)))){

					//System.out.println(names.get(j));
					names2.add(names.get(j));
					
					
				}
				
				//System.out.println(names2);
			}
		}
		System.out.println(names2);
}

}