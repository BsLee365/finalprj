package fra.konyang.final18681021.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MembersUpdateRequestDto {
    private String tel;
    private String addr;

    @Builder
    public MembersUpdateRequestDto(String tel, String addr){
        this.tel = tel;
        this.addr = addr;
    }
}
