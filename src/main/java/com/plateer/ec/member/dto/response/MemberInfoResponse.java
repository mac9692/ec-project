package com.plateer.ec.member.dto.response;

import com.plateer.ec.member.entity.EtMbrBase;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MemberInfoResponse {
    private String mbrNo;
    private String mbrName;
    private String mbrPhoneNumber;
    private String mbrAddress;
    private String mbrAddressDetail;

    public static MemberInfoResponse entityToDto(EtMbrBase etMbrBase) {
        return MemberInfoResponse.builder()
                .mbrNo(etMbrBase.getMbrNo())
                .mbrName(etMbrBase.getMbrName())
                .mbrPhoneNumber(etMbrBase.getMbrPhoneNumber())
                .mbrAddress(etMbrBase.getMbrAddress())
                .mbrAddressDetail(etMbrBase.getMbrAddressDetail())
                .build();
    }
}
