package String;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "flower", "flow", "flight" };
		String ans = strs[0];
		
		if(strs.length != 0 || strs == null) {
			System.exit(1);
		}
		for(int i=0;i<strs.length;i++) {
			while(strs[i].indexOf(ans) != 0) {
				ans = ans.substring(0,ans.length()-1);
			}
		}
		System.out.println(ans);
	}

}
