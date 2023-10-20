package com.example.slf.service.virtual;

import com.example.slf.dto.Company;
import com.example.slf.dto.request.company.CompanyReqDto;
import com.example.slf.dto.request.company.CompanyUpdateReqDto;
import com.example.slf.dto.response.company.CompanyRespDto;

import java.util.List;

public interface ICompanyService {
    List<CompanyRespDto> select();
    List<CompanyRespDto> selectByName(String name);

    CompanyRespDto selectOne(String name);
    void update(CompanyUpdateReqDto dto);
    void insert(CompanyReqDto dto);
    void delete(CompanyReqDto dto);
}
