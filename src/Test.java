public class Test {
    public static void main(String[] args) {
        char[] chars = {'H','e'};
        String string="Hello";
        LinkedString list1 = new LinkedString(chars);
        LinkedString list2= new LinkedString(string);
        LinkedString list3= new LinkedString("mynameisSungwoongHa");
        list2.replace('l','p');
        list1.concat(list3);
        System.out.println(list1.toString());
        System.out.println(list2.toString());
    }
}