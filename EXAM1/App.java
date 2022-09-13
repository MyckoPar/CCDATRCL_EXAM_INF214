import java.util.Stack;
import java.util.LinkedList;

//Array
public class App {
    public static void main(String[] args) throws Exception {
        //Surname
       char[] SurnameArray = {'P','A','R'};
       for (int c = 0; c <SurnameArray.length; c++){
        System.out.println(SurnameArray[c]);
       }
        //First character
        System.out.println(SurnameArray[0]);
        // Last character
        System.out.println(SurnameArray[2]);
       
        //Reverse
        for(int c = SurnameArray.length - 1; c >= 0; c-- ){
            System.out.println(SurnameArray[c]);

        
       }
    


// Linked List
        // ======================================================
        // 1. Create a Linked list StudentNumber
        LinkedList<String> StudentNum = new LinkedList<>();

        StudentNum.add("1");
        StudentNum.add("0");
        StudentNum.add("3");
        StudentNum.add("0");
        StudentNum.add("6");
        StudentNum.add("7");

        

        // 2. Add "*" to the head/front of the Linked list
        StudentNum.addFirst("*");

        

        // 3. Add "*" to the tail/end of the Linked list
        StudentNum.addLast("*");
        System.out.println(StudentNum);

        // 4. Display the last character of the Linked list
        System.out.println(StudentNum.get(7));

        // 5. Replace the last character of the Linked list with "!";
        StudentNum.set(7, "!");

        // 6. Remove the first character of the Linked list
        StudentNum.remove(0);

        // // 7. Display the LinkedList
        System.out.println(StudentNum);
    
        //Stack
        Stack<String> surname = new Stack<>();

        surname.push("P");
        surname.push("A");
        surname.push("R");
       

        // 2. Print the Stack
        System.out.println(surname);

        // 3. Add a "Inf214" to the stack
        surname.push(" ");
        surname.push("I");
        surname.push("N");
        surname.push("F");
        surname.push("2");
        surname.push("1");
        surname.push("4");

        // 4. Print the Stack
        System.out.println(surname);

        // 5. Remove "inf214" and add "ccdatrcl-inf214"
        surname.pop();
        surname.pop();
        surname.pop();
        surname.pop();
        surname.pop();
        surname.pop();

        surname.push("C");
        surname.push("C");
        surname.push("D");
        surname.push("A");
        surname.push("T");
        surname.push("R");
        surname.push("C");
        surname.push("L");
        surname.push("-");
        surname.push("I");
        surname.push("N");
        surname.push("F");
        surname.push("2");
        surname.push("1");
        surname.push("4");

        // 6. Print the Stack
        System.out.println(surname);
    }
}


