public class Test {
    public static void main(String[] args) {
        char[] chars = {'H','e'};
        String string="Hello";
        LinkedString list1 = new LinkedString(chars);
        LinkedString list2= new LinkedString(string);
        list2.replace('l','p');
        list1.concat("mynameisSungwoongHa");
        System.out.println(list1.toString());
        System.out.println(list2.toString());
    }
}