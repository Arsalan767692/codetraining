package coding;
class l
{
    Node head;
    
    class Node
    {
        String data;
        Node next;
        Node(String data)
        {
         this.data=data;
         this.next=null;   
        }
        
}
       public void addfirst(String data)
        {
          Node newNode=new Node(data);
          if (head==null)
          {
            head=newNode;
            return;

          }
          newNode.next=head;
          head=newNode;
        
          


        }
        public void addlast(String data)
        {
          Node newNode=new Node(data);
          if (head==null)
          {
            head=newNode;
            return;
          }
          else
          {
          newNode.next=newNode;
          return;
          }

        }
        public void print()
        {
            Node curNode=head;
            while(curNode!=null)
            {
                System.out.println(curNode.data);
                curNode=curNode.next;
            }
        }


    }

public class ll {
    public static void main(String args[])
    {
        
        l f=new l();
        f.addlast("is");
        f.addlast("was");
       
        f.print();


        

    }
    
}
