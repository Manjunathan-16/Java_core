package InterviewQuestions;

public class CamelToSnakeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String camel = "camelCaseString";
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < camel.length(); i++) {
			char curChar = camel.charAt(i);
			if (Character.isUpperCase(curChar)) {
				result.append("_").append(Character.toLowerCase(curChar));
			} else {
				result.append(curChar);
			}
		}
		System.out.println(result);
	}
}
