//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
                Arrays.sort(arr);
        for(int i=0; i<n-2; i++) {
            int start = i+1;
            int end = n-1;
            
            while(start<end) {
                int sum = arr[i] + arr[start] + arr[end];
                
                if(sum==0) {
                    return true;
                } 
                else if(sum<0) {
                    start++;
                }else{
                    end--;
                }
            }
        }
        return false;
    }
}


//         boolean found = false;
//         for(int i=0; i<n-2; i++)
//         {
//             for(int j=i+1; j<n-1; j++ )
//             {
//                 for(int k=j+1; k<n; k++){
//                     if(arr[i]+arr[j]+arr[k] == 0){
//                         System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        
//                         found = true;
//                     }
//                 }
//             }
//         }
        
//         if(found== false)
//         {
//             System.out.println("Not Exist");
//         }
        
//         return found;
//     }
    
// public static void main(String[] args)
// {
//     int arr[] = {0, -1, 2, -3, 1};
//     int n = arr.length;
//     findTriplets(arr , n);
// }

// }
    
