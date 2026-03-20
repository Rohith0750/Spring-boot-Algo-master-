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

    public static void main(String[] args){
        LinkedList1 list =new LinkedList1();
        list.addfirst(10);
        list.addfirst(20);
        list.addfirst(30);
        list.addfirst(40);
        list.addfirst(50);
        list.printlist();
        System.out.println(list.iterativesearch(30));
        System.out.println(list.iterativesearch(60));

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
