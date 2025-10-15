package com.ramankaur.S5Lec56;

public class FindFirstAndLast {
    public int[] searchRange(int[] nums,int target){
        int[] result=new int[]{-1,1};
        result[0]=findFirst(nums,target);
        result[1]=findLast(nums,target);
        return result;
    }

    private int findFirst(int[] nums,int target){
        int low=0,high=nums.length-1,index=-1;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid]<=target)low=mid+1;
            else high=mid-1;
            if(nums[mid]==target)index=mid;
        }return index;

    }

    private int  findLast(int[] nums,int target){
        int low=0,high=nums.length-1,index=-1;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid]<=target)low=mid+1;
            else high=mid-1;
            if(nums[mid]==target)index=mid;
        }return index;
    }

    public static void main(String[] args){
        FindFirstAndLast sol=new FindFirstAndLast();
        int[] nums={5,7,7,8,8,10};
        int target=8;

        int[] result=sol.searchRange(nums,target);
        System.out.println("["+ result[0]+","+ result[1]+"]");

    }
}
