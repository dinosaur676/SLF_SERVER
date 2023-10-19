package com.example.slf.dto.response.work;

import com.example.slf.dto.Work;

public record WorkRespDto (
        long id,
        String name,
        String workTime,
        int size,
        int count,
        int price,
        int total,
        String createdOn,
        long buyId
){
    static public WorkRespDto create(Work dto) {
        return new WorkRespDto(
                dto.getId(),
                dto.getName(),
                dto.getWorkTime(),
                dto.getSize(),
                dto.getCount(),
                dto.getPrice(),
                dto.getTotal(),
                dto.getCreatedOn(),
                dto.getBuyId()
        );
    }
}
