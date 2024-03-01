
public class mountainProblem {
    public static void main(String args[]) {
      int mrr[]={4,7,2,4,9,10,1,4,7,3};
      int maxarr[]=new int[mrr.length];
      for(int i=0;i<mrr.length;i++){
    	  int max=mrr[i];
          for (int j=i+1;j<mrr.length;j++){
              if(mrr[j]>=max){
                  max=mrr[j];
              }
          }
          maxarr[i]=max;
      }
      for(int i=0;i<maxarr.length;i++){
          System.out.print(maxarr[i]+" ");
      }
    }
}
//we cn also start this with backwards