package com.plateer.ec.member.service;

import com.plateer.ec.member.dto.request.MemberInfoRequest;
import com.plateer.ec.member.dto.response.MemberInfoResponse;

public interface MemberService {
    MemberInfoResponse getMemberInfo(MemberInfoRequest request);
}
