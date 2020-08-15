
// HEAP INDEX CANT START FROM ZERO BECAUSE IT VIOLATES THE FORMULA 
// THAT CHILD FOR INDEX I = 2*I AND 2*I+1
class MaxHeap
{
    int []arr = new int[8];
    int size  ;
    MaxHeap(int val)
    {   
        this.size=1;
        this.arr[size]=val;
        this.size++;
    }
        
    MaxHeap()
    {  
        this.size=1;
    }
        

    int swap(int node , int index)
    {
        int temp;
        temp = arr[node] ;
        arr[node] = arr[index] ;
        arr[index] = temp ;
        return node ;
    }
    void heapifyUp(int index)
    {   
        int parent = index/2; 
        while(parent>=0 && arr[parent]<arr[index])
        {   
            index = swap(parent,index);
            parent=index/2;
        }
            
    }
    void heapifyDown()
    {   
        int index=1;
        int left = index*2;
        int right= (index*2) + 1;
        while(left<=size-1 && right<=size-1)
        {
            if(arr[left]>arr[right] && arr[index]<arr[left])
            {   
                index=swap(left,index);
            }
            else if(arr[left]<arr[right] && arr[index]<arr[right])
            {
                index=swap(right,index);
            }
            left = index*2;
            right= (index*2) + 1;

        }
    }
        void MakeHeap(int val)
    {
        //while(true && size<=arr.length-1)
        
            if(size==1)
            {
                arr[size]=val;
                size++;
                
            }
            else
            {
                arr[size]=val;
                heapifyUp(size);
                size++;
            }
                
        
    }
         
    int delete()
    { 
        int Max = Max();
        arr[1]=arr[size-1];
        size--;
        heapifyDown();
        return Max; 
    }
        
    int Max()
    {
        return arr[1] ;
    }
    void print()
    {
        for(int i=1;i<=size-1;i++)
        {
            System.out.print("\t"+arr[i]);
        }
    }
    int lenght()
    {return size-1;}
}

class MinHeap
{
    
    int []arr = new int[8];
    int size  ;
    MinHeap(int val)
    {   
        this.size=1;
        this.arr[size]=val;
        this.size++;
    }
        
    MinHeap()
    {  
        this.size=1;
    }
    
    int swap(int node , int index)
    {
        int temp;
        temp = arr[node] ;
        arr[node] = arr[index] ;
        arr[index] = temp ;
        return node ;
    }
        
    void heapifyUp(int index)
    {   
        int parent = index/2; 
        while(parent>=0 && arr[parent]>arr[index])
        {   
            index = swap(parent,index);
            parent=index/2;
        }
            
    }
    void heapifyDown()
    {
        int index=1;
        int left = index*2;
        int right= (index*2) + 1;
        while(left<=size-1 && right<=size-1)
        {   
            if(arr[left]<arr[right] && arr[index]>arr[left])
            {
                index=swap(left,index);
            }
            else if(arr[left]>arr[right] && arr[index]>arr[right])
            {
                index=swap(right,index);
            }
            left = index*2;
            right= (index*2) + 1;
        }               
                 
    }
    void MakeHeap(int val)
    {
        //while(true && size<=arr.length-1)
        
            if(size==1)
            {
                arr[size]=val;
                size++;
            }
                
            else
            {
                arr[size]=val;
                heapifyUp(size);
                size++;
            }
        }
        int delete()
        { 
            int Min = Min();
            arr[1]=arr[size-1];
            size--;
            heapifyDown();
            return Min; 
        }
            
        int Min()
        {
            return arr[1] ;
        }
        void print()
        {
            for(int i=1;i<=size-1;i++)
            {
                System.out.print("\t"+arr[i]);
            }
        }
        int lenght()
        {return size-1;}
}
        
    
public class heap 
{
    public static void main(String args[])
    {
        MaxHeap a1 = new MaxHeap(30);
        a1.MakeHeap(25);
        a1.MakeHeap(20);
        a1.MakeHeap(29);
        a1.MakeHeap(21);
        a1.MakeHeap(26);
        a1.MakeHeap(5);
        a1.print();
        System.out.println("\nAFTER DELETE MAX");
        a1.delete();
        a1.print();
        MinHeap a2 = new MinHeap(30);
        a2.MakeHeap(25);
        a2.MakeHeap(20);
        a2.MakeHeap(29);
        a2.MakeHeap(21);
        a2.MakeHeap(26);
        a2.MakeHeap(5);
        System.out.println("\nMIN HEAP ");
        a2.print();
        System.out.println("\nAFTER DELETE MIN");
        a2.delete();
        a2.print();

      //  System.out.println(a.lenght());
    }    
}