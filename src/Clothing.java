import java.util.zip.DeflaterInputStream;

public class Clothing extends Item implements Discount, Tax{

    //Variables
    private String brand;
    private double price;
    private double units;
    private double discount;
    final double taxp = 8.5;

    //Le Constructor
    public Clothing(String itemCode, String name, double units, double price, String brand, double discount){

        super(itemCode, name);
        this.brand = brand;
        this.price = price;
        this.units = units;
        this.discount = discount;

    }
    //Calculate and Return Tax
    @Override
    public double computeTax(){
        return ((units * price) - computeDiscount()) * 8.5 / 100;
    }

    //Calculate and Return Discount
    @Override
    public double computeDiscount() {
        return (units * price) * (discount / 100);
    }

    //Return Total Price
    double computeTotalPrice(){
        return (units * price) - computeDiscount() + computeTax();
    }

    //Displays Clothing information
    public void displayClothing(){
        super.display();
        System.out.println("Units: " + this.units + " Price:$" + this.price + " Brand:" + this.brand + " Discount: " + this.discount + "% \n");

    }

}
