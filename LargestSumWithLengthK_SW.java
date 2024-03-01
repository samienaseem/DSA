//Example 4: Given an integer array nums and an integer k, find the sum of the subarray
//with the largest sum whose length is k.
public class LargestSumWithLengthK_SW {
	public static void main(String[] args) {
		int num[]= {3,-1,4,12,-8,5,6};
		int k=4;
		
		int res=largestSum(num,k);
		System.out.println("Result "+res);
	}

	private static int largestSum(int[] num, int k) {
		int left=0;
		int curr=0;
		int sum=0;
		int maxsum=0;
		int ts[]=new int[5];
		
		for(int r=0;r<num.length;r++) {
			curr++;
			
			while(curr>k) {
				System.out.println("--sumwwhile--"+sum);
				ts[left]=sum;
				sum=sum-num[left];
				left++;
				curr--;
				
			}
			sum=sum+num[r];
			if(sum>maxsum) {
				maxsum=sum;
			}
			System.out.println("--sum--"+sum);
			
			
		}
		
		for(int i=0;i<ts.length;i++) {
			System.out.println("--ts--"+ts[i]);
		}
		
		return maxsum;
		
		
	}
	

}


//public int findBestSubarray(int[] nums, int k) {
//    int curr = 0;
//    for (int i = 0; i < k; i++) {
//        curr += nums[i];
//    }
//
//    int ans = curr;
//    for (int i = k; i < nums.length; i++) {
//        curr += nums[i] - nums[i - k];
//        ans = Math.max(ans, curr);
//    }
//
//    return ans;
//}
