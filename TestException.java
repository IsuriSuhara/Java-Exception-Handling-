package exception.handling;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestException {

    private static SimpleDateFormat outputsdf;

    static void convertDataFormat(String inputDate){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            Date date =sdf.parse(inputDate);
            outputsdf = new SimpleDateFormat("yyyy-mm-dd");
            String outputDate = outputsdf.format(date);
            System.out.println("After changing data format to yyyy/mm/dd: "+outputDate);

        }catch (java.text.ParseException e){
            System.out.println("Some error occurred while converting date formats ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter date in dd/MM/yyyy format: ");
        String inputDate = scan.nextLine();
        convertDataFormat(inputDate);
    }
}
