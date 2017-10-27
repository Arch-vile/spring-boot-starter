package nakoradio.springbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.stream.Collectors;

@RestController
public class Controller {

    @Autowired
    private Environment environment;


    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot profile: " +
                Arrays.stream(environment.getActiveProfiles()).collect(Collectors.joining(","));
    }

}
