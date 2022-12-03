package pl.woelke.vjpassapp.service;

import org.springframework.stereotype.Service;
import pl.woelke.vjpassapp.model.Dailypass;
import pl.woelke.vjpassapp.repository.DailypassRepository;

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

    public void create() {

    }

    public void read() {

    }

    public void update() {

    }

    public void delete() {

    }
}
