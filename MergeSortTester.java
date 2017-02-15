//Team Mergererer - Jason Lam, Piotr Milewski, Judy Liu
//APCS2 pd5
//HW7: What Does the Data Say?
//2017-02-13

/*======================================
  class MergeSortTester
  ALGORITHM:
  Given an array of n items, our algorithm will first split the given array in half until each element of the array is each in its own array. Next, our algorithm will put together the pairs of one-item sorted arrays and merge them. Our algorithm looks at the two elements in the array and puts the smaller number into the returning array until you run out of elements in the pair of arrays. Finally, when the recursive merging is finished, it will return a sorted array with the n items.
  BIG-OH CLASSIFICATION OF ALGORITHM: O(nlog(n))
  Splitting the array in half until you are left with 1 element arrays will result in an execution time of log base 2 of n. Then, merge creates an array of the two arrays that it is combining and the loop to fill the array with both pairs of arrays will take 2n time which is linear. The combination of splitting and looping through each pair of arrays for each split will result in an execution time of nlogn for the Mergesort method of Mergesort.
  Mean execution times for dataset of size n: nlogn
  Batch size: 1
  n=1       time: 15823
  n=10      time: 27798 
  n=100     time: 89379
  n=1000    time: 612399
  n=10^4    time: 3195422
  n=10^5    time: 20954991
  n=10^6    time: 166387766
  n=10^7    time: 1758323942
  n=10^8    time: 17939008145

  ...
  n=<huge>  time: 17939008145 (most it went without crashing pc)
  ANALYSIS:
  Since the execution time is nlogn, the runtime for a small array is small in comparison to an array of size 10^8. However, when the array starts passing the length of 10^7 elements, the runtime becomes longer than a second and when you pass 10^9 length, the terminal won't even output a reading. We had predicted that the runtime for Mergesort was nlogn and based on the tests in our main method, we can justify this hypothesis that the runtime is linear times logarithmic. Another conclusion that we stumbled upon is the fact that Mergesort does not have a best nor worst case scenario especially with the way we coded out Mergesort. It does not have an early escape feature if the array is already sorted so it will always splice the array into half until it reaches a 1-item array and then using a linear runtime put them back together. The runtime is solely dependent on the length of the array given as a parameter.
  ======================================*/

public class MergeSortTester 
{

    public static int[] createArr(int num){
	int[] retarr = new int[num];
	for (int x = 0; x < num; x++){
	    retarr[x] = (int)Math.random() * 25;
	}
	return retarr;
    }
    
    /******************************
     * execution time analysis 
     * Our test included running a loop for sizes of arrays of increasing by a factor of 10 so we could notice when the program was beginning to show signs of slowing down. It utilized the createArr() method that would create the array for size n and using this array it would generate an output of runtimes for the mergesort method by inputting the array into the mergesort method. We also found that adding the print statements together into a variable took more time than printing each run of the Mergesort method's runtime.
     * Find the runtime in nanoseconds for Arrays of different sizes (endtime - start time)
     * Put them into a graph 
     * Figure out which graph it is most similar to
     ******************************/
    public static void main( String[] args )   {
	long before, after;
	int[] arr0 = createArr(1);
	int[] arr1 = createArr(10);
	int[] arr2 = createArr(100);
	int[] arr3 = createArr(1000);

	before = System.nanoTime();
	Mergesort.sort(arr0);
	after = System.nanoTime();
	System.out.println("ignore this value: " + (after - before));

	for (int x = 0; x < 9; x++){
	    before = System.nanoTime();
	    Mergesort.sort(createArr((int)Math.pow(10, x)));
	    after = System.nanoTime();
	    System.out.println("Arr of length 10^" + x + ": " + (after - before) + "\n");
	}

    }//end main

}//end class
