import java.util.ArrayList;

public class SpiralPrintMatrix {
	public static void main(String[] args) {
		
		int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
		int mat2[][]={{1,2,3,4,5},{6,7,8,9,0},{11,12,13,14,15}};
		int mat3[][]= {{7},{9},{6}};
		PrintSpiralOrder(mat3);
		
	}

	private static void PrintSpiralOrder(int[][] mat) {
		
		int r=0,c=0,re=mat.length-1,ce=mat[0].length-1;
		ArrayList list=new ArrayList();
		
		while(r<=re&&c<=ce) {
		for(int i=r;i<=ce;i++) {
			System.out.println("--r--"+r);
			System.out.println(mat[r][i]);
			list.add(mat[r][i]);
			
		}
		r++;
		
		for(int i=r;i<=re;i++) {
			System.out.println("--ce--"+ce);
			System.out.println(mat[i][ce]);
			list.add(mat[i][ce]);
			
		}
		ce--;
		if(r>re) {break;}
		for(int i=ce;i>=c;i--) {
			System.out.println("--re--"+re);
			System.out.println(mat[re][i]);
			list.add(mat[re][i]);
		}
		re--;
		if(c>ce) {break;}
		for(int i=re;i>=r;i--) {
			System.out.println("--c--"+c);
			System.out.println(mat[i][c]);
			list.add(mat[i][c]);
		}
		c++;
	
		System.out.println(list);
		
	}
		System.out.println(list);
	}
	
	
		
}
