//given a list of stngs,grp list of stngs with vowles and no vowels into 2 lists
//
public class CommonInvt {
	public static void main(String[] args) {

		
		
		List<String> name = Arrays.asList("Srirama", "Seetamma", "hanuma", "lakshmanudu","Bharatadu","Satrugnudu","sky");
		
		Predicate<String> pred=s->s.matches(".*[aeiou].*");
		
		
		
		Map<Boolean, List<String>> mapwrd = name
		.stream()
		.collect(Collectors.partitioningBy(pred));
		
		mapwrd.forEach((key,value)->{
			System.out.println(key +"\t" +value);
		});
	}
	}
