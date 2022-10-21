package com.yskill.maps.customeKey;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapCustomKeyValue {

	HashMap<Identity,Person> persons=new HashMap<Identity,Person>();
	
	public HashMapCustomKeyValue() {
		persons.put(new Identity(2675,8976), new Person("Uttam", "uttampatel0811@gmail.com", 11));
		persons.put(new Identity(2836,8124), new Person("Gargesh", "gargesh1618@gmail.com", 18));
		persons.put(new Identity(2724,8733), new Person("Neel", "neelkanth@gmail.com", 24));
		persons.put(new Identity(2264,8326), new Person("Mayur", "mayur@gmail.com", 42));
		persons.put(new Identity(2675,8976), new Person("Uttam", "uttampatel0811@gmail.com", 11));
	}
	public void findPerson(Person p2)
	{
		Set<Identity> keys=persons.keySet();
		for(Identity key:keys)
		{
			Person p1=persons.get(key);
			if(p1.equals(p2))
				System.out.println("Person details found with "+key);
		}
	}
	public void sortedByKeys()
	{
		TreeMap<Identity,Person> sortedMap=new TreeMap<Identity,Person>(persons);
		System.out.println("Sorted By Keys ......");
		System.out.println(sortedMap);
	}
	public void printAllPersonDetails()
	{
		System.out.println(persons);
	}
	public static void main(String[] args) {
		HashMapCustomKeyValue kv=new HashMapCustomKeyValue();
		kv.printAllPersonDetails();
		kv.findPerson(new Person("Uttam", "uttampatel0811@gmail.com", 11));
		System.out.println("===================================================");
		kv.sortedByKeys();

	}

}
