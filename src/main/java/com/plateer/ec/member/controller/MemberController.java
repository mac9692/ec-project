package com.plateer.ec.member.controller;

import com.plateer.ec.common.entity.response.Response;
import com.plateer.ec.member.dto.request.MemberInfoRequest;
import com.plateer.ec.member.dto.response.MemberInfoResponse;
import com.plateer.ec.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("")
    public Response<List<MemberInfoResponse>> getMemberInfoList() {
        Response<List<MemberInfoResponse>> response = new Response<>();
        response.setData(memberService.getMemberInfoList());
        return response;
    }

    @GetMapping("member")
    public Response<MemberInfoResponse> getMemberInfo(MemberInfoRequest request) {
        Response<MemberInfoResponse> response = new Response<>();
        response.setData(memberService.getMemberInfo(request));
        return response;
    }
}
