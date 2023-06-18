package fra.konyang.final18681021.service.members;

import fra.konyang.final18681021.dmain.Members.Members;
import fra.konyang.final18681021.dmain.Members.MembersRepository;
import fra.konyang.final18681021.web.dto.MembersResponseDto;
import fra.konyang.final18681021.web.dto.MembersSaveRequestDto;
import fra.konyang.final18681021.web.dto.MembersUpdateRequestDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MembersService {
    public final MembersRepository membersRepository;

    @Transactional
    public Long save(MembersSaveRequestDto requestDto){
        return membersRepository.save(requestDto.toEntity()).getId();
    }

    //업데이트 항목들 tel, addr
    @Transactional
    public Long update(Long id, MembersUpdateRequestDto requestDto){
        Members members = membersRepository.findById(id).orElseThrow(()->new IllegalArgumentException("해당 게시물이 없습니다. id=" + id));
        members.update(requestDto.getTel(), requestDto.getAddr());

        return id;
    }

    @Transactional
    public MembersResponseDto findById(Long id){
        Members entity = membersRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("해당 게시물이 없습니다. id="+id));
        return new MembersResponseDto((entity));
    }
}
