package exception.handling;
import java.util.*;

class AnotherSampleException {
    static void validateInput(int number) throws InvalidInputException{
        if (number>100){
            throw new InvalidInputException("Exception");
        }
        System.out.println("valid input");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number less than 100: ");
        int number=sc.nextInt();
        try{
            validateInput(number);
        }catch (InvalidInputException e){
            System.out.println("Caught Exception - Input is greater than 100");
        }
    }

}
class InvalidInputException extends Exception{
    InvalidInputException(String exceptionText){
        super(exceptionText);
    }
}