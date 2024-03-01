//Example 2: You are given a binary string s (a string containing only "0" and "1"). 
//You may choose up to one "0" and flip it to a "1". What is the length of the longest substring achievable 
//that contains only "1"?
//For example, given s = "1101100111", the answer is 5. If you perform the flip at index 2, 
//the string becomes 1111100111.
public class SlidingWindow1 {
	
	public static void main(String[] args) {
		String str="1101100111";
		String str2="1100011011";
		int res=longestLength(str2);
		System.out.println(res);
	}
// 1 1 0 1 1 0 0 1 1 1
// 1 1 0 0 0 1 1 1 0 1
	private static int longestLength(String str) {
		
		int right=0,left=0,count=0,len=0,ans=0;
		
		for(int r=0;r<str.length();r++) {
			
			if(str.charAt(r)=='0') {
				count++;
			}
			
			while(count>1) {
				System.out.println("--left--"+left);
				System.out.println("--right--"+r);
				System.out.println("--count--"+count);
				System.out.println("--------------");
				if(str.charAt(left)=='0') {
					count--;
				}
				left++;
				
			}
			 ans=Math.max(ans, r-left+1);
			
			
		}
		return ans;
		
		
		
	}

}
