//Jason Lam, Piotr Milewski, Judy Liu
//APCS2 pd5
//HW7: What Does the Data Say?
//2017-02-13

/*======================================
  class MergeSortTester
  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>
  BIG-OH CLASSIFICATION OF ALGORITHM: O(nlog(n))
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>
  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 
  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     * Find the runtime in nanoseconds for Arrays of different sizes
     * Put them into a graph 
     * Figure out which graph it is most similar to
     ******************************/
    public static void main( String[] args )   
{
    int[] arr0 = {0};
    int[] arr1 = {1};
    int[] arr2 = {1,2};
    int[] arr3 = {3,4};
    int[] arr4 = {1,2,3,4};
    int[] arr5 = {4,3,2,1};
    int[] arr6 = {9,42,17,63,0,512,23};
    int[] arr7 = {9,42,17,63,0,9,512,23,9};

    Mergesort.sort(arr7);
    System.out.println(System.nanoTime());
    }//end main

}//end class
