package com.example.demo;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController
@Controller
@ResponseBody
@Configuration
public class PropertyController {
	
	//@Value("${message.default.welcome}")
    //private String welcomeMessage;

	@RequestMapping("/api/properties/{name_of_person}")
    public String property_func(@PathVariable(value="name_of_person")  String name) {
        return "hey property";
    }

}
