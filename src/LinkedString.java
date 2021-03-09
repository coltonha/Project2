public class LinkedString {
    private Node head;
    private int length;

    public LinkedString(){
        head=null;
        length=0;
    }

    public LinkedString(char[] value){

        if(value.length == 0){
            return;
        }
        Node newNode = new Node(value[0]);
        head = newNode;
        length++;
        Node curr = head;

        for(int nodeIndex = 1; nodeIndex < value.length; nodeIndex++){            
            newNode = new Node (value[nodeIndex]);
            curr.setNext(newNode);
            curr=curr.getNext();
            length++;
        }
    }
    public LinkedString(String original){
        if(original.length() == 0) {
            return;
        }
        Node newNode = new Node(original.charAt(0));
        head = newNode;
        length++;
        Node curr = head;    
        for(int nodeIndex = 1; nodeIndex < original.length(); nodeIndex++){
            newNode = new Node(original.charAt(nodeIndex));
            curr.setNext(newNode);
            curr=curr.getNext();
            length++;
        }
    }

    public void add(char newItem) {
        if(isEmpty()){
            Node newNode= new Node();
            newNode.setItem(newItem);
            head=newNode;
            length++;
        }
        else{
            Node curr=head;
            Node newNode=new Node(newItem);
            while(curr.getNext()!= null){
                curr=curr.getNext();
            }
            curr.setNext(newNode);
        }
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length()==0;
    }
    
    @Override
    public String toString() {
        String list =" ";
        Node curr=head;
        while (curr!=null){
            list+=curr.getItem();
            curr=curr.getNext();
        }
        return list;
    }
}
