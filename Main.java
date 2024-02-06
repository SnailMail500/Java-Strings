public class Main {
    public static void main (String[] args){
        String newStr = "Hello, World!";//intialise a string
        String oldStr = "Goodbye, World!";
        System.out.println(newStr);//print the string
        /*Strings are objects.
         * This means that you can use methods to perform operations on them, for example;
         */
        System.out.println(newStr.length());//Really sherlock? This prints the length of the string?
        System.out.println(newStr.toLowerCase());//and to lower case?
        System.out.println(newStr.toUpperCase());//and even to upper?
        //the next one is slightly less obvious, but still...
        System.out.println(newStr.indexOf("World!"));//should return 7 if I'm right which is probable (I think?). 
        //I was right.
        System.out.println(newStr.concat(oldStr));//concatenates the two strings using a method.
        //so that's kind of cool, especially given I'd never thought of strings as objects before...
        //there will be more once i do more java
    }
}
