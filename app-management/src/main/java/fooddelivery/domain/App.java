package fooddelivery.domain;

import fooddelivery.AppManagementApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "App_table")
@Data
//<<< DDD / Aggregate Root
public class App {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long updateId;

    @PrePersist
    public void onPrePersist() {}

    public static AppRepository repository() {
        AppRepository appRepository = AppManagementApplication.applicationContext.getBean(
            AppRepository.class
        );
        return appRepository;
    }

    //<<< Clean Arch / Port Method
    public void updateApp() {
        //implement business logic here:

        AppUpdated appUpdated = new AppUpdated(this);
        appUpdated.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
