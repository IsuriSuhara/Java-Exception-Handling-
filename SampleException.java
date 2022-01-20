package exception.handling;

public class SampleException {
    static void avg() throws ArithmeticException{
        System.out.println("Inside avg function");
        throw new ArithmeticException("Demo");
    }

    public static void main(String[] args) {
        try{

            try {
                throw new MyException(5);
            }
            catch (Exception e){
                System.out.println(e);
            }
            avg();
        }
        finally {
            System.out.println("Caught");
        }

    }
}
class MyException extends Exception{
    int a;
    MyException(int b){
        a=b;
    }
    public String toString(){
        return ("Exception number: "+a);
    }
}