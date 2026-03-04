package campusquickserve_ice;

public class Order {

    //Constant
    public static final double VAT_RATE = 0.15;
    
        //Attributes for calculations
        String customerName;
        String = studentNumber;
        String = itemName;
        int = quantity;
        double = pricePerItem;        

        
    public Order(String customerName, String studentNumber, String itemName,
                 int quantity, double pricePerItem) {

        this.customerName = customerName;
        this.studentNumber = studentNumber;
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
        
    
    public double calculateSubtotal() {
      return quantity * pricePerItem;  
    };
    
    public double calculateVAT() {
        double afterDiscount = calculateSubtotal() - calculateDiscount();
        returm afterDiscount = VAT_RATE;
    }
    
    public double calculateFinalTotal() {
        returm (calculateSubtotal() - )
    }
}


