public class LList {
    Node head = null;
    Node tail = null;

    public void addToHead(int x){
        Node nNode = new Node();
        nNode.data=x;

        if(head==null){
            head=nNode;
            tail=nNode;
            nNode.next=null;
        }
        else{
            nNode.next=head;
            head=nNode;
        }
    }

    public void addToTail(int x){
        Node nNode = new Node();
        nNode.data=x;

        if(head==null){
            head=nNode;
            tail=nNode;
            nNode.next=null;
        }
        else{
            nNode.next=null;
            tail.next=nNode;
            tail=nNode;
        }
    }

    public void add(int x,int index){
        Node nNode = new Node();
        nNode.data=x;

        if(head==null && index==0){
            head=nNode;
            tail=nNode;
            nNode.next=null;
        }
        else if(head!=null && index==0){
            nNode.next=head;
            head=nNode;
        }
        else{
            int i=0;
            Node temp = head;
            Node temp2 = head;
            while(temp.next!=null){
                temp2=temp;
                temp = temp.next;
                i++;
            }
            if(i==index){
               temp2.next=nNode;
               nNode.next=temp;
            }
            else{
                temp = null;
                temp2 = null;
                int m = 0;
                while(m<index){
                    temp2=temp;
                    temp=temp.next;
                    m++;
                }
                temp2.next=nNode;
                nNode.next=temp;
            }
        }
    }

    public void dltHead(){
        if(head==null)
            System.out.println("There is no node in the list.");
        else if(head.next==null){
            head=null;
            tail=null;
        }
        else{
            head.next=head;
        }
    }

    public void dltTail(){
        if(head==null)
            System.out.println("There is no node in the list.");
        else if(head.next==null){
            head=null;
            tail=null;
        }
        else{
            Node temp = head;
            Node temp2 = head;
            while (temp.next!=null){
                temp2=temp;
                temp=temp.next;
            }
            temp2.next=null;
            tail=temp2;
        }
    }

    public void dlt(int index){
        if(head==null)
            System.out.println("There is no node in the list.");
        else if(head.next==null && index==0){
            head=null;
            tail=null;
        }
        else{
            int i=0;
            Node temp = head;
            Node temp2 = head;
            while (temp.next!=null){
                temp2=temp;
                temp=temp.next;
                i++;
            }
            if(i==index){
                temp2.next=null;
                tail=temp2;
            }
            else{
                temp = null;
                temp2 = null;
                int m = 0;
                while (m!=index){
                    temp2=temp;
                    temp=temp.next;
                    m++;
                }
                temp2.next=temp.next;
            }
        }
    }

    public void print(){
        Node nNode = head;
        while(nNode!=null){
            System.out.print(nNode.data + " -> ");
            nNode=nNode.next;
        }
    }

    public void allButFirst(int r){
        Node temp = new Node();
        while (temp!=null){
            if(temp.data==r)
                break;
            temp=temp.next;
        }
        if(temp==null)
            return;

        Node prev = temp;
        temp=temp.next;

        while(temp!=null){
            if(temp.data==r){
                prev.next=temp.next;
                temp=temp.next;
            }
            else{
                prev=temp;
                temp=temp.next;
            }
        }
    }




}
