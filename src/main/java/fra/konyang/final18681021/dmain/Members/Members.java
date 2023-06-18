package fra.konyang.final18681021.dmain.Members;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Members {

    //id number, 회원아이디 pk, not null
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //name varchar2 회원 이름 not null
    @Column(length = 100, nullable = false)
    private String name;

    //tel varchar2 전화번호 not null
    @Column(length = 100, nullable = false)
    private String tel;

    //addr varchar 주소 length=500, null
    @Column(length = 500, nullable = true)
    private String addr;

    @Builder
    public Members(String name, String tel, String addr){
        this.name = name;
        this.tel = tel;
        this.addr = addr;
    }

    //전화번호와 주소 더티체킹.
    public void update(String tel, String addr){
        this.tel = tel;
        this.addr = addr;
    }
}
