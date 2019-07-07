package com.example.aviad_put_straight_in_git_repo;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class GreetingController {
    @RequestMapping("/api/hello/{name_of_person}")
    public String main_func(@PathVariable(value="name_of_person")  String name) {
        return "special version 1 " + name;
    }

}
