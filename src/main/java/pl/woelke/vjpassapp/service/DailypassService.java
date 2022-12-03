package pl.woelke.vjpassapp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pl.woelke.vjpassapp.model.Dailypass;
import pl.woelke.vjpassapp.repository.DailypassRepository;

import javax.lang.model.element.Name;
import java.util.List;
import java.util.logging.Logger;

@Service
public class DailypassService {

    private static Logger LOGGER = Logger.getLogger(DailypassService.class.getName());
    private final DailypassRepository dailypassRepository;

    public DailypassService(DailypassRepository dailypassRepository) {
        this.dailypassRepository = dailypassRepository;
    }

    public List<Dailypass> list() {
        LOGGER.info("list()");
        List<Dailypass> dailypasses = dailypassRepository.findAll();
        LOGGER.info("list(...)" + dailypasses);
        return dailypasses;
    }

    public Dailypass create(Dailypass dailypass) {
        LOGGER.info("create()");
        Dailypass savedDailyPass = dailypassRepository.save(dailypass);
        LOGGER.info("create(...)");
        return savedDailyPass;
    }

    public Dailypass read(Long id) {
        LOGGER.info("read(" + id + ")");
        Dailypass singleDailyPass = dailypassRepository.findById(id).orElseThrow();
        LOGGER.info("read(...)");
        return singleDailyPass;
    }

    public Dailypass update(Dailypass dailypass) {
        LOGGER.info("update()");
        Dailypass editedDailyPass = dailypassRepository.findById(dailypass.getId()).orElseThrow();
        editedDailyPass.setDailypass(dailypass.getDailypass());
        Dailypass updatedDailyPass = dailypassRepository.save(editedDailyPass);
        LOGGER.info("update(...)");
        return updatedDailyPass;
    }

    public String delete(Long id) {
        LOGGER.info("delete(" + id + ")");
        Dailypass deleteDailyPass = dailypassRepository.findById(id).orElseThrow();
        dailypassRepository.delete(deleteDailyPass);
        LOGGER.info("delete(...)");
        return "delete complete";
    }
}
