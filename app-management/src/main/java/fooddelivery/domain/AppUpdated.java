package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class AppUpdated extends AbstractEvent {

    public AppUpdated(App aggregate) {
        super(aggregate);
    }

    public AppUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
