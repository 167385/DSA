package InJava.technical.sheet4;

public class CreateSingleList {
    static void main(String[] args){
    LL obj = new LL();
    obj.insertStart(45);
    obj.insertStart(90);
    obj.insertStart(5);
    obj.insertLast(100);
    obj.specificNode(200,1);
    obj.display();
    obj.deleteFirst();
    obj.display();
    }
}
