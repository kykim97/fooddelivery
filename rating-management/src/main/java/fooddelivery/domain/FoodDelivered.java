package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FoodDelivered extends AbstractEvent {

    private Object orderId;
    private Object driverId;
    private String status;
}
