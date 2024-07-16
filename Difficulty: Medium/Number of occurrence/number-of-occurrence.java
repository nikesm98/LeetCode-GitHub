//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    
    public int first(int[] arr , int n, int x){
    int s = 0, e = n-1, ans = -1;
    while(s <= e){
        int mid = s + (e-s)/2;
        if(arr[mid] == x){
            ans = mid;
            e = mid-1;
        }else if(arr[mid] < x){
            s = mid+1;
        }else{
            e = mid-1;
        }
    }
    
    return ans;
}

public int last(int[] arr , int n, int x){
    int s = 0, e = n-1, ans = -1;
    while(s <= e){
        int mid = s + (e-s)/2;
        if(arr[mid] == x){
            ans = mid;
            s = mid+1;
        }else if(arr[mid] <= x){
            s = mid+1;
        }else
            e = mid-1;
    }
    
    return ans;
}


    
    int count(int[] arr, int n, int x) {
        int a1 = first(arr , n, x);
        int a2 = last(arr, n, x);
        int result;
        
        if (a1 == -1 && a2 == -1) {
            result = 0;
        }else{
            result = a2-a1+1;
        }
        
        return result;
    }
}