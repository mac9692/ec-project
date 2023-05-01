package com.plateer.ec.member.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberInfoRequest {
    private String mbrNo;
    private String mbrName;
    private String mbrPhoneNumber;
    private String mbrAddress;
    private String mbrAddressDetail;
}
