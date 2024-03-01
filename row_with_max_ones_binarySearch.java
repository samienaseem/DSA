 public class row_with_max_ones_binarySearch {
	public static void main(String...args) {
		int matt[][]= {{0,1},{1,0}};
		int matt2[][]= {{0,1},{1,1},{0,0}};
		int matt3[][]= {{0,0,0},{1,1,1},{0,0,1}};
	
		
		int result[]=row_with_max_ones(matt3);
		System.out.println(result[0]+" "+result[1]);

	}
	
    private static int[] row_with_max_ones(int[][] mat) {
    	int countmax=0;
        int x[]=new int[2];
        for(int i=0;i<mat.length;i++){
            int count=0;
            int low=0,high=mat[i].length-1;
            
            	while(low<=high) {
            		
            		int mid=(low+high)/2;
            		System.out.println("--i--"+i);
            		System.out.println("--mid--"+mid);
            		System.out.println("--low--"+low);
            		System.out.println("--high--"+high);
            		System.out.println("-----------");
            		
            		if(mat[i][mid]==1) {
            			
            			if(mid==0||mat[i][mid-1]==0) {
            				count=mat[i].length-mid;
            			}
            			high=mid-1;
            		}
            		else {
            			low=mid+1;
            		}
            		
            	}
            
            if(count>countmax){
            	System.out.println(i+"--i--");
            	System.out.println(count+"--count--");
            	System.out.println(countmax+"--countmax--");
                countmax=count;
                x[0]=i;
                x[1]=countmax;
            }
        }
        return x;
		
		
	}
}
