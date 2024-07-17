public class rangebinary {
   
        public static void main(String args[]){
            int arr[]={11,13,15,17,19,21,23,25,27,28,29,30,31,32,33};//ascending sorted array [0-8 index]
            int target=29;
            int position=binarysearch(arr,target);
            System.out.println(position);
        }
        //search in particular index 
      static int  binarysearch(int arr[],int target)
      {
        int start=7; //start  index
        int end=12; //end index
        while(start<=end)
        {
           int mid=start+(end-start)/2; //formula for calculate small range of   middle element =  start+end/2
            if(arr[mid]==target)   //element found
            {
                return mid;
            }
            if(arr[mid]<target)  // if target element is greater than middle element
            {
                start=mid+1;
            }
            if(arr[mid]>target) // if target element is lesser than middle element
            {
                end=mid-1;
            }
        }
        return -1;//not found
      }
    }
    
    //best case O(1) //minimum number of camparison
    //worst case O(log2(n))  //maximum number of comparison
