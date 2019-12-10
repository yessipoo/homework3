public class demoDepartmentBilling {
    public static void main(String[] args){

        // Grocery Object # 1
        Grocery grocery1 = new Grocery("11", "Bread",  2, 1.5, 0);
        // Grocery Object # 2
        Grocery grocery2 = new Grocery("12", "Apple", 6, 0.75, 1);

        //Clothing Object #1
        Clothing clothing1 = new Clothing("21", "Jeans", 1, 35,"Levis", 0);
        //Clothing Object #2
        Clothing clothing2 = new Clothing("22", "Dress Shirt", 2, 25, "Izod", 10);

        double totalPrice = 0;
        totalPrice = grocery1.computeTotalPrice() + grocery2.computeTotalPrice() + clothing1.computeTotalPrice() + clothing2.computeTotalPrice();

        //Display Items
        grocery1.displayGrocery();
        grocery2.displayGrocery();
        clothing1.displayClothing();
        clothing2.displayClothing();

        //Output the Total amount
        System.out.println("Bill Amount: $" + totalPrice + "\n");

    }
}
