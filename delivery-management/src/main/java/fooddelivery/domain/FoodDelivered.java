package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FoodDelivered extends AbstractEvent {

    private UUID orderId;
    private UUID driverId;
    private String status;

    public FoodDelivered(Delivery aggregate) {
        super(aggregate);
    }

    public FoodDelivered() {
        super();
    }
}
//>>> DDD / Domain Event
