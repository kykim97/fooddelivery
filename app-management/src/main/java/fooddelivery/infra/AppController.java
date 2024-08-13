package fooddelivery.infra;

import fooddelivery.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/apps")
@Transactional
public class AppController {

    @Autowired
    AppRepository appRepository;

    @RequestMapping(
        value = "/apps/{id}/",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public App updateApp(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /app/updateApp  called #####");
        Optional<App> optionalApp = appRepository.findById(id);

        optionalApp.orElseThrow(() -> new Exception("No Entity Found"));
        App app = optionalApp.get();
        app.updateApp();

        appRepository.save(app);
        return app;
    }
}
//>>> Clean Arch / Inbound Adaptor
