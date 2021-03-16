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
    public char charAt(int index){
        Node curr = head;
        for(int nodeIndex = 0; nodeIndex < length; nodeIndex++){
            if(nodeIndex != index) {
                curr = curr.getNext();
            }
            else{
                break;
            }
        }
        return curr.getItem();    
    }
    public LinkedString concat(LinkedString str){
        if(str.head == null){
            return this;
        }
        else if(head == null){
            length = str.length();
            return str;
        }
        else{
            Node curr = head;
        while(curr.getNext() != null){
            curr = curr.getNext();
        }
            curr.setNext(str.head);
            length += str.length();
            return this;
        }
    }
    public LinkedString replace(char oldChar, char newChar){
        Node curr = head;
        for(int nodeIndex = 0; nodeIndex < length; nodeIndex++){
            if(curr.getItem()==oldChar) {
                curr.setItem(newChar);
                curr = curr.getNext();
            }
            else{
                curr=curr.getNext();
            }
        }
        return this;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length()==0;
    }
    
    @Override public String toString() {
        String list =" ";
        Node curr=head;
        while (curr!=null){
            list+=curr.getItem();
            curr=curr.getNext();
        }
        return list;
    }
}
