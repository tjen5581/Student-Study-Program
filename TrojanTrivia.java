/**
 * TROJAN TRIVIA
 * Creator: Tatiana Jenkins
 * February 6 2021
 */
import java.util.Scanner;

public class StudyProgram {

   public static void main(String[] args) {
   Scanner reader = new Scanner(System.in);
   int numRight = 0;
    /**
    * sets the number of questions that will be correct to be calculated
    */
    System.out.println("It's Trojan Trivia Time!!");
    System.out.println("Insert name:           ");
      String input = reader.nextLine();      
    /**
    * Introduces the game
    */
         System.out.println("When was VSU Founded");
         System.out.println("Answer 1: 1882");
         System.out.println("Answer 2: 1908");
         System.out.println("Answer 3: 2000");
         System.out.print(">> ");
         String input = reader.nextLine();
   /**
   * First trivia question along with answer choices that will either be
   * correct or incorrect when answered
   */
  while (!input.equals("Answer 1") && !input.equals("Answer 2") && !input.equals("Answer 3")) {
        System.out.println("The answer you've enetered is incorect. Try again!");
        System.out.print("Enter your second attempt: ");
         input = reader.nextLine();
    /**
    * If a random answer is put in or typed incorrectly this "while"
    * statement/loop will allow for another attempt to get the answer
    * correct before moving on to the next question
    */
 }
  
 if (input.equals("Answer 1")) {
    System.out.println("GO TROJANS");
    numRight += 2;
  
 } 
   /**
   * determines the players input matches the correct answer and will
   * given a point if correct
   */
  
 else {
      System.out.println("WRONG! KNOW YOUR SCHOOL");
  
    /**
    * determines the players input matches does not match the correct
    * answer and the player will receive 0 points
    */
  
 }
 
      System.out.println("What is VSU Mascot");
      System.out.println("Answer 1: Spartan");
      System.out.println("Answer 2: Bull");
      System.out.println("Answer 3: Trojan");
      System.out.print(">> ");
    
  input = reader.nextLine();
  
   /**
   * Second trivia question along with answer choices that will either be
   * correct or incorrect when answered
   */
  
 while (!input.equals("Answer 3") && !input.equals("Answer 2") && !input.equals("Answer 1")) {
      System.out.println("The answer you've enetered is incorect. Try again!");
      System.out.print("Enter your second attempt: ");
  
  
 input = reader.nextLine();
  
   /**
   * If a random answer is put in or typed incorrectly this "while"
   * statement/loop will allow for another attempt to get the answer
   * correct before moving on to the next question
   */
  
 }
 if (input.equals("Answer 3")) {
       System.out.println("GO TROJANS");
    numRight += 2;
  
   /**
   * determines the players input matches the correct answer and will
   * given a point if correct
   */
  
 } else {
    System.out.println("WRONG! KNOW YOUR SCHOOL");

    /**
    * determines the players input matches does not match the correct
    * answer and the player will receive 0 points
    */
  
 }
    System.out.println("What is the president's name");
    System.out.println("Answer 1: President Jenkins");
    System.out.println("Answer 2: President Abdullah");
    System.out.println("Answer 3: President Sprinkles");
    System.out.print(">> ");
    
    
 input = reader.nextLine();
  
    /**
    * Third trivia question along with answer choices that will either be
    * correct or incorrect when answered
    */
  
 while (!input.equals("Answer 2") && !input.equals("Answer 1") && !input.equals("Answer 3")) {
      System.out.println("The answer you've enetered is incorect. Try again!");
      System.out.print("Enter your second attempt: ");
  
 input = reader.nextLine();
  
    /**
    * If a random answer is put in or typed incorrectly this "while"
    * statement/loop will allow for another attempt to get the answer
    * correct before moving on to the next question
    */
  
 }
 if (input.equals("Answer 2")) {
     System.out.println("GO TROJANS");
     numRight += 2;
  
    /**
    * determines the players input matches the correct answer and will
    * given a point if correct
    */
  
 } else {
     System.out.println("WRONG! KNOW YOUR SCHOOL");
  
   /**
   * determines the players input matches does not match the correct
   * answer and the player will receive 0 points
   */
  
 }
  
    System.out.println("What is the original name for VSU");
    System.out.println("Answer 1: Virginia State University");
    System.out.println("Answer 2: Virginia Normal & Industrial Institute");
    System.out.println("Answer 3: Virginia Union University");
    System.out.print(">> ");
    
 input = reader.nextLine();
  
    /**
    * Fourth trivia question along with answer choices that will either be
    * correct or incorrect when answered
    */
  
 while (!input.equals("Answer 2") && !input.equals("Answer 1") && !input.equals("Answer 3")) {
    System.out.println("The answer you've enetered is incorect. Try again!");
    System.out.print("Enter your second attempt: ");
  
  
 input = reader.nextLine();
  
    /**
    * If a random answer is put in or typed incorrectly this "while"
    * statement/loop will allow for another attempt to get the answer
    * correct before moving on to the next question
    */
  
 }
 if (input.equals("Answer 2")) {
  
   System.out.println("GO TROJANS");
   numRight += 2;
  
    /**
    * determines the players input matches the correct answer and will
    * given a point if correct
    */
  
 }
      System.out.println("What school is consirded LITTLE STATE ");
      System.out.println("Answer 1: Norfolk State University");
      System.out.println("Answer 2: Hampton University");
      System.out.println("Answer 3: Virginia Union University");
      System.out.print(">> ");
    
    
 input = reader.nextLine();
  
   /**
   * Fifth trivia question along with answer choices that will either be
   * correct or incorrect when answered
   */
  
 while (!input.equals("Answer 1") && !input.equals("Answer 2") && !input.equals("Answer 3")) {
     System.out.println("The answer you've enetered is incorect. Try again!");
     System.out.print("Enter your second attempt: ");
  
 input = reader.nextLine();
  
 }
 if (input.equals("Answer 1")) {
  
    System.out.println("GO TROJANS");
 numRight += 2;
  
   /**
   * determines the players input matches the correct answer and will
   * given a point if correct
   */
  
 } else {
  
    System.out.println("WRONG! KNOW YOUR SCHOOL");
  
   /**
   * determines the players input matches does not match the correct
   * answer and the player will receive 0 points
   */
 }
  
     System.out.println("What is the name of VSU Sports Conferenece");
     System.out.println("Answer 1: CIAA");
     System.out.println("Answer 2: DCAA");
     System.out.println("Answer 3: Division II");
     System.out.print(">> ");
    
 input = reader.nextLine();
  
    /**
    * Sixth trivia question along with answer choices that will either be
    * correct or incorrect when answered
    */
  
 while (!input.equals("Answer 1") && !input.equals("Answer 2") && !input.equals("Answer 3")) {
  
     System.out.println("The answer you've enetered is incorect. Try again!");
     System.out.print("Enter your second attempt: ");
  
  
 input = reader.nextLine();
   /**
   * If a random answer is put in or typed incorrectly this "while"
   * statement/loop will allow for another attempt to get the answer
   * correct before moving on to the next question
   */
  
 }
 if (input.equals("Answer 1")) {
  
    System.out.println("GO TROJANS");
    numRight += 2;
  
   /**
   * determines the players input matches the correct answer and will
   * given a point if correct
   */
  
 } else {
  
    System.out.println("WRONG! KNOW YOUR SCHOOL");
  
   /**
   * determines the players input matches does not match the correct
   * answer and the player will receive 0 points
   */
  
 }
  
      int totalTriviaQ = 6;
      double points = (100.0 * numRight) / totalTriviaQ;
  
   /**
   * Calculates the number right divided by 100 to give total percentage
   * on trivia game
   */
  
      System.out.println("You received" + " " + points + "!");
 /**
 * Prints out results of the game
 */
  
 }
 
}
