//sort the list of stngs based on their lentg in asc/desc ordr
public class CommonInvt {
	public static void main(String[] args) {

		List<String> name = Arrays.asList("Srirama", "Seeta", "hanuma", "lakshmanudu","Bharatadu","Satrugnudu");
		
	name
	.stream()
    .sorted(Comparator.comparing(String::length))//Seeta
//    hanuma
//    Srirama
//    Bharatadu
//    Satrugnudu
//    lakshmanudu
    //.sorted(Comparator.comparing(String::length).reversed()) //desc order
	.forEach(System.out::println);

}
	}
