package fooddelivery.domain;

import fooddelivery.OrderManagementApplication;
import fooddelivery.domain.OrderCancelled;
import fooddelivery.domain.OrderPlaced;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Order_table")
@Data
//<<< DDD / Aggregate Root
public class Order {

    @Id
    @Embedded
    private UUID orderId;

    @Embedded
    private UUID restaurantId;

    private String menu;

    @Embedded
    private menuType menuType;

    private String deliveryLocation;

    private String paymentMethod;

    @Embedded
    private paymentMethodType paymentMethodType;

    private String status;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

        OrderCancelled orderCancelled = new OrderCancelled(this);
        orderCancelled.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static OrderRepository repository() {
        OrderRepository orderRepository = OrderManagementApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }
}
//>>> DDD / Aggregate Root
