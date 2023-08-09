import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Van> vehicles = new ArrayList<>(); //declaring ArrayList

        for (int i=1; i<=3; i++){   //data input loop
            Scanner myscanner=new Scanner(System.in);

            System.out.println("Enter brand :");
            String input_brand = myscanner.nextLine();

            System.out.println("Enter driver name :");
            String input_driver = myscanner.nextLine();

            System.out.println("Enter color :");
            String input_color = myscanner.nextLine();

            vehicles.add(new Van(input_brand,input_driver,input_color));
        }

        for (Van van : vehicles){
            System.out.println("\nVan "+van+
                    "\n========"+
                    "\nBrand : " +van.getBrand()+
                    "\nDriver : "+van.getDriver_name()+
                    "\nColor : "+van.getColor());
        }




    }
}




