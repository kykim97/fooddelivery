package fooddelivery.domain;

import fooddelivery.FoodPreparationApplication;
import fooddelivery.domain.FoodPrepared;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Restaurant_table")
@Data
//<<< DDD / Aggregate Root
public class Restaurant {

    @Id
    @Embedded
    private UUID restaurantId;

    private String status;

    @PostPersist
    public void onPostPersist() {
        FoodPrepared foodPrepared = new FoodPrepared(this);
        foodPrepared.publishAfterCommit();
    }

    public static RestaurantRepository repository() {
        RestaurantRepository restaurantRepository = FoodPreparationApplication.applicationContext.getBean(
            RestaurantRepository.class
        );
        return restaurantRepository;
    }
}
//>>> DDD / Aggregate Root
