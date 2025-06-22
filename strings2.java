//get list of strings where lenght of each ele is >5 and get count
public class CommonInvt {
	public static void main(String[] args) {

		List<String> name = Arrays.asList("Srirama", "Seeta", "hanuman", "lakshmana");
		name
		.stream()
		.filter(f->f.length()>5)
		.forEach(System.out::println);
		
	}

}
