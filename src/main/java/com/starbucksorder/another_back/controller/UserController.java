package com.starbucksorder.another_back.controller;

import com.starbucksorder.another_back.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// HACK: 매핑명 변경 /points -> point
@RequestMapping("/point")
public class UserController {

    @Autowired
    private PointService pointService;

    // HACK: 응답 데이터 확인

    // 전화번호로 사용자 조회 및 포인트 조회
    @GetMapping("/user/phone")
    public ResponseEntity<?> getUserId(@RequestParam String phoneNumber) {
        return ResponseEntity.ok().body(pointService.getUserIdByPhoneNumber(phoneNumber));
    }

    // 사용자 등록


    // 포인트 적립 할래요 : 결제 성공 후 -> 포인트 적립
    // 포인트 적립 안할래요 : 결제 성공 -> 끝


    // 포인트 사용

}