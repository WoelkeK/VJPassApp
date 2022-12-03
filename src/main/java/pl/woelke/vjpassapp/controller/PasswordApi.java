package pl.woelke.vjpassapp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.woelke.vjpassapp.model.Dailypass;
import pl.woelke.vjpassapp.service.DailypassService;

import javax.lang.model.element.Name;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/")
public class PasswordApi {

    private static Logger LOGGER = Logger.getLogger(PasswordApi.class.getName());
    private final DailypassService dailypassService;

    public PasswordApi(DailypassService dailypassService) {
        this.dailypassService = dailypassService;
    }

    @GetMapping("/test")
    public int testApiEndpoint() {
        LOGGER.info("getAllPasswords()");
        return 200;
    }

    @GetMapping("/passwords")
    public List<Dailypass> getAllPasswords() {
        LOGGER.info("getAllPasswords()");
        List<Dailypass> dailypassList = dailypassService.list();
        LOGGER.info("getAllPasswords(...)");
        return dailypassList;
    }

    @PostMapping("/passwords")
    public Dailypass create(@RequestBody Dailypass dailypass) {
        LOGGER.info("create()");
        Dailypass savedDailyPass = dailypassService.create(dailypass);
        LOGGER.info("create(...)");
        return savedDailyPass;
    }

    @GetMapping("/passwords/{id}")
    public Dailypass read(@PathVariable(name = "id") Long id) {
        LOGGER.info("read(" + id + ")");
        Dailypass singleDailyPass = dailypassService.read(id);
        LOGGER.info("read(...) " + singleDailyPass);
        return singleDailyPass;
    }

    @PutMapping("/passwords")
    public Dailypass update(@RequestBody Dailypass dailypass) {
        LOGGER.info("update()");
        Dailypass updatedDailyPass = dailypassService.update(dailypass);
        LOGGER.info("update(...) " + updatedDailyPass);
        return updatedDailyPass;
    }

    @DeleteMapping("/passwords/{id}")
    public String delete(@PathVariable Long id) {
        LOGGER.info("delete()");
        String deleteStatus = dailypassService.delete(id);
        LOGGER.info("delete(...) " + deleteStatus);
        return deleteStatus;
    }
}
