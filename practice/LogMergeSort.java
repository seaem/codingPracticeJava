/* Merge Sort with O(NlogN) time complexity
  Dividing takes logN whereas merging has O(n) complexity
*/

import java.util.Scanner;

public class LogMergeSort{


	public static void MergeSort(int[] array){

		if (array.length<=1) {
			return;			
		}

		int mid = (array.length)/2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[array.length-mid];

		for(int i=0;i<mid;i++)
			leftArray[i]=array[i];
		for(int i=0;i<(array.length-mid);i++)
			rightArray[i]=array[mid+i];

		MergeSort(leftArray);
		MergeSort(rightArray);


		int i=0,j=0,k=0;

		while(i<leftArray.length && j<rightArray.length){
			if (leftArray[i]>rightArray[j]) {
				array[k]=rightArray[j];
				j=j+1;				
			}
			else{
				array[k]=leftArray[i];
				i=i+1;
			}
			k=k+1;
		}

		while(i<leftArray.length){
			array[k]=leftArray[i];
			i=i+1;
			k=k+1;
		}

		while(j<rightArray.length){
			array[k]=rightArray[j];
			j=j+1;
			k=k+1;
		}


	}

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("MergeSort Test\n");

	  int N,i;

	  System.out.println("Enter size of array");
	  N = scan.nextInt();

	  int arr_req[] = new int[N];

	  System.out.println("\nEnter "+ N +" integer elements");

	  for (i = 0; i < N; i++)
            arr_req[i] = scan.nextInt();

    MergeSort(arr_req);

    System.out.println("\nElements after sorting ");        
        for (i = 0; i < N; i++)
            System.out.print(arr_req[i]+" ");            
        System.out.println();    

	}



}
