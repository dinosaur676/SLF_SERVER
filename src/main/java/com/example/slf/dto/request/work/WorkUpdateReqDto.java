package com.example.slf.dto.request.work;

public record WorkUpdateReqDto(
        long id,
        String name,
        String workTime,
        int size,
        int count,
        int price,
        int total
) {

}
