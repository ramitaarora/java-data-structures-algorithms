public class Lab_4 {    
    public static void main(String[] args) {

       // Using the example above, the intersection is "c1"

       // Constructing L1 
       Node l1 = new Node("a1");
       l1.next = new Node("a2");
       l1.next.next = new Node("a3");

       // Constructing the intersected/common nodes.
       Node c1 = new Node("c1");
       Node c2 = new Node("c2");
       Node c3 = new Node("c3");

       l1.next.next.next = c1;
       l1.next.next.next.next = c2;
       l1.next.next.next.next.next = c3;

       // Constructing L2
       Node l2 = new Node("b1");
       l2.next = new Node("b2");
       l2.next.next = c1;
       l2.next.next.next = c2;
       l2.next.next.next.next = c3;

       // Invoke solution method to solve
       Solution sol = new Solution();
       System.out.println(sol.getIntersection(l1, l2).val); // this should print "c1"
    }
}
class Node {
    String val;
    Node next;
    Node(String x) { val = x; }
}
class Solution {
   public Node getIntersection(Node L1, Node L2) { 
      // YOUR CODE HERE 
   }
}