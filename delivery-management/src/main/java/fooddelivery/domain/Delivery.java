package fooddelivery.domain;

import fooddelivery.DeliveryManagementApplication;
import fooddelivery.domain.FoodDelivered;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Delivery_table")
@Data
//<<< DDD / Aggregate Root
public class Delivery {

    @Id
    @Embedded
    private UUID orderId;

    @Embedded
    private UUID driverId;

    private String status;

    @PostPersist
    public void onPostPersist() {
        FoodDelivered foodDelivered = new FoodDelivered(this);
        foodDelivered.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = DeliveryManagementApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }
}
//>>> DDD / Aggregate Root
