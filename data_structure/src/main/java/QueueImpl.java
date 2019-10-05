import java.util.ArrayList;
import java.util.List;

public class QueueImpl {

	private List<Integer> a;
	private int head;

	public QueueImpl() {
		head = Integer.MIN_VALUE;
		a = new ArrayList<Integer>();
	}

	void createEmptyQueue() {
		head = -1;
	}

	void enqueue(int value) {
		if(head<-1)
			createEmptyQueue();
		a.add(value);
	}

	int dequeue() {

		if ((head+1) >= 0 && (head+1) < a.size())
			return a.get(++head);
		else
			throw new IllegalArgumentException("Queue is Empty");
	}

	public static void main(String[] args) {
		QueueImpl q=new QueueImpl();
		q.enqueue(10);
		System.out.println(q.dequeue());
		q.enqueue(12);
		q.enqueue(14);
		q.enqueue(16);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}

}
