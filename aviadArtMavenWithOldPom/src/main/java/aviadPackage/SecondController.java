package aviadPackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//@RestController
@Controller
@ResponseBody
public class SecondController {
    @RequestMapping("/api/hello_second/{name_of_person}")
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
