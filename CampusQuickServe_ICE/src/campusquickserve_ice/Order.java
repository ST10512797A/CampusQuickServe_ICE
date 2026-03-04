package campusquickserve_ice;

public class Order {

    //Constant
    public static final double VAT_RATE = 0.15;
    
        //Attributes for calculations
        private String customerName;
        private String = studentNumber;
        private String = itemName;
        private int = quantity;
        private double = pricePerItem;        

        
    public Order(String customerName, String studentNumber, String itemName,
                 int quantity, double pricePerItem) {

        this.customerName = customerName;
        this.studentNumber = studentNumber;
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    
    //Getters
    public String getCustomerName() { return customerName; }
    public String getStudentNumber() { return studentNumber; }
    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }
    public double getPricePerItem() { return pricePerItem; }
    
    public double calculateSubtotal() {
      return quantity * pricePerItem;  
    };
    
    public double calculateDiscount() {
        if (quantity > 3) {
            return calculateSubtotal() * 0.10;
        } return 0;
    }
    
    public double calculateVAT() {
        double afterDiscount = calculateSubtotal() - calculateDiscount();
        returm afterDiscount = VAT_RATE;
    }
    
    public double calculateFinalTotal() {
        return (calculateSubtotal() - )
    }
}


