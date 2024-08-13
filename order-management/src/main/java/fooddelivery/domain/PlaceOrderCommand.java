package fooddelivery.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class PlaceOrderCommand {

    private UUID orderId;
    private UUID restaurantId;
    private String menu;
    private String deliveryLocation;
    private String paymentMethod;
}
