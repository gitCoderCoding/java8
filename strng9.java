//find longest wrd in list
public class CommonInvt {
	public static void main(String[] args) {

		List<String> name = Arrays.asList("Srirama", "Seeta", "hanuma", "lakshmanudu","Bharatadu","Satrugnudu");
		
	Optional<String> max = name
	.stream()
	.max(Comparator.comparing(String::length));
	
	max.ifPresent(s->System.out.println(s.toUpperCase()));

}
	}
