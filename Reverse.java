write a program to reverse a word using loop. (do not use inbuilt function).

class Reverse
 {
   public static void main(String[] args) 
{
String word = "Hello";
String reversedWord = "";
for (int i = word.length() - 1; i >= 0; i--)
 {
reversedWord += word.charAt(i);
 }
System.out.println("Original Word: " + word);
System.out.println("Reversed Word: " + reversedWord);
    }
}
