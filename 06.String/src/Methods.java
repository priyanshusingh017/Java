public class Methods {
    public static void main(String[]args){
        String str1 = "Hello World";
        // str1.length() -> return length of string
        System.out.println(str1.length()); // 11

        // str1.toLowerCase() -> return a strings in which all Character in lower case
        System.out.println(str1.toLowerCase()); // hello world

        //str1.toUpperCase() -> return all character in Upper case
        System.out.println(str1.toUpperCase()); // HELLO WORLD

        //str2.trim() -> return after removing all leading and trailing spaces
        String str2 = "    Hello World    ";
        System.out.println(str2.trim()); // Hello World

        //str1.substring(start , end ) -> returns string from start index to end-1 index
        System.out.println(str1.substring(2,7)); // llo W

        // str1.substring(start) -> print the string from starting index .
        System.out.println(str1.substring(7)); // orld

        //str1.replace('old character' , 'new character') -> print the string after replace the old character with new character.
        System.out.println(str1.replace('o','x')); // Hellx Wxrld
        System.out.println(str1.replace("o", "try")); // Helltry Wtryrld

        // str1.startsWith("string") -> if start the given string than give true and if not then false .
        System.out.println(str1.startsWith("He"));

        // str1.endsWith("string") -> if end the given string than give true and if not then false
        System.out.println(str1.endsWith("ld"));

        //str1.charAt(index) -> return the char at the given index
        System.out.println(str1.charAt(2)); // l

        //str1.indexOf("string") -> return the first occurrences of the given string .
        System.out.println(str1.indexOf("l")); // 2

        // str1.indexOf("string" , index) -> start searching of the string from given index .
        System.out.println(str1.indexOf("l" , 4)); // 9

        //str1.lastIndexOf("string") -> return the last index of the given string.
        System.out.println(str1.lastIndexOf("l"));

        //str1.lastIndexOf("string" , index) -> return the last index of given string before given index ( means its last start from index 4 )
        System.out.println(str1.lastIndexOf("l" , 4));

        //str1.equals("str1") -> when we have compare str1 or str2 if equal then true or not then false.
        System.out.println(str1.equals("Hello World"));


        //str1.equalsIgnoreCase("string") -> ignore the case-sensitive just match the value .
        System.out.println(str1.equalsIgnoreCase("HeLLO world"));

    }
}
