
interface Stack{
    boolean isEmpty();
    boolean isFull();
    void push(char item);
    char pop();
    char peek();
    void clear();
}

public class Java_Stack implements Stack{
	
    private int top;
    private int stackSize;
    private char stackArr[];

    Java_Stack(int stackSize) {
    	top = -1;
    	this.stackSize = stackSize;
    	stackArr = new char[stackSize];
    }
    
	@Override
	public boolean isEmpty() {
		
		return (top == -1); 
		
	}

	@Override
	public boolean isFull() {
		
		return (top == stackSize - 1);
	}

	@Override
	public void push(char item) {
		if(isFull()) {
			System.out.println("스택이 가득 찼습니다.");
		} else {
			stackArr[++top] = item;			
		}
	}

	@Override
	public char pop() {
		if(isEmpty()) {
			System.out.println("스택이 비어 있습니다.");
		} else {
			stackArr[top] = ' ';
			top--;
		}
		return stackArr[top];
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.print("스택이 비어 있습니다.");
		} else {
			return stackArr[top];
			
		}
		return 0;
	}

	@Override
	public void clear() {
		top = -1;
		for (int i = 0; i < stackArr.length; i++) {
			stackArr[i] = ' ';
		}
		
	}

	public static void main(String[] args) {
		int stackSize = 5;
		Java_Stack stack = new Java_Stack(stackSize);
		
		System.out.println(stack.peek());
		stack.push('A');
		stack.push('B');
		stack.push('C');
		stack.push('D');
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.clear();
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		
		
	}
}
