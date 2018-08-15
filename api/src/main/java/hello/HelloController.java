package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "This is the Greeting API v1.0!";
    }

    @RequestMapping("/query_db")
    public String queryDb(){
        return "Some day this will make a database call.";
    }
}
