public class Grocery extends Item implements Discount, Tax {

    //Variables
    private double price;
    private double units;
    private double discount;

    //Le Constructor
    public Grocery(String itemCode, String name, double units, double price, double discount){

        super(itemCode, name);
        this.price = price;
        this.discount = discount;
        this.units = units;

    }

    //Calculate Tax
    @Override
    public double computeTax(){

        return 0;
    }

    //Calculate Discount
    @Override
    public double computeDiscount(){

        return (units * price) * (discount / 100.00);
    }

    //Calculate Total Price
    public double computeTotalPrice(){
        double discount = computeDiscount();
        return (units * price) - discount + computeTax();
    }

    //Output
    public void displayGrocery(){
        super.display();
        System.out.println("Units: " + this.units + ", Price:$" + this.price + ", Discount:" + this.discount + "%, Tax:0 \n");
    }


}
