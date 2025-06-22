//wajp to remove strngs that strsts with specific wprd usng streams
public class CommonInvt {
	public static void main(String[] args) {

		List<String> name = Arrays.asList("Srirama", "Seeta", "hanuman", "lakshmana","lakshmana");
		name
		.stream()
		.filter(f->!f.startsWith("S"))
		.forEach(System.out::println);
		
	}

}