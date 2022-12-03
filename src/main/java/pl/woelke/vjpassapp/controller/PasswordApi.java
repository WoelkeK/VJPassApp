package pl.woelke.vjpassapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/")
public class PasswordApi {

    private static Logger LOGGER = Logger.getLogger(PasswordApi.class.getName());

    @GetMapping("/passwords")
    public int getAllPasswords() {
        LOGGER.info("getAllPasswords()");
        return 200;
    }
}
