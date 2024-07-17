public class linearsrch
{
public static void main(String args[])
{
int arr[]={12,23,44,34,89,34,90};
int target=34;
int position=linearsearch(arr,target);
System.out.println("Index of the target element"+position);
}
static int linearsearch(int arr[],int target){
    for(int i=0;i<=arr.length;i++){
        if(arr[i]==target){
            return i;
            //best case O(1) [ find the target element in first index during search ]
            //worst case O(n)  [never find the target element until last index during search ]
        }
    }
    return -1;
}




}




