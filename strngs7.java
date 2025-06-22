//get length of each name in list
public class CommonInvt {
	public static void main(String[] args) {

		List<String> name = Arrays.asList("Srirama", "Seeta", "hanuman", "lakshmana","lakshmana");
		
	name
	.stream()
	.map(m->m.length())
	.forEach(System.out::println);

}
	}