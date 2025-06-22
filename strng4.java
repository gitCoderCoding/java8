//get list of stgns hav particular word
public class CommonInvt {
	public static void main(String[] args) {

		List<String> name = Arrays.asList("Srirama", "Seeta", "hanuman", "lakshmana","lakshmana");
		name
		.stream()
		.filter(f->f.startsWith("S"))
		.forEach(System.out::println);
		
	}

}