package com.plateer.ec.member.mapper;

import com.plateer.ec.member.dto.request.MemberInfoRequest;
import com.plateer.ec.member.entity.EtMbrBase;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    EtMbrBase getMemberInfo(MemberInfoRequest request);
}
