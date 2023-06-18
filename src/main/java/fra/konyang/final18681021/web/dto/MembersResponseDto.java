package fra.konyang.final18681021.web.dto;

import fra.konyang.final18681021.dmain.Members.Members;
import lombok.Getter;

@Getter
public class MembersResponseDto {
    private Long id;
    private String name;
    private String tel;
    private String addr;

    public MembersResponseDto(Members entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.tel = entity.getTel();
        this.addr = entity.getAddr();
    }
}
