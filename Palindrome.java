package solvingprograms;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
	Scanner sc = new Scanner(System.in);

	public void entry() {
		List<Integer> arraylist = new ArrayList<>();
//		System.out.println("Enter number of elements you need to add in arraylist : ");
//		int num = sc.nextInt();
		System.out.println("Enter 10 numbers in ArrayList to check wheether it is palindrome : ");
		for (int i = 1; i <= 5; i++) {
			arraylist.add(sc.nextInt());
		}
		System.out.println(Initializing(arraylist));
		System.out.println(arraylist); // even after deleting ArrayList values in stack and queue, ArrayList won't
										// changed here.
	}

	private String Initializing(List<Integer> arraylist) {
		Stack<Integer> stack = new Stack<>();
		stack.addAll(arraylist);

		Queue<Integer> queue = new ArrayDeque<>();
		queue.addAll(arraylist);

		return Function(stack, queue);
//		System.out.println(stack);
//		System.out.println(queue);
	}

	private String Function(Stack<Integer> stack, Queue<Integer> queue) {
		int count = 0, popped = 0, polled = 0;
		int len = (stack.size()) / 2;
		for (int i = 0; i < len; i++) {
			popped = stack.pop();
			polled = queue.poll();
//			System.out.println(popped + " " + polled);
			if (polled != popped) {
				return "Not a Palindrome ArrayList";
			} else {
				count += 1;
			}
		}
		if (count == len)
			return "Yes palindrome ArrayList";
		return null;
	}

	public static void main(String[] args) {
		new Palindrome().entry();
	}

}
