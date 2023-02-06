import java.util.*;
public class Main
    {

    public static void main(String[] args)
    {

        System.out.println("input a string and ill yell it back at you!");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        System.out.println(ChangeString.yellString(userInput));
    }

    }