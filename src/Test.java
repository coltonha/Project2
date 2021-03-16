 /*
 * Project #2
 * Source Code File: Test.java
 * Programmer: Sungwoong Ha
 * Due: 3/23/21
 * Description: This is a Test class which creates LinkedString objects.
 */
public class Test {
    public static void main(String[] args) {
        char[] chars = {'H','e'};
        String string="Hello";
        LinkedString list1 = new LinkedString(chars);
        LinkedString list2= new LinkedString(string);
        LinkedString list3= new LinkedString("mynameisSungwoongHa");
        LinkedString list4=new LinkedString();
        list2.replace('l','p');
        list1.concat(list3);
        System.out.println(list1.toString());
        System.out.println(list2.toString());
        System.out.println(list3.charAt(0));
        System.out.println(list1.length());
        System.out.println(list4.isEmpty());
    }
}