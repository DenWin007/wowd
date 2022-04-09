package by.vovden.wowd.contrillers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkController {

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public void mainmetod() {

    }
}
