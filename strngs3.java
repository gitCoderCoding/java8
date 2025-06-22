//remove duplicare from list
public class CommonInvt {
	public static void main(String[] args) {

		List<String> name = Arrays.asList("Srirama", "Seeta", "hanuman", "lakshmana","lakshmana");
		name
		.stream()
		.distinct()
		.forEach(System.out::println);
		
	}

}