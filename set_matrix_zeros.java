//Given a matrix, A of size M x N of 0s and 1s. If an element is 0, set its entire row and column to 0.
public class set_matrix_zeros {
	
	public static void main(String[] args) {
		int mat[][]= {{1,0,1},{1,1,1},{1,1,1}};
		int mat1[][]= {{1,0,1},{1,1,1},{1,0,1}};
		
		setZeros(mat1);
	}

	private static void setZeros(int[][] mat) {
		
		int row[]=new int[mat.length];
		int col[]=new int[mat[0].length];
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				
				if(mat[i][j]==0) {
					row[i]=1;
					col[j]=1;
				}
			}
		}
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				
				if(row[i]==1||col[j]==1) {
					mat[i][j]=0;
				}
			}
		}
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				
				System.out.print(mat[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		
		
		
				
		
	}

}
