package aviadPackage;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {
    @RequestMapping("/api/hello/{name_of_person}")
    public String main_func(@PathVariable(value="name_of_person")  String name) {
        return "Hello " + name;
    }

}
