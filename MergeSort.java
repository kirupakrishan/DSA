 public class MergeSort
{   static void  MSort(int[] nums,int low,int high)
      { 
        int mid=(low+high)/2;
          
        if(low<high)
        {  //This is the recursivw part ; This forms the INVERTED TREE ;
           MSort(nums,low,mid);
           MSort(nums,mid+1,high); 
           // THIS IS THE SORT BY MERGING TWO ARRAYS ;
           Merge(nums,low,mid,high);
       
        }

        
      }
    static void Merge(int[] nums , int low,int mid , int high )
{  
            int k =low ,i=low,j=mid+1 ;
            int[] temp = new int[nums.length]; // TEMP ARRAY TO STORE SORTED ARRAY 
                while(i<=mid&&j<=high)
                    {
                        if(nums[i]<=nums[j])
                            {
                                temp[k]=nums[i];
                                i++;
                            }
                        else
                            {
                                temp[k]=nums[j];
                                j++;
                            }
                        k++;
                    }
                    
                    // IF ANY ONE OF THE ARRAY COMPLETES FIRST ex . ->>> (1) 2  3  4    (2) 7  9  10  
                    if(i<=mid)
                    {
                        
                        
                        while(i<=mid)
                        {
                            temp[k]=nums[i];
                            i++;
                            k++;
                        }
                    }
                    else 
                    {
                        
                        while(j<=high)
                        {
                            temp[k]=nums[j];
                            j++;
                            k++;
                        }
                        
                    } 
                    //  STORE THE SORTED ARRAY BACK INTO ORIGINAL ARRAY 
                    for(int x= low ; x<=high;x++)
                    {
                        nums[x]=temp[x];
                    }

                    //System.out.println(low+"\t"+mid+"\t"+high );
                  for( int x = 0 ; x<temp.length;x++)
                        System.out.print("\t"+temp[x]);    
                System.out.println();  
        }            

       

    public static void main(String args[])
    {
     
        int[] x = {9,6,345,7,4574,4,47,96}; // 4   6   7     9   47  96   345  4574 
        
         
        MSort(x,0,x.length-1);
    }
}