import java.util.*;

public class Assignment3 {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a Sentence: ");
      String sentence = in.nextLine().toLowerCase();

      System.out.print("Enter a Letter: ");
      char letter = in.next().charAt(0);

      int letterIndex = sentence.indexOf(Character.toLowerCase(letter));

      if (letterIndex == -1) {
         System.out.println("The letter does not exist in the sentence.");
      } else {
         System.out.println(sentence.substring(letterIndex + 1));
      }
      in.close();
   }
}
