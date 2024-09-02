public class Concatnation {
    public static void main(String[] args) {
        // String str1 = "Kusuma";
        // String str2 = "Naveen";
        // System.out.println(str1.concat(str2));   
        // System.out.println(str1.length());
        // System.out.println(str2.length());
        // System.out.println(str2.charAt(2));

        String person = "Naveen";
        // String part = message.substring(2);
        // System.out.println(part);
        // System.out.println(message.repeat(3));
        // System.out.println(message.toUpperCase());
        // System.out.println(message.toLowerCase());
        // System.out.println(person.replace("Naveen", "Nithin"));

        int age = 24; //String formate:
        String msg = "%s is %d years old";
        System.out.println(String.format(msg,person,age));

        float rating = 4.68f; //Formating Decimal numbers:
        String mess = "%f";
        System.out.println(String.format(mess,rating));
        String mesg = "%.2f";
        System.out.println(String.format(mesg,rating));
    }
}
