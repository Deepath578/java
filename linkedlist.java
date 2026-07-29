class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Linked{
    static Node head;
    static void insertEnd(int data)
{
    Node newNode=new  Node(data);
    if (head==null) 
    {
        head=newNode;
        return;
    }
        Node temp=head;
        while (tem.next!=null)
        {
            temp=temp.next;
        }
        static void display(){
            node temp=head;{
                system.out.print(temp.data+"");
                temp=temp.next;
            }
        }
        public static void main(string[] args){
           
            insert end(data:10);
            insert end(data:20);
            insert end(data:30);
            display();
        }
    }
