package InJava.technical.sheet4;

public class LL {
   private Node head;
   private Node tail;
   private int size;

  public LL(){size = 0;}

    public void insertStart(int val){
      Node node = new Node(val);
      node.next = head;
      head = node;
      size++;
      if(tail == null){
          tail = head;
      }
    }
    public void display(){
      Node temp = head;
      while (temp != null){
          System.out.print(temp.val + "->");
          temp = temp.next;
      }
      System.out.println("END");
    }
    public void specificNode(int val, int index){
      if(index == 0){
          insertStart(val);
          return;
      }
      if(index == size){
          insertLast(val);
          return;
        }
      Node temp = head;
      int i = 1;
      while (i < index){
          temp = temp.next;
          i++;
      }
        temp.next = new Node(val, temp.next);
      size++;

    }
    public void insertLast(int val){
      Node node = new Node(val);
      tail.next = node;
      tail = node;
      size++;
    }
    public void deleteFirst(){
      head = head.next;
      if(head == null){
          tail = null;
      }
      size--;
    }
    public void deleteEnd(){
      if(size < 2){
          deleteFirst();
          return;
      }
      tail = get(size - 2);
      tail.next = null;
      size--;
    }
    public Node get(int index){
      Node node = head;
      int i = 0;
      while (i < index){
          node = node.next;
          i++;
      }
      return node;
    }
    public void deleteIndex(int index){

    }
   public static class Node{
        int val;
        Node next;

       public Node(int val){ this.val = val; }
       public Node(int val, Node next){ this.val = val; this.next = next; }

    }
}
