package com.yskill.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPrimitives {
	HashMap<String,Long> contacts=new HashMap<String, Long>();
	
	public HashMapPrimitives() {
		contacts.put("Aarshi",9910037208l);
		contacts.put("Bahiti", 9772760495l);
		contacts.put("Bhavani",95553300015l);
	}

	public void find(String name)
	{
		Long mobile=contacts.get(name);
		System.out.println(name+"'s Mobile no is : "+mobile);
	}
	
	public void addContacts(String name,Long mobile)
	{
		contacts.put(name, mobile);
		System.out.println(contacts);
	}
	
	public void updateMobileNo(String name,Long newMobileNo)
	{
		boolean exists=contacts.containsKey(name);
		if(exists)
			contacts.put(name, newMobileNo);
		else
			System.out.println("Details of "+name +" is not avilable to update..");
	}
	
	public void deleteContact(String name)
	{
		boolean exists=contacts.containsKey(name);
		if(exists)
			contacts.remove(name);
		else
			System.out.println("Contact details for "+name+" is not found.");
	}
	
	public void displayContactsUsingKeys()
	{
		Set<String> keys=contacts.keySet();
		for(String key:keys)
			System.out.println(key+" = "+contacts.get(key));
		
	}
	public void displayContactsUsingMapEntry()
	{
		Set<Map.Entry<String, Long>> me=contacts.entrySet();
		for(Map.Entry<String,Long> entry:me)
			System.out.println(entry.getKey()+" : "+entry.getValue());
	}
	public static void main(String[] args) {
		HashMapPrimitives hm=new HashMapPrimitives();
		System.out.println("=====================================================");
		hm.displayContactsUsingKeys();
		hm.addContacts("Ratna", 7976694711l);
		hm.updateMobileNo("Aarshi",9829837874l);
		System.out.println("=====================================================");
		hm.displayContactsUsingMapEntry();
		hm.deleteContact("Ratna");
		System.out.println(hm.contacts);
		
		
	}

}
