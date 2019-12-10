public class Item {

    //Private variables for Superclass
    private String itemCode;
    private String name;

    //Constructor for Item Class
    public Item(String itemCode, String name){
        this.itemCode = itemCode;
        this.name = name;
    }

    //Display the item code and name
    public void display(){
        System.out.println("Item Code:" + this.itemCode + " Item Name:" + this.name);

    }
}



