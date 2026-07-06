/*
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public Node buildTree(List<Integer> nodes) {
        // code here
        if (nodes.size() == 0)
        return null;
        
        Node[] tree = new Node[nodes.size()];
        
        for(int i = 0; i < nodes.size(); i++)
        tree[i] = new Node(nodes.get(i));
        
        for(int i = 0; i < nodes.size(); i++){
            int left = 2*i+1;
            int right = 2*i+2;
            
            
            if(left < nodes.size())
            tree[i].left = tree[left];
            
            if(right < nodes.size())
            tree[i].right = tree[right];
        }
        return tree[0];
    }
}