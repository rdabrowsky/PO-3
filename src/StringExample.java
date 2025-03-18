public class StringExample {
    public static void main(String[] args) {
        String text = "Hello World";

        // toCharArray()
        char[] charArray = text.toCharArray();
        System.out.println("toCharArray(): " + new String(charArray));

        // getBytes()
        byte[] byteArray = text.getBytes();
        System.out.println("getBytes(): " + byteArray.length + " bytes");

        // equals() i equalsIgnoreCase()
        System.out.println("equals('hello world'): " + text.equals("hello world"));
        System.out.println("equalsIgnoreCase('hello world'): " + text.equalsIgnoreCase("hello world"));

        // compareTo() and compareToIgnoreCase()
        System.out.println("compareTo('Hello') : " + text.compareTo("Hello"));
        System.out.println("compareToIgnoreCase('hello world'): " + text.compareToIgnoreCase("hello world"));

        // indexOf() and lastIndexOf()
        System.out.println("indexOf('o'): " + text.indexOf('o'));
        System.out.println("lastIndexOf('o'): " + text.lastIndexOf('o'));

        // substring()
        System.out.println("substring(6): " + text.substring(6));
        System.out.println("substring(0, 5): " + text.substring(0, 5));

        // replace()
        System.out.println("replace('o', 'a'): " + text.replace('o', 'a'));

        // trim()
        String spacedText = "  Trim me  ";
        System.out.println("trim(): '" + spacedText.trim() + "'");

        // toLowerCase() and toUpperCase()
        System.out.println("toLowerCase(): " + text.toLowerCase());
        System.out.println("toUpperCase(): " + text.toUpperCase());

        // split()
        String csv = "apple,banana,grape";
        String[] fruits = csv.split(",");
        System.out.println("split(','):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}