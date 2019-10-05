import java.util.ArrayList;
import java.util.List;

public class StackImpl {

	private List<Integer> a;
	private int top;
	
	public StackImpl() {
		top=Integer.MIN_VALUE;
		a = new ArrayList<Integer>();
	}
	
	void createEmptyStack(){
	top=-1;	
	}
	
	void push(int i){
			
		a.add(i);
		top++;
	}
	
	int pop(){
		if(top>=0)
			return a.get(top--);
		else
			throw new IllegalArgumentException("Stack is Empty");
	}
	
	int peek(){
		if(top>=0)
			return a.get(top);
		else
			throw new IllegalArgumentException("Stack is Empty");
	}
	
	
	
	public static void main(String[] args) {
		StackImpl s=new StackImpl();
		s.createEmptyStack();
		s.push(10);
		s.push(12);
		s.push(14);
		s.push(18);
		System.out.println("Peek="+s.peek());
		System.out.println(s.pop());
		System.out.println("Peek="+s.peek());
		System.out.println(s.pop());
		System.out.println("Peek="+s.peek());
		System.out.println(s.pop());
		System.out.println("Peek="+s.peek());
		System.out.println(s.pop());
	}

}
