//given a list of stngs,grp list of stngs by the 1st letter of each string 
//s srirama seeta
//h hanuma
public class CommonInvt {
	public static void main(String[] args) {

		List<String> name = Arrays.asList("Srirama", "Seetamma", "hanuma", "lakshmanudu","Bharatadu","Satrugnudu");
		Map<Character, List<String>> map = name
		.stream()
		.collect(Collectors.groupingBy(s->s.charAt(0)));
		map.forEach((key,value) ->{
			System.out.println(key+  "\t" +value);
		});
		
		
	}
	}
