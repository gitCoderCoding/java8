//wajp to create new list of strngs ,where ech stng is rev from org list ,using strams
public class CommonInvt {
	public static void main(String[] args) {

		List<String> name = Arrays.asList("Srirama", "Seeta", "hanuma", "lakshmanudu","Bharatadu","Satrugnudu");
		name
		.stream()
		.map(s->new StringBuilder(s).reverse())
		.forEach(System.out::println);
	}
	}
