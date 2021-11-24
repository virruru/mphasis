package com.java.gen;

import java.util.ArrayList;
import java.util.List;

import com.java.day2.Employ;

public class GenEmploy {
	
	public static void main(String[] args) {
		
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Anshual", 99322));
		//employList.add(1);
		employList.add(new Employ(3,"Poortna",99211));
		employList.add(new Employ(4, "Darshan", 99255));
		employList.add(new Employ(5, "Bharath", 95663));
		employList.add(new Employ(6, "Uday", 99421));
		employList.add(new Employ(7, "Narendra", 99225));
		for (Employ employ : employList) {
			System.out.println(employ);
		}
		//String s1="Uday";
		//s1.concat(" Prakash");
		//String s1="Uday";
		//s1+=" Prakash";
	}
}
