package InterviewQuestions;

import java.util.Arrays;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int splitSize = 3;
		splitAndPrint(original, splitSize);
	}

	public static void splitAndPrint(int[] original, int splitSize) {
		for (int i = 0; i < original.length; i += splitSize) {

			int[] ans = Arrays.copyOfRange(original, i, Math.min(original.length, i + splitSize));

			System.out.println(Arrays.toString(ans));
		}
	}
}


//public class Main
//{
//	public static void main(String[] args) {
//		int[] array = {0,1,2,3,4,5,6,7,8,9,10,11,12};
//		int k =3;
//		helper(array, k);
//	}
//	
//	public static void helper(int[] array, int k){
//	    List<int[]> result = new ArrayList<>();
//	    
//	    
//	    int counter = 0;
//	    
//	    int left = 0;
//	    int right = 0;
//	    
//	    while(right < array.length){
//	        
//	        if(counter == k-1){
//	            int[] ans = new int[right - left + 1];
//	            int index = 0;
//	            while(left <= right){
//	               ans[index++] = array[left++];
//	                
//	            }
//	            
//	            result.add(ans);
//	            right++;
//	            left = right;
//	            counter = 0;
//	        }else{
//	            right++;
//	            counter++;
//	        }
//	    }
//	    
//	    while(left < array.length){
//	        int[] ans = new int[array.length - left];
//	            int index = 0;
//	            while(left <= array.length-1){
//	               ans[index++] = array[left++];
//	                
//	            }
//	            
//	            result.add(ans);
//	    }
//	    
//	   for(int i=0;i<result.size();i++){
//	       for(int element : result.get(i)){
//	           System.out.println(element);
//	       }
//	       
//	       System.out.println("-========================");
//	   }
//	}
//}