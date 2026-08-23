package trees.Traversals;

class Node{
    int key;
    Node left,right;
    Node(int key){
       this.key=key;
       left=right=null; 
    }
}
public class BST {
    Node root;
    BST(){
        root=null;

    }
    void insert(int key){
        root= insertN(root,key);
        
    }
    Node insertN(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key<root.key){
         root.left=insertN(root.left,key);   
        }
        else if(key>root.key){
            root.right=insertN(root.right,key);
        }


        return root;
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
public static void main(String[]args){
    BST node=new BST();
    node.insert(8);
    node.insert(4);
    node.insert(2);
    node.insert(6);
    node.insert(12);
    node.insert(10);
    node.insert(14);
    
    System.out.println("Inorder Traversal");
    node.inorder(node.root);
}
}
