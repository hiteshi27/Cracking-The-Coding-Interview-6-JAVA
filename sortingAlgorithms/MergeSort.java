package sortingAlgorithms;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr={5,1,4,2,8,7,0,9};
		System.out.print("\n\n un-sorted array: ");
		printArray(arr);
		arr=mergeSort(arr);
		System.out.print("\n\n sorted array: ");
		printArray(arr);
		
		int[] arr1={5,1,4,2,8,7,0,9};
		System.out.print("\n\n un-sorted array: ");
		printArray(arr1);
		arr1=mergeSortIterative(arr1);
		System.out.print("\n\n sorted array: ");
		printArray(arr1);
	}

	public static int[] mergeSort(int arr[]){
		int n=arr.length;
		if(n<=1){
			return arr;
		}
		int m=n/2;
		int[] arrL=new int[m];
		int[] arrR=new int[n-m];
		for(int i=0;i<arrL.length;i++){
			arrL[i]=arr[i];
		}
		for(int i=0;i<arrR.length;i++){
			arrR[i]=arr[i+m];
		}


		return merge(mergeSort(arrL),mergeSort(arrR));
	}

	public static int[] merge(int arrL[],int arrR[]){
		int arr[]=new int[arrL.length+arrR.length];

		int i = 0, j = 0;
		for (int k = 0; k < arr.length; k++) {
			if(i >= arrL.length){
				arr[k] = arrR[j++];
			}
			else if (j >= arrR.length){
				arr[k] = arrL[i++];
			}
			else if (arrL[i] <= arrR[j])  {
				arr[k] = arrL[i++];
			}
			else      {    
				arr[k] = arrR[j++];
			}
		}
		return arr;
	}
	public static void printArray(int arr[]){
		System.out.print("\n\n");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.print("\n\n");
	}
	
	public static int[] mergeSortIterative(int array[]){
	
		if(array==null)
        {
            return array;
        }
 
        if(array.length > 1)
        {
            int mid = array.length / 2;
 
            // Split left part
            int[] left = new int[mid];
            for(int i = 0; i < mid; i++)
            {
                left[i] = array[i];
            }
             
            // Split right part
            int[] right = new int[array.length - mid];
            for(int i = mid; i < array.length; i++)
            {
                right[i - mid] = array[i];
            }
            left=mergeSortIterative(left);
            right=mergeSortIterative(right);
 
            int i = 0;
            int j = 0;
            int k = 0;
       
//            // Merge left and right arrays
//            while(i < left.length && j < right.length)
//            {
//                if(left[i] < right[j])
//                {
//                    array[k] = left[i];
//                    i++;
//                }
//                else
//                {
//                    array[k] = right[j];
//                    j++;
//                }
//                k++;
//            }
//            // Collect remaining elements
//            while(i < left.length)
//            {
//                array[k] = left[i];
//                i++;
//                k++;
//            }
//            while(j < right.length)
//            {
//                array[k] = right[j];
//                j++;
//                k++;
//            }

        	for ( k = 0; k < array.length; k++) {
        		
        		if(i>=left.length){
        			array[k]=right[j];
        			j++;
        		}
        		else if(j>=right.length){
        			array[k]=left[i];
        			i++;
        		}else if(left[i]<=right[j]){
        			array[k]=left[i];
        			i++;
        					
        		}else {
        			array[k]=right[j];
        			j++;
        		}
        		
        		
//        		
//    			if(i >= left.length){
//    				array[k] = right[j++];
//    			}
//    			else if (j >= right.length){
//    				array[k] = left[i++];
//    			}
//    			else if (left[i] <= right[j])  {
//    				array[k] = left[i++];
//    			}
//    			else      {    
//    				array[k] = right[j++];
//    			}
    		}
        }	
		return array;
		
	}
}
