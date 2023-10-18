package com.example.slf.dto.request.work;

public record WorkInsertReqDto(
        String name,
        String workTime,
        int size,
        int count,
        int price,
        int total,
        String createdOn,
        long buyId
) {
}
