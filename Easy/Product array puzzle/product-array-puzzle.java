//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long [] ans=new long[n];
        int isZero=0;
        int zeroIndex=-1;
        Arrays.fill(ans, 0);
        long total=1;
       
            for(int i=0;i<n;i++){
                if(nums[i]!=0){
                 total=total*nums[i];
                }
                if(nums[i]==0){
                   zeroIndex=i; 
                  isZero++;  
                }
            }
            if(isZero>1){
                return ans;
            }
            else if(isZero==1){
                ans[zeroIndex]=total;
                return ans;
            }
            
            for(int i=0;i<n;i++){
                 ans[i]=total/nums[i];
            }
            return ans;
} 
} 

