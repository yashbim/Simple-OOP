public class Van {
    private String brand;
    private String driver_name;
    private String color;

    public Van(String brand, String driver_name, String color){
        this.brand=brand;
        this.driver_name=driver_name;
        this.color=color;
    }

    public String getBrand(){
        return brand;
    }

    public String getDriver_name(){
        return driver_name;
    }

    public String getColor(){
        return color;
    }
}
