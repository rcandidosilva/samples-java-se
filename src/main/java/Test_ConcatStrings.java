
public class Test_ConcatStrings {

	public static void main(String[] args) {
		
		//StringBuffer buffer = new StringBuffer();
		//StringBuilder buffer = new StringBuilder();
		StringBuffer buffer = "teste";
		
		for (int x = 0; x < 100; x++) {
			buffer.append("substring");
		}
		
		String resultadoFinal = buffer.toString();
		
	}
	
	
}