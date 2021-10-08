package com.nitincodes;

public class Main {
    // ceiling of a number in an array which is sorted in descending order:
    public static void main(String[] args) {
        int[] arr = {134,123,122,112,111,100};
        int ans = ceilingNumber(arr,112);
        System.out.println(ans);

    }
    static int ceilingNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                end = mid-1;
            }
            else if(target<arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return end;

    }




    }
