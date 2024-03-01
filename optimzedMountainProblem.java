
public class optimzedMountainProblem {
	
	public static void main(String args[]) {
	      int mrr[]={4,7,2,4,9,10,1,4,7,3};
	      int maxarr[]=new int[mrr.length];
	      int max=mrr[mrr.length-1];
	      int n=mrr.length-1;
	      maxarr[n]=mrr[n];
	      for(int i=n-1;i>=0;i--){
	    	  if(mrr[i]>=max) {
	    		  max=mrr[i];
	    	  }
	    	  maxarr[i]=max;
	      }
	      for(int i=0;i<maxarr.length;i++){
	          System.out.print(maxarr[i]+" ");
	      }
	    }

}
