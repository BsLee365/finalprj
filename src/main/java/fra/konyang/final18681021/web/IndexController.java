package fra.konyang.final18681021.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/members/save")
    public String membersSave(){
        return "members-save";
    }
}
