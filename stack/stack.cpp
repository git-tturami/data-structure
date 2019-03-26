#include <stdio.h>
#define STACK_SIZE 1000

// Define stack using templated array.
template<typename T>
class stack{
    private:
        // Define top value.
        // it points the last value in stack.
        int top = -1;
        T arr[STACK_SIZE];

    public:
        // Define isFull function.
        // It checks whether stack is full or not.
        bool isFull() {
            return top == STACK_SIZE - 1;
        }

        // Define isEmpty function.
        // It checks whether stack is empty or not.
        bool isEmpty() {
            return top == -1;
        }

        // Define push function.
        // It can be used when user want to push some element in stack.
        void push(T element) {
            if (isFull()) {
                return;
            }
            arr[++top] = element;
        }

        // Define pop function.
        // It can be used when user want to get last value in stack.
        T pop() {
            if (isEmpty()) {
                return 0;
            }
            return arr[top--];
        }
};

int main() {
    stack<int> stack_int;
    stack_int.push(1);
    stack_int.push(2);
    // This will print 1
    printf("%d\n", stack_int.pop());
    // This will print 2
    printf("%d\n", stack_int.pop());

    stack<int> stack_char;
    stack_char.push('a');
    stack_char.push('b');
    // This will print 1
    printf("%c\n", stack_char.pop());
    // This will print 2
    printf("%c\n", stack_char.pop());
    
    return 0;
}