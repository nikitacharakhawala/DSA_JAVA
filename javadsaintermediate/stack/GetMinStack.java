package javadsaintermediate.stack;

/**
 * Q1. Min Stack
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * Design a stack that supports push, pop, top, and retrieve the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * NOTE:
 *
 * All the operations have to be constant time operations.
 * getMin() should return -1 if the stack is empty.
 * pop() should return nothing if the stack is empty.
 * top() should return -1 if the stack is empty.
 *
 *
 * Problem Constraints
 * 1 <= Number of Function calls <= 107
 *
 *
 *
 * Input Format
 * Functions will be called by the checker code automatically.
 *
 *
 *
 * Output Format
 * Each function should return the values as defined by the problem statement.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * push(1)
 * push(2)
 * push(-2)
 * getMin()
 * pop()
 * getMin()
 * top()
 * Input 2:
 *
 * getMin()
 * pop()
 * top()
 *
 *
 * Example Output
 * Output 1:
 *
 *  -2 1 2
 * Output 2:
 *
 *  -1 -1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Let the initial stack be : []
 * 1) push(1) : [1]
 * 2) push(2) : [1, 2]
 * 3) push(-2) : [1, 2, -2]
 * 4) getMin() : Returns -2 as the minimum element in the stack is -2.
 * 5) pop() : Return -2 as -2 is the topmost element in the stack.
 * 6) getMin() : Returns 1 as the minimum element in stack is 1.
 * 7) top() : Return 2 as 2 is the topmost element in the stack.
 * Explanation 2:
 *
 * Let the initial stack be : []
 * 1) getMin() : Returns -1 as the stack is empty.
 * 2) pop() :  Returns nothing as the stack is empty.
 * 3) top() : Returns -1 as the stack is empty.
 */
class ListNode{
    int value;
    ListNode next;
    ListNode(int value){
        this.value=value;
        this.next=null;
    }


}

class Stack{
  int size=0;
  ListNode head;
  public void push(int value){
      if(head==null){
          head=new ListNode(value);
      }else{
          ListNode newNode=new ListNode(value);
          newNode.next=head;
          head=newNode;
      }
      size++;
  }

  public void pop(){
      head=head.next;
      size--;
  }

  public int top(){
      if(size>0){
          return head.value;
      }else
          return -1;

  }

  public void print_stack(){
      if(head==null)
          return;
      else{
          ListNode temp=head;
          while(temp.next!=null){
              System.out.print(temp.value+" ");
              temp=temp.next;
          }
          System.out.print(temp.value);
          System.out.println();
      }
  }
}

public class GetMinStack {
    Stack s1=new Stack();
    Stack minStack=new Stack();
    public static void main(String[] args) {
        GetMinStack getMinStack=new GetMinStack();
        getMinStack.push(-2);
        getMinStack.push(1);
        getMinStack.push(2);
        getMinStack.s1.print_stack();
        getMinStack.minStack.print_stack();
        System.out.println(getMinStack.getMin());
    }

    public void push(int x){

            s1.push(x);

        if(minStack.size==0){
            minStack.push(x);
        }else if(x<minStack.top()){
            minStack.push(x);
        }
    }

    public int top() {
        return s1.top();
    }

    public void pop() {
        if(s1.top()==minStack.top()){
            minStack.pop();
        }
        s1.pop();
    }

    public int getMin() {
        return minStack.top();
    }
}
