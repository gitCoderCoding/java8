
get lst og stng havng vowels
public class CommonInvt {
	public static void main(String[] args) {

		ListString name = Arrays.asList(Srirama, Seeta, hanuma, lakshmanudu,Bharatadu,Satrugnudu);
		name
		.stream()
		.filter(f-f.matches(.[aeiou].))
		.forEach(System.outprintln);
}
	}
