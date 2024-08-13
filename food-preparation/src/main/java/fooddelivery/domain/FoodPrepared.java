package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FoodPrepared extends AbstractEvent {

    private UUID restaurantId;
    private String status;

    public FoodPrepared(Restaurant aggregate) {
        super(aggregate);
    }

    public FoodPrepared() {
        super();
    }
}
//>>> DDD / Domain Event
