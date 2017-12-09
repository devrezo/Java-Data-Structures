import java.util.Scanner;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class NthNode {
	static Node head = null;
	static Node tail = null;

	public static void main(String[] args) {
		int n;
		int position;
		int input;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		while (n > 0) {
			n--;
			input = scanner.nextInt();
			insert(input);
		}
		position = scanner.nextInt();
		displayList(head);
		nthNode(position);
	}

	public static void insert(int input) {
		Node newNode = new Node(input);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = tail.next;
		}
	}

	public static void displayList(Node head) {
		Node current = null;
		current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public static void nthNode(int position) {
		Node current = null;
		int i = 1;
		current = head;

		while (current != null && i < position) {
			current = current.next;
			i++;
		}
		if (current == null) {
			System.out.println("");
		} else {
			System.out.println(current.data);
		}
	}
}
