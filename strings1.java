convt a list of stgs to uppcase,sort them and print
public class CommonInvt {
	public static void main(String[] args) {

		ListString name = Arrays.asList(Srirama, Seeta, hanuman, lakshmana);
		name
		.stream()
		.map(m - m.toUpperCase())
		.sorted()
		.forEach(System.outprintln);

	}
