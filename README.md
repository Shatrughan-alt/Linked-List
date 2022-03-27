class node {
    int data;
    node next;
    node(int data){
        this.data=data;
    }
}
class Main{
     node head;
        node tail;
    public void print(){
        node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void insertAtBeg(int x){
        node n=new node(x);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            n.next=head;
            head=n;
        }
    }
    public void insertAtEnd(int x){
        node n=new node(x);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
    }
    public void insertAtPos(int pos, int x) {
        node n = new node(x);
        if (head == null) {
            if (pos > 1) {
                System.out.println("INVALID POSITION");
            }
            else
            {
                head=n;
                tail=n;
            }
        }
        else
        {
            if(pos==1)
            {
                n.next=head;
                head=n;
            }
            else if(pos>count()+1)
            {
                System.out.println("INVALID POSITION");
            }
            else
            {
                node temp=head;
                int c=1;
                while(temp.next!=null)
                {
                    if(c==pos-1)
                    {
                        break;
                    }
                    c++;
                    temp=temp.next;
                }
                n.next=temp.next;
                temp.next=n;
            }
        }
    }
    public void deleteAtBeg(){
        if(head==null)
        return;
        else{
            head=head.next;
        }
    }
    public void deleteAtEnd(){
        if(head==null)
        return;
        else if(head.next==null){
            head=null;
            tail=null;
        }
        else{
            node temp=head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    public int count()
    {
        int c=0;
        node temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }
    public void deleteAtPos(int pos){
        if(head==null)
            return;
        else{
            if(head.next==null){
                if(pos!=1){
                    System.out.println("Invalid position");
                }
                else
                    head=null;
                    tail=null;
            }
            else{
                int c=1;
                if(pos>count())
                    System.out.println("Invalid position");
                else{
                    node temp = head;
                    while(temp!=null){
                        if(c==pos-1){
                            break;
                        }
                        c++;
                        temp = temp.next;
                    }
                    temp.next=temp.next.next;
                }
            }
        }
    }
    public static void main(String args[]){
        Main obj=new Main();
        node n1= new node(10);
        obj.head=n1;
        node n2= new node(20);
        n1.next=n2;
        node n3= new node(30);
        n2.next=n3;
        node n4=new node(40);
        n3.next=n4;
        obj.tail=n4;
    //obj.insertAtEnd(200);
    //obj.insertAtBeg(100);
    obj.insertAtPos(3,50);
    //obj.deleteAtBeg();
    //obj.deleteAtEnd();
    //obj.deleteAtPos(3);
    
    obj.print();
}
}
