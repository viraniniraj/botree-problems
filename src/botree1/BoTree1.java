/**
 * 1.1 Assume there is a Stack data structure available capable of holding only Integers.
	* Now suppose a client performs an intermixed sequence of Push and Pop operations onto the stack.
	*	The push operations put the integers 0 through 9 in order onto the stack; the pop operations print out the return values.
 *
	*	Given the above scenario, which of the following sequences could not occur and identify the value which caused the sequence to be evaluated as invalid?
 *
	*		4 3 2 1 0 9 8 7 6 5
	*	 4 6 8 7 5 3 2 9 0 1
	*  2 5 6 7 4 8 9 3 1 0
	*  4 3 2 1 0 5 6 7 8 9
	*  1 2 3 4 5 6 9 8 7 0
	*  0 4 6 5 3 8 1 7 2 9
	*  1 4 7 9 8 6 5 3 0 2
	*  2 1 4 3 6 5 8 7 9 0
 *
 * 1.2 Write a program to evaluate your results in an automated manner using the Stack implementation(in Java) available at
	*	/challenge/source_code/src/com/botreeconsulting/challenges/stack/Stack.java
 */
package botree1;

import com.botreeconsulting.challenges.stack.Stack;
import java.util.Arrays;

/**
 *
 * @author Niraj viraniniraj@gmail.com
 */
public class BoTree1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Stack 's' for implement logic
    Stack<Integer> s = new Stack<Integer>();

    //int[] input = {4,3,2,1,0,9,8,7,6,5};
    int[] input = {4,6,8,7,5,3,2,9,0,1};
    //int[] input = {2,5,6,7,4,8,9,3,1,0};
    //int[] input = {4,3,2,1,0,5,6,7,8,9};
    //int[] input = {1,2,3,4,5,6,9,8,7,0};
    //int[] input = {0,4,6,5,3,8,1,7,2,9};
    //int[] input = {1,4,7,9,8,6,5,3,0,2};
    //int[] input = {2,1,4,3,6,5,8,7,9,0};

    //used variable
    int top = -1;//to check top of the sequence in stack pushed
    int check = 0;//temp variable
    int input_index = 0;
    int seq_index = 0;

    System.out.println("Output for: " + Arrays.toString(input));

    //LOGIC
    for (; input_index < input.length ; input_index++) {
      if (input[input_index] <= top) {
        check = s.pop();
      }
      else if (input[input_index] > top) {
        //store 'seq' in Stack , also in integers 0 through 9 in order
        for (; seq_index <= input[input_index] ;seq_index++) {
          s.push(seq_index);
          top = seq_index;
        }
        check = s.pop();
      }

      //checking of POPed and 'input' variable
      if (input[input_index] == check) {
        System.out.println("Ok @ "+input[input_index]);
      }
      else {
        System.out.println("Not Ok @ "+input[input_index]+" , Sequence is invalid?");
        break;
      }
    }//1st for end
  }
}
