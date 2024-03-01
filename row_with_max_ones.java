
public class row_with_max_ones {
	public static void main(String...args) {
		int matt[][]= {{0,1},{1,0}};
		int matt2[][]= {{0,1},{1,1},{0,0}};
		
		int result[]=row_with_max_ones(matt);
		System.out.println(result[0]+" "+result[1]);

	}
	
    private static int[] row_with_max_ones(int[][] mat) {
    	int countmax=0;
        int x[]=new int[2];
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[i].length;j++){

                if(mat[i][j]==1){
                    count+=1;
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
