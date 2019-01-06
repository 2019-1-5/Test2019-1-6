package three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Quene q = new Quene();
		q.add("a");
		q.add("b");
		q.add("c");
		q.add("d");
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
	}
}
class  Quene{
	private LinkedList list = new LinkedList();
	public void add(Object obj) {
		list.add(obj);
	}
	public Object poll() {
		return list.removeFirst();
	}
}
