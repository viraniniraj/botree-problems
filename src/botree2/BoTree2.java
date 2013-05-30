/**
 *  Program 2 : Kids are playing a game of Elimination. The rules of the game are
 *    a) Suppose there are M kids. They stand in a circle and pick a random number N which is less than M.
 *    b) They start counting from 1 to N and the kid at position N is eliminated. They resume counting from position N + 1 starting from 1.
 *    c) This continues until there is only one kid left. The last Kid standing is declared the Winner.
 *    Write an algorithm which, given values of M and N, identifies the position which would make her the winner.
 */
package botree2;

import com.botreeconsulting.challenges.stack.Stack;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Niraj viraniniraj@gmail.com
 */
public class BoTree2 {
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //initalige
    int M = 0;//number of Kids
    int N = 0;//pick a random number N

    //input M and N
    while (0 < 1) {
      Scanner a = new Scanner(System.in);
      try {
        System.out.print("Kids are (M) : "); M = a.nextInt();
        System.out.print("pick a random number (N) : "); N = a.nextInt();

        if (N < M && N > 0 && M > 0) {
          Logic(M,N);
        }
        else {
          System.out.println("Value should be >0,and N < M.\n");
        }
      }
      catch (InputMismatchException e) {
        System.out.println("Value should be integer.\n");
      }
    }
  }

  private static void Logic(int M, int N) {
    //LOGIC
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //kids position store in stack s1
    for (int i = 1; i <= M; i++) {
      s1.push(i);
    }

    //only one possition remaining in any of the stack,which is winner position
    while ((s1.size() != 1 || s2.size() != 0) &&
           (s1.size() != 0 || s2.size() != 1)) {
      //N times
      for (int j = 0 ; j < N ; j++) {
        if (s2.size() == 0) {
          while (s1.size() != 0) {
            s2.push(s1.pop());
          }
        }
        s1.push(s2.pop());
      }
      System.out.println("eleminated Kid is = "+s1.pop());
    };

    //winner pop from stack.
    if (s1.size() == 1)
    System.out.println("the position which would make her the winner is = "+s1.pop()+"\n");
    else
    System.out.println("the position which would make her the winner is = "+s2.pop()+"\n");
  }
}
