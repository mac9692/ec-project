package com.plateer.ec.member.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberInfoResponse {
    private String mbrNo;
    private String mbrName;
    private String mbrPhoneNumber;
    private String mbrAddress;
    private String mbrAddressDetail;
}
