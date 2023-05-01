package com.plateer.ec.member.mapper;

import com.plateer.ec.member.dto.request.MemberInfoRequest;
import com.plateer.ec.member.dto.response.MemberInfoResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    List<MemberInfoResponse> getMemberInfoList();
    MemberInfoResponse getMemberInfo(MemberInfoRequest request);

    Long registerMemberInfo(MemberInfoRequest request);
}
