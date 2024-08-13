package fooddelivery.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class SubmitRatingCommand {

    private UUID orderId;
    private Integer rating;
    private String comment;
}
