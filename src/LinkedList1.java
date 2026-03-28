public class LinkedList1 {
    public class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;
    public void addfirst(int data){
        node newnode = new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    public void addLast(int data){
        node newnode =new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void printlist(){
        node temp=head;
        if(head==null){
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addMiddle(int idx, int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        node newnode=new node(data);
        size++;
        node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    public int removefirst(){
        if(size==0){
            return -1;
        } else if (size==1) {
            int val=head.data;
            head=tail=null;
            return val;

        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removelast(){
        if(size==0){
            return -1;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        size--;
        return val;
    }

    public int iterativesearch(int key){
        node temp=head;
        int i=0;
        while(temp!= null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
       return -1;
    }

    public void reverse(){
        node prev=null;
        node curr=tail=head;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        head=prev;

    }

    public void findandremovethenthnodefromend(int n){
        int sz=0;
        node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;

        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int itofind=sz-n;
        node prev=head;
        while(i<itofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;

    }
    public node findmid(node head){
        node fast=head;
        node slow=head;
        while(fast.next!=null && fast!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkpalindrome(int n){
        if(head==null || head.next==null){
            return false;
        }
        //Step 1 --> get the mid
        node midnode=findmid(head);


        //step-2 -->reverse the 2nd half
        node prev=null;
        node curr=midnode;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node right=prev;
        node left=head;

        //step3-->check right and left
        while(left!=right){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }


    public static void main(String[] args){
        LinkedList1 list =new LinkedList1();
        list.addfirst(10);
        list.addfirst(20);
        list.addfirst(30);
        list.addfirst(40);
        list.addfirst(50);
        list.printlist();
        list.findandremovethenthnodefromend(3);
        //list.reverse();
        list.printlist();
//        System.out.println(list.iterativesearch(30));
//        System.out.println(list.iterativesearch(60));

        //list.addfirst(1);
//        list.addfirst(2);
//
//        list.addfirst(3);
//        list.addMiddle(2,15);
//        list.printlist();
//        System.out.println(list.size);
//        list.removefirst();
//       // list.removelast();
//        list.printlist();
    }
}
