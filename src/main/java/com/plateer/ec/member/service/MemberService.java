package com.plateer.ec.member.service;

import com.plateer.ec.member.dto.request.MemberInfoRequest;
import com.plateer.ec.member.dto.response.MemberInfoResponse;

import java.util.List;

public interface MemberService {
    List<MemberInfoResponse> getMemberInfoList();
    MemberInfoResponse getMemberInfo(MemberInfoRequest request);

    Long registerMemberInfo(MemberInfoRequest request);
}
