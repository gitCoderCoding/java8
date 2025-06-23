//given list of stngs,grp list of stngs by leng of stng
public class CommonInvt {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("Srirama", "Seetamma", "hanuma", "lakshmanudu","Bharatadu","Satrugnudu","valmiki");
		
		name
		.stream()
		.collect(Collectors.groupingBy(String::length))
		.forEach((key,value)->{
			System.out.println(key +"\t" +value);
		});
		
	}
	}
