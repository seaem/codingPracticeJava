/* Formally speaking, two elements a[i] and a[j] form an inversion 

                            
                            if a[i] > a[j] and i < j

                            i.e if a[i] > a[j] & i<j  increment count


Example:
The sequence 2, 4, 1, 3, 5 has 3 inversions (2, 1), (4, 1), (4, 3). 
8, 12, 3, 10, 15 has 3 inversions (8, 3), (12, 3), (12, 10)
1, 20, 6, 4, 5 has 5 inversions (20, 6), (20, 4), (20, 5), (6, 4) and (6, 5).

Running Time of this code - O(n*n)
*/

import java.util.Scanner;

public class InversionCount{

	public static int inverseCount(int[] array,int N){

		int count = 0;

		for(int i=0;i<N-1;i++){
			for (int j=i+1;j<N ;j++ ) {
				if (array[i]>array[j])
					count++;			
		}
	}

		return count ;
	}

	public static void main(String args[]){

		Scanner scanf = new Scanner(System.in);

		System.out.println("Testing inversion count\n");

		int N,i;

		System.out.println("Enter size of array");
		N = scanf.nextInt();

		int arr_req[] = new int[N];

		System.out.println("\nEnter "+ N +" integer elements");

		for (i = 0; i < N; i++)
            arr_req[i] = scanf.nextInt();

        int count = inverseCount(arr_req,N);

        System.out.println("Count is " + count);

	}
}
