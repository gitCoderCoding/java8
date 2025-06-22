//cnvt a list of strng s into single stng sepereted by commas
public class CommonInvt {
	public static void main(String[] args) {

		List<String> name = Arrays.asList("Srirama", "Seeta", "hanuma", "lakshmanudu","Bharatadu","Satrugnudu");
		String wrd = name
		.stream()
		.collect(Collectors.joining(","));
System.out.println(wrd);
	}
	}
