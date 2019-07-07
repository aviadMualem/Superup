package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//@RestController
@Controller
@ResponseBody
public class SecondController {
    @RequestMapping("/api/hello_man/{name_of_person}")
    public String main_func(@PathVariable(value="name_of_person")  String name) {

        if(name=="Tomer")
        {
            return "<html>" +
                    "<header><title>This is title</title></header>" +
                    "<body>" +
                    "Hello TOMER" +
                    "</body>" +
                    "</html>" ;
        }
        return "<html>" +
                "<header><title>This is title</title></header>" +
                "<body>" +
                "Hello world madafaka" +
                "</body>" +
                "</html>" ;
    }

}
