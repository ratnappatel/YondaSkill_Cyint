package com.yskill.maps.tree;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapPrimitive {

	TreeMap<String,String> emails=new TreeMap<String,String>();
	public TreeMapPrimitive() {
		emails.put("Ratna","ratnappatel@gmail.com");
		emails.put("Kalpana","kalpu@gmail.com");
		emails.put("Pinakin", "drpinakinp@gmail.com");
		emails.put("Ketan", "ketna.neel@gmail.com");
		emails.put("Manorama", "man@gmail.com");
	}
	public void print()
	{
		Set<String> keys=emails.keySet();
		for(String key:keys)
			System.out.println(key+" : "+emails.get(key));
	}
	public static void main(String[] args) {
		TreeMapPrimitive tm=new TreeMapPrimitive();
		tm.print();

	}

}
