//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
        int t = Integer.parseInt(br.readLine().trim()); 
        while(t-->0){
            
            //size of array
            int N = Integer.parseInt(br.readLine().trim()); 
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");

            //adding elements to the array
            for(int i = 0 ; i < N; i++){
                arr[i]=Integer.parseInt(inputLine[i]); 
            }
            int P= Integer.parseInt(br.readLine().trim());
            //calling frequncycount() function
            Solution ob = new Solution();
            ob.frequencyCount(arr, N, P); 
            
            //printing array elements
            for(int i = 0; i < N ; i++)
                System.out.print(arr[i] + " " );
            System.out.println();
        }
    }
}




// } Driver Code Ends


class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        
        HashMap <Integer,Integer> map=new HashMap<>();
        
        for(int t=0;t<N;t++){
            if(map.containsKey(arr[t])){
                map.put(arr[t],map.get(arr[t])+1);
            }else{
                map.put(arr[t],1);
            }
        }
        
        for(int j=0;j<N;j++){
            if(map.containsKey(j+1)){
            arr[j]=map.get(j+1);
            }
            else{arr[j]=0;}
        }
    }
}