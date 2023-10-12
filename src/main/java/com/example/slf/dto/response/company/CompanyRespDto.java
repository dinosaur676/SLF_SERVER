package com.example.slf.dto.response.company;

import com.example.slf.dto.Company;

public record CompanyRespDto(
        long id,
        String name
) {
    static public CompanyRespDto create(Company company) {
        return new CompanyRespDto(
                company.getId(),
                company.getName()
        );
    }
}
