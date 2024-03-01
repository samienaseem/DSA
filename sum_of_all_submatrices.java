//Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.

//A = [ [1, 1]
//      [1, 1] ] ans =16
public class sum_of_all_submatrices {
	
	public static void main(String[] args) {
		
		int mat[][]= {{1,2},{3,4}};
		
		int res=countSubmatrices(mat);
		System.out.println(res);
	}

	private static int countSubmatrices(int[][] mat) {
		int sum=0;
		int R=mat.length;
		int C=mat[0].length;
		
		for(int r=0;r<R;r++) {
			for(int c=0;c<C;c++) {
				
				int freq=(r+1)*(c+1)*(R-r)*(C-c);
				sum+=mat[r][c]*freq;
				System.out.println("freq "+freq);
				System.out.println("----------");
				
			}
		}
		return sum;
		
	}
	
	
}
