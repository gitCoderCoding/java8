import java.util.Arrays;
import java.util.List;

//given list of stngs,print only stng ele wxlcung digits
public class CommonInvt {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("Srirama", "Seetamma", "hanuma", "lakshmanudu",
				"Bharatadu","Satrugnudu","valmiki","12352");
		
		name
		.stream()
		.filter(f->!f.matches(".*[0-9].*"))
		.forEach(System.out::println);
	}
	}
