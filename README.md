botree
======

1.1 Assume there is a Stack data structure available capable of holding only Integers.
	  Now suppose a client performs an intermixed sequence of Push and Pop operations onto the stack.
		The push operations put the integers 0 through 9 in order onto the stack; the pop operations print out the return values.

		Given the above scenario, which of the following sequences could not occur and identify the value which caused the sequence to be evaluated as invalid? 

			4 3 2 1 0 9 8 7 6 5
			4 6 8 7 5 3 2 9 0 1
			2 5 6 7 4 8 9 3 1 0
			4 3 2 1 0 5 6 7 8 9
			1 2 3 4 5 6 9 8 7 0
			0 4 6 5 3 8 1 7 2 9
			1 4 7 9 8 6 5 3 0 2
			2 1 4 3 6 5 8 7 9 0

1.2 Write a program to evaluate your results in an automated manner using the Stack implementation(in Java) available at 
		/challenge/source_code/src/com/botreeconsulting/challenges/stack/Stack.java
----------------------
----------------------

Program 2 : Kids are playing a game of Elimination. The rules of the game are

a) Suppose there are M kids. They stand in a circle and pick a random number N which is less than M.

b) They start counting from 1 to N and the kid at position N is eliminated. They resume counting from position N + 1 starting from 1.

c) This continues until there is only one kid left. The last Kid standing is declared the Winner.
Write an algorithm which, given values of M and N, identifies the position which would make her the winner.