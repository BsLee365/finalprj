package fra.konyang.final18681021.web;

import fra.konyang.final18681021.service.members.MembersService;
import fra.konyang.final18681021.web.dto.MembersResponseDto;
import fra.konyang.final18681021.web.dto.MembersSaveRequestDto;
import fra.konyang.final18681021.web.dto.MembersUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostApiController {
    private final MembersService membersService;

    @PostMapping("/api/v1/members")
    public long save(@RequestBody MembersSaveRequestDto requestDto){
        return membersService.save(requestDto);
    }

    //전화번호하고 주소만 변경
    @PutMapping("/api/v1/members/{id}")
    public long update(@PathVariable Long id, @RequestBody MembersUpdateRequestDto requestDto){
        return membersService.update(id, requestDto);
    }

    //아이디를 가져옴.
    @GetMapping("/api/v1/members/{id}")
    public MembersResponseDto findById(@PathVariable Long id){
        return membersService.findById(id);
    }

    //삭제
    @DeleteMapping("/api/v1/members/{id}")
    public Long delete(@PathVariable Long id){
        membersService.delete(id);
        return id;
    }

    //전체 삭제

}
