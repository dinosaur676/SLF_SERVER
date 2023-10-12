package com.example.slf.dto.request.work;

public record WorkInsertReqDto(
        String name,
        String workTime,
        int size,
        int count,
        int price,
        String createdOn
) {
}
