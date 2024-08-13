package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RatingSubmitted extends AbstractEvent {

    private UUID orderId;
    private Integer rating;
    private String comment;

    public RatingSubmitted(Rating aggregate) {
        super(aggregate);
    }

    public RatingSubmitted() {
        super();
    }
}
//>>> DDD / Domain Event
