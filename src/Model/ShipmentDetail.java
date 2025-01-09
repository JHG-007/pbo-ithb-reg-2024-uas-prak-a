import Enum.ShipmentStatus;

import java.util.Date;

public class ShipmentDetail {
    int id;
    Transaction transaction_id;
    ShipmentStatus status;
    Date date;
    String current_Position, evidence, updated_by;

    public ShipmentDetail(int id, Transaction transaction_id, ShipmentStatus status, Date date, String current_Position,
            String evidence, String updated_by) {
        this.id = id;
        this.transaction_id = transaction_id;
        this.status = status;
        this.date = date;
        this.current_Position = current_Position;
        this.evidence = evidence;
        this.updated_by = updated_by;
    }

}
