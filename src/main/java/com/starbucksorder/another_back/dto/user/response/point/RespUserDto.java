package com.starbucksorder.another_back.dto.user.response.point;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
public class RespUserDto {
    private boolean isSuccess;
    private Long userId;
    private String phoneNumber;
    private int starCount;

    private List<RespCouponDto> Coupons;

    @Data
    @Builder
    public static class RespCouponDto {
        private Long couponId;
        private String couponName;
        private LocalDateTime registerDate;
    }
}