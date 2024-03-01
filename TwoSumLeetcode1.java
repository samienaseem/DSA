import java.util.ArrayList;

public class TwoSumLeetcode1 {
	public static void main(String[] args) {
		int arr[]= {2,7,11,15};
		int arr2[]= {2,3,4};
		int arr3[]= {3,0,3};
		int arr4[]= {-3,4,3,90};
		int arr5[]= {-1,-2,-3,-4,-5};
		int target=-8;
		
		ArrayList res=twoSum(arr5, target );
		System.out.println("--"+res);
		
	}

	private static ArrayList twoSum(int[] arr, int target) {
		int aux[]=new int[100];
		ArrayList list=new ArrayList();
		
		
		for(int i=0;i<aux.length;i++) {
			aux[i]=-1;
		}
		
		for(int i=0;i<arr.length;i++) {
			
			if(aux[Math.abs(arr[i])]!=-1) {
				list.add(aux[Math.abs(arr[i])]);
				list.add(i);
			}
			
			if(target<0&&arr[i]<0) {
				aux[Math.abs(target)-Math.abs(arr[i])]=i;
			}
			else if(target>=0&&arr[i]<0) {
				aux[target-arr[i]]=i;
			}
			else if(target<0 && arr[i]>=0) {
				aux[arr[i]-target]=i;
			}
            else{
            	if(target-arr[i]>=0)
            		aux[target-arr[i]]=i; 
            }
			
			
			
		}
		return list;
		
		
		
		
		
	}

}
