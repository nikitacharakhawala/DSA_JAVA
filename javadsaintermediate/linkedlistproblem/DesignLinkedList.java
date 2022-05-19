package javadsaintermediate.linkedlistproblem;


import java.util.List;

public class DesignLinkedList {
    static ListNode head;
    static int length=0;
    public static void main(String[] args) {
        int[][] A={ {1, 13, -1},
                {3, 0, -1},
                {3, 1, -1},
                {2, 15, 0},
                {3, 0, -1},
                {1, 12, -1},
                {3, 0, -1},
                {1, 19, -1},
                {1, 13, -1},
                {3, 0, -1},
                {0, 12, -1},
                {1, 13, -1},
                {3, 2, -1}};
        designLinkedList(A);
        print_ll();
    }

    public static void designLinkedList(int[][] A){
      for(int i=0;i<A.length;i++){
          if(A[i][0]==0 && A[i][2]==-1){
              addFirst(A[i][1]);
          }else if(A[i][0]==1 && A[i][2]==-1){
              addAtIndex(A[i][1], length);
          }else if(A[i][0]==2){
              addAtIndex(A[i][1], A[i][2]);
          }else if(A[i][0]==3 && A[i][2]==-1){
              delete_node(A[i][1]);
          }
      }
    }

    public static void delete_node(int position){

        if(position>length-1){

            return;
        }
        if(position==0 && length==1){
            head=null;
            length--;
            return;
        }
        if(position==0 && length>1){
            head=head.next;
            length--;
        }else{
            int count=0;
            ListNode temp=head;
            while(count<position-1){
                temp=temp.next;
                count++;
            }
            temp.next=temp.next.next;
            length--;
        }
    }

    public static void addFirst(int value){
        if(head==null){
            head=new ListNode(value);
            length++;
        }else{
            ListNode newNode=new ListNode(value);
            newNode.next=head;
            head=newNode;
            length++;
        }
    }

    public static void addAtIndex(int value, int position){

       if(position>length)
           return;
       if(length==0){
           head=new ListNode(value);
       }
        ListNode temp=head;
        ListNode newNode=new ListNode(value);
       if(position==0){
           newNode.next=head;
           head=newNode;
       }
       else{
           int count=0;

           while(count<position-1){
               temp=temp.next;
               count++;
           }


               newNode.next=temp.next;
           temp.next=newNode;
       }
       length++;
    }

    public static void print_ll() {
        // Output each element followed by a space

        ListNode temp=head;
        if(length==1){
            System.out.println(temp.val);
        }
        if(length>1){

            while(temp.next!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            //System.out.print(temp.val);
            System.out.println();
        }
    }



}
