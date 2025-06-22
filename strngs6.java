//find 1st ele in list that starts with part letter
public class CommonInvt {
	public static void main(String[] args) {

		List<String> name = Arrays.asList("Srirama", "Seeta", "hanuman", "lakshmana","lakshmana");
		Optional<String> findFirst = name
		.stream()
		.filter(f->f.startsWith("S"))
		.findFirst();
		if (findFirst.isPresent()) 
		{
			String val = findFirst.get();
			System.out.println(val);
		}
	}

}
