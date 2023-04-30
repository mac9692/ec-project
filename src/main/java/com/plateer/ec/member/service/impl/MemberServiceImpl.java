package com.plateer.ec.member.service.impl;

import com.plateer.ec.member.dto.request.MemberInfoRequest;
import com.plateer.ec.member.dto.response.MemberInfoResponse;
import com.plateer.ec.member.mapper.MemberMapper;
import com.plateer.ec.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberMapper memberMapper;
    @Override
    public MemberInfoResponse getMemberInfo(MemberInfoRequest request) {
        return MemberInfoResponse.entityToDto(memberMapper.getMemberInfo(request));
    }
}
