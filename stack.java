
import java.util.Scanner;
class students
{    
             int value;  

}

 class functions 
{       students s[] = new students[5];
         functions ()
        { 
           for(int i=0;i<5;i++)
                {    
                 s[i] = new students();
                 }
        }
        Scanner sc = new Scanner(System.in);
        int push(int top)
        {       
                
                System.out.println("Enter a Number");
                int value = sc.nextInt();       
                ++top;

                if (top<5)
               {

                s[top].value=value;

               }
               else if(top>5)
               {
                       System.out.println("----------OverFlow-----------");
               }
              
               
           return top;
        }

        int pop(int top)
        {       
                
               if(top==-1)
               {        
                System.out.println("----------UnderFlow-----------");
               }
               else if (top<5&&top>=0)
               {

                --top;
               
               }
               else if(top==0)
               {
                      top=-1;
               }
               return top;
        }

        void display(int top)
        {   
           //    System.out.flush();
                System.out.println(top);
                for( students value : s)
                {
                        System.out.println(value.value);
                }
        }
}
class stack

{  
 
   
   
   static int menu ( int x, int top)
    {   
        functions f = new functions();
         switch(x) 
         {
             case 1 : top =f.push(top);
                     break;
             case 2 : top = f.pop(top);
                     break;
 
                     
             case 3 : f.display(top);
             break;
                     
             case 0 : System.exit(0);
         
 
         }
         return top;
 
     }
   public static void main( String []args)
   {   
        int top = -1;
       System.out.println("---------------STACK------------------");
       boolean isEnd = false ;
       int option ;
       final Scanner sc = new Scanner(System.in);      
       while(!isEnd)
       {
        System.out.flush();   
        System.out.println("1.PUSH ");
        System.out.println("2.POP ");
        System.out.println("3.DISPLAY");
        System.out.println("0.EXIT");
        System.out.println("Enter Your Option : ");
        option = sc.nextInt();
       top = menu(option,top);
        System.out.println("Do You Want To Quit (True/False)");
        isEnd = sc.nextBoolean();
        System.out.flush();
       }
       sc.close();
    }  

}