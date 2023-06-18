package fra.konyang.final18681021.web;

import fra.konyang.final18681021.service.members.MembersService;
import fra.konyang.final18681021.web.dto.MembersResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class IndexController {

    private final MembersService membersService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("members", membersService.findAll());
        return "index";
    }

    @GetMapping("/members/save")
    public String membersSave(){
        return "members-save";
    }

    @GetMapping("/members/update/{id}")
    public String membersUpdate(@PathVariable Long id, Model model){
        MembersResponseDto dto = membersService.findById(id);
        model.addAttribute("members", dto);
        return "members-update";
    }

}
