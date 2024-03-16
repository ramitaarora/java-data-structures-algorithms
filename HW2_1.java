import java.util.Stack;

public class HW2_1 {    
    public static void main(String[] args) {
      Solution obj = new Solution();
      int[] events_pushed_1 = {1,2,3,4};
      int[] events_popped_1 = {4,3,2,1};

      System.out.println(obj.isSameEventSequence(events_pushed_1, events_popped_1));
    }
}

// FILL OUT THE FOLLOWING API TEMPLATE, WHICH FOLLOWS THE 
// PURPOSE/PARAMETERS/RETURN VALUES STYLE PER THE SYLLABUS. 
/**
 * PURPOSE: Determine whether the events_pushed and events_popped creates a sequence that is possible within a stack.
 * PARAMETERS: events_pushed, events_popped
 * RETURN VALUES: true or false
 */

class Solution {
   public boolean isSameEventSequence(int[] events_pushed, int[] events_popped) { 
      Stack<Integer> eventsSequence = new Stack<Integer>();

      // for (int i = 0; i < events_pushed.length; i++) {
      //    for (int j = 0; j < events_popped.length; j++) {
      //       eventsSequence.push(events_pushed[i]);
      //       if (events_pushed[i] == events_popped[j]) {
      //          eventsSequence.pop();
      //       }
      //       else {
      //          j--;
      //          continue;
      //       }
      //    }
      // }


      return false;
   }
}