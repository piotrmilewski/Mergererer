/*Piotr Milewski
  APCS2 pd5
  HW06 -- Split,?,Sorted
  2017-02-12*/

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: 

  ======================================*/

public class Mergesort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    {
	int[] retarr = new int[a.length + b.length];
	int place = 0;
	int acount = 0;
	int bcount = 0;
	while (acount < a.length || bcount < b.length){
	    if (acount >= a.length){
		retarr[place] = b[bcount];
		bcount++;
	    }
	    else if (bcount >= b.length || a[acount] <= b[bcount]){
		retarr[place] = a[acount];
		acount++;
	    }
	    else{
		retarr[place] = b[bcount];
		bcount++;
	    }
	    place++;
	}
	return retarr;
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) 
    {
	int[] a = new int[arr.length/2];
	int[] b = new int[arr.length - arr.length/2];
	if (arr.length == 1){
	    return arr;}
	for (int x = 0; x < a.length; x++){
	    a[x] = arr[x];}
	for (int x = 0; x < b.length; x++){
	    b[x] = arr[a.length + x];}
        return merge(sort(a),sort(b));
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {
	/*
	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

		System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );

	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );

	System.out.println("\nMerging arr1 and arr2: ");
	printArray( merge(arr1,arr2));

	System.out.println("\nMerging arr4 and arr1 and arr2: ");
	printArray( merge(arr4,merge(arr1,arr2)));

	System.out.println("\nMerging arr4 and arr6: ");
	printArray( merge(arr4,arr6) );

	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );
	*/
    }//end main()

}//end class MergeSort

