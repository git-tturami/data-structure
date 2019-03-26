class IntgerStack{
    private final int STACK_SIZE = 1000;
    private int[] data = new int[STACK_SIZE];
    private int top = -1;

    public void push(int element) {
        if (isFull()) {
            return;
        }
        data[++top] = element;
    }

    public int pop() throws NotExistException {
        if (isEmpty()) {
            throw new NotExistException();
        }
        return data[top--];
    }

    public boolean isFull() {
        return top == STACK_SIZE - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    class NotExistException extends Exception {
        @Override
        public String getMessage() {
            return "Element is not in the stack";
        }
    }
}