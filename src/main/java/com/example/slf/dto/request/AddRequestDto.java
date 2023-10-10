package com.example.slf.dto.request;

import com.example.slf.dto.DataTableDto;

public record AddRequestDto(
        String mainKey,
        String subKey,
        DataTableDto data
) {
}
