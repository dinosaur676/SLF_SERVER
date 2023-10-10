package com.example.slf.dto.request;

public record GetRequestDto(
        String mainKey,
        String subKey,
        String createOn
) {
}
