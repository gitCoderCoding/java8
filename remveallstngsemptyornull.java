//wajp to remve all stngs from list that are empty or null 
public class CommonInvt {
	public static void main(String[] args) {

		List<String> name = Arrays.asList("apple", "", null, null, "null", "", "banana");
		name
		.stream()
		.filter((f->f!=null && !f.isEmpty()))
		.forEach(System.out::println);
	}
	}
