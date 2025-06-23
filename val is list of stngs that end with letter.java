//given list of stngs,crete a map where key is last letter of stng,val is list of stngs that end with letter
public class CommonInvt {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("Srirama", "Seetamma", "hanuma", "lakshmanudu","Bharatadu","Satrugnudu","valmiki");
		
		name
		.stream()
		.collect(Collectors.groupingBy(s->s.charAt(s.length()-1)))
		.forEach((key,value)->{
			System.out.println(key +"\t" +value);
		});
	}
	}
