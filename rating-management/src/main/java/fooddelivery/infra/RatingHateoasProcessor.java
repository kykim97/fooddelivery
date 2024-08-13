package fooddelivery.infra;

import fooddelivery.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class RatingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Rating>> {

    @Override
    public EntityModel<Rating> process(EntityModel<Rating> model) {
        return model;
    }
}
