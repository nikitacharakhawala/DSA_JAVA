package javadsaintermediate.stack;

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
      return head.value;
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

public class MinStack {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(-2);
        s1.push(1);
        s1.push(2);
        s1.print_stack();
        System.out.println(s1.top());
        s1.print_stack();
    }
}
