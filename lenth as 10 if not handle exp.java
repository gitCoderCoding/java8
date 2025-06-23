package com.practise.eight;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

//given list of stngs,find 1st ele hav lenth as 10 if not handle exp
public class CommonInvt {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("Srirama", "Seetamma", "hanuma", "lakshmanudu",
				"Bharatadu","Satrugnudu","valmiki","12352");
		
		String val=name
		.stream()
		.filter(s->s.length()>10) 
		.findAny()
		.orElseThrow(()->new NoSuchElementException("no val"));
		System.out.println(val);
	}
	}
