
class BubbleSort
{
    static  int[] Bsort(int[] nums )
    {
        for(int i = 0 ; i < nums.length-1;i++)
        {
            for(int j = 0; j < nums.length-i-1;j++)
            {
                int temp ;
                if(nums[j]>nums[j+1])
                {   temp = nums[j] ;
                    nums[j]  =  nums[j+1];
                    nums[j+1]  = temp;  
                }
            }
        }
        return nums;
    }
    public static void main(String args[])
    {
        int[] x = {4,6,9,4574,7,47,96,345};
        
         int [] nums ;
         nums = Bsort(x);
        for(int sort : nums )
        System.out.println(sort);
    }
}