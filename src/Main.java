import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Van> vans = new ArrayList<>();

        for (int i=1; i<=3; i++){
            Scanner myscanner=new Scanner(System.in);

            System.out.println("Enter brand :");
            String input_brand = myscanner.nextLine();

            System.out.println("Enter driver name :");
            String input_driver = myscanner.nextLine();

            System.out.println("Enter color :");
            String input_color = myscanner.nextLine();

            vans.add(new Van(input_brand,input_driver,input_color));
        }

        for (Van van : vans){
            System.out.println("\nVan "+van+
                    "\n========"+
                    "\nBrand : " +van.getBrand()+
                    "\nDriver : "+van.getDriver_name()+
                    "\nColor : "+van.getColor());
        }




    }
}




