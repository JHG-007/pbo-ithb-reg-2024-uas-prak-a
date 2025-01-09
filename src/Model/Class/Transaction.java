package Class;
public class Transaction {
    int id, total_cost;
    Customer customerID;
    double package_weight;
    String receipt_name, receipt_address, receipt_phone;

    public Transaction(int id, int total_cost, Customer customerID, double package_weight, String receipt_name,
            String receipt_address, String receipt_phone) {
        this.id = id;
        this.total_cost = total_cost;
        this.customerID = customerID;
        this.package_weight = package_weight;
        this.receipt_name = receipt_name;
        this.receipt_address = receipt_address;
        this.receipt_phone = receipt_phone;
    }

}
