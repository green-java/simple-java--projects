public class rangelinear {
    
public static void main(String args[])
{
int arr[]={12,23,44,34,89,34,90,122,34,56,78,99,10};
int target=34;

int position=linearsearch(arr,target);
System.out.println("Index of the target element"+position);
}

//search in particular range

static int linearsearch(int arr[],int target)
{
    int start=5; //starting index
    int end=10; //ending index

    for(int i=start;i<=end;i++)
    {
        if(arr[i]==target)
        {
            return i;
            //best case O(1) [ find the target element in first index during search ]
            //worst case O(n)  [never find the target element until last index during search ]
        }
    }
    return -1; //not found
}




}





