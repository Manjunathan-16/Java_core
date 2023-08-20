
interface Parser {
	String parse(String str);
}

class StringParser {
	public static String convert(String s) {
		if (s.length() <= 3)
			s = s.toUpperCase();
		else
			s = s.toLowerCase();

		return s;
	}
}

class Printer {
	public void print(String str, Parser p) {
		str = p.parse(str);
		System.out.println(str);
	}
}

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Man";
		Printer p = new Printer();
		// Calling by method
		p.print(str, (StringParser::convert));
		// By Lambda function
		p.print(str, (s) -> StringParser.convert(s));
	}

}
