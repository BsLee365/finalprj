package fra.konyang.final18681021.web.dto;

import fra.konyang.final18681021.dmain.Members.Members;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.lang.reflect.Member;

@NoArgsConstructor
@Getter
public class MembersSaveRequestDto {
    private String name;
    private String tel;
    private String addr;

    @Builder
    public MembersSaveRequestDto(String name, String tel, String addr){
        this.name = name;
        this.tel = tel;
        this.addr = addr;
    }
    public Members toEntity(){
        return Members.builder()
                .name(name)
                .tel(tel)
                .addr(addr)
                .build();
    }
}
