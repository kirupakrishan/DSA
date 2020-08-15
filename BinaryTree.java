import java.util.ArrayList;

class node 
{
    int value;
    node left , right ;
        node(int val)
        {
            this.value = val ;
            this.left=null;
            this.right=null;
        }
        node()
        {}
}
class tree
{
    node root;
    int length;
     tree(int val)
     {
         root = new node(val);
         this.length=1;
     }
     tree()
     {
         root=null;
         this.length=1;
     }
     void insert(int val)
     {  node CurrentNode = new node();
        node newnode = new node(val);
        CurrentNode=root;
         while(true)
         {
            if(root==null)
                {
                    root= newnode;
                    break;    
                }
            else if(CurrentNode.value>val)
                { 
                    if(CurrentNode.left==null)
                    {
                        CurrentNode.left=newnode;
                        break;
                    }                   
                    else
                    {
                        CurrentNode=CurrentNode.left;
                    }
                }   
            else if(CurrentNode.value<val)
            {
                if(CurrentNode.right==null)
                {
                    CurrentNode.right=newnode;
                    break;
                }
                else
                {
                    CurrentNode=CurrentNode.right;
                }
            }
        }
     }
    //  void delete()
    //  {}
    String  BFS()
     {
         node CurrentNode = new node();
         CurrentNode=this.root;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<node> queue = new ArrayList<>(); 
          queue.add(CurrentNode);
         while(queue.size()>0)
         {
           CurrentNode = queue.remove(0);
           list.add(CurrentNode.value);
           if(CurrentNode.left!=null)
           {
                queue.add(CurrentNode.left);
           } 
           if(CurrentNode.right!=null)
           {
               queue.add(CurrentNode.right);
           }
         }
         return list.toString();
     }

    String DFSInorder( )
    {
        ArrayList<Integer> list = new ArrayList<>();
        return traverseInorder(root,list).toString() ;
    }

    
    String DFSPostorder()
    {   
        ArrayList<Integer> list = new ArrayList<>();
        return traversePostorder(root,list).toString() ;
    }

    
    String DFSPreorder()
    {   
        ArrayList<Integer> list = new ArrayList<>();
        return traversePreorder(root,list).toString();
    }

    ArrayList<Integer> traverseInorder(node root , ArrayList<Integer> list)
    {
        
        if(root.left!=null)
        {
             traverseInorder(root.left, list);
        }
        list.add(root.value);
        if(root.right!=null)
        {
            traverseInorder(root.right, list);
        }
        return list;
    }

    
    ArrayList<Integer> traversePreorder(node root , ArrayList<Integer> list)
    {   
        list.add(root.value);
        if(root.left!=null)
        {
             traversePreorder(root.left, list);
        }
        if(root.right!=null)
        {
            traversePreorder(root.right, list);
        }
        return list;
    }

    
    ArrayList<Integer> traversePostorder(node root , ArrayList<Integer> list)
    {
        
        
        if(root.left!=null)
        {
             traversePostorder(root.left, list);
        }
        if(root.right!=null)
        {
            traversePostorder(root.right, list);
        }
        list.add(root.value);
        return list;
    }
}
public class BinaryTree {
    public static void main (String args[])
    {
        tree T = new tree(30);
        T.insert(25);
        T.insert(29);
        T.insert(20);
        T.insert(21);
        T.insert(26);
        T.insert(5);
        T.insert(10);
        System.out.println("BFS :"+T.BFS());
        System.out.println("DFS INORDER : "+T.DFSInorder());
        System.out.println("DFS PREORDER : "+T.DFSPreorder());
        System.out.println("DFS POSTORDER : "+T.DFSPostorder());
    }
}