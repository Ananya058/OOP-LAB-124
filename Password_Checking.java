import java.util.Scanner;
public class Password_Checking
{
    public static final int PASSWORD_LENGTH = 10;
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the password: ");
        String password = input.nextLine();
        
        int input_length = password.length();
        
        int charcount = 0;
        int digitcount = 0;
        int whitespacecount = 0;
        int special = 0;
        for(int i = 0;i < input_length;i++)
        {
            char ch = password.charAt(i);
            if(Character.isLetter(ch))
                charcount++;
            else if(Character.isDigit(ch))
                digitcount++;
            else if(Character.isWhitespace(ch))
                whitespacecount++;
            else if(ch >= 50 && ch <= 76||ch == 84)
                special++;
        }
        if(charcount >= 1 && digitcount >= 2 && whitespacecount >= 1 && input_length >= PASSWORD_LENGTH && special == 0)
           System.out.print("This password is valid");
        else
           System.out.print("This password is invalid");
        
        System.out.println("\n");
    }
}
