package com.practise.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//rev ls of stngs
public class CommonInvt {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("Srirama", "Seetamma", "hanuma", "lakshmanudu",
				"Bharatadu","Satrugnudu","valmiki");
		
		IntStream.range(0, name.size())
		.mapToObj(m->name.get(name.size()-1-m))
		.forEach(System.out::println);
	}
	}
