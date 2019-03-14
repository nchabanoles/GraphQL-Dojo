package perso.chabanoles.graphql;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Endpoint {

    @RequestMapping("/")
    public String index() {
        return "If you can read me it means you are ready to move on to the next step of the exercise!";
    }
}
