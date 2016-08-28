import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class TreeNode{
    int data;
    TreeNode left,right;

    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
    public boolean equals(Object n) {
        return (this.data == ((TreeNode)n).data);
    }
}
public class Graph_Traverse {
    private static final TreeNode EMPTY = new TreeNode(-1);
    private TreeNode head;

    public Graph_Traverse() {
        this.head = createTree();
    }
    
    private TreeNode createTree(){
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);
        TreeNode n10 = new TreeNode(10);
        TreeNode n11 = new TreeNode(11);
        TreeNode n12 = new TreeNode(12);
        TreeNode n13 = new TreeNode(13);
        TreeNode n14 = new TreeNode(14);
        TreeNode n15 = new TreeNode(15);
        n1.left = n2;
        n1.right = n3;
        
        n2.left = n4;
        n2.right = n5;
        
        n3.left = n6;
        n3.right = n7;
        
        n4.left = n8;
        n4.right = n9;
        
        n5.left = n10;
        n5.right = n11;
        
        n6.left = n12;
        n6.left = n13;
        
        n7.left = n14;
        n7.right = n15;
        return n1;
    }

    public void PrintLevelOrder() {
        boolean forward = true;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        q.add(this.head);
        q.add(EMPTY);
        while (!q.isEmpty()) {
            TreeNode g = q.remove();
            if (g.left != null) {
                q.add(g.left);
            }
            if(g.right!=null){
               q.add(g.right); 
            }
            if (g.equals(EMPTY)) {
                if(!q.isEmpty()){
                q.add(EMPTY);}
                forward = !forward;
                while (!s.isEmpty()) {
                    System.out.print(s.pop().data + " ");
                }
                continue;
            }
            if (forward == true) {
                System.out.print(g.data + " ");
            } else {
                s.push(g);
            }
        }
    }

    public static void main(String[] args) {
        Graph_Traverse graph_Traverse = new Graph_Traverse();
        graph_Traverse.PrintLevelOrder();
    }
}
