package fooddelivery.domain;

import fooddelivery.RatingManagementApplication;
import fooddelivery.domain.RatingSubmitted;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Rating_table")
@Data
//<<< DDD / Aggregate Root
public class Rating {

    @Id
    @Embedded
    private UUID orderId;

    private Integer rating;

    private String comment;

    @PostPersist
    public void onPostPersist() {
        RatingSubmitted ratingSubmitted = new RatingSubmitted(this);
        ratingSubmitted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static RatingRepository repository() {
        RatingRepository ratingRepository = RatingManagementApplication.applicationContext.getBean(
            RatingRepository.class
        );
        return ratingRepository;
    }
}
//>>> DDD / Aggregate Root
