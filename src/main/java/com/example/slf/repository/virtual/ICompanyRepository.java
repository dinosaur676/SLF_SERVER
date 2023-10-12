package com.example.slf.repository.virtual;

import com.example.slf.dto.Company;
import com.example.slf.dto.request.company.CompanyReqDto;
import com.example.slf.dto.request.company.CompanyUpdateReqDto;

import java.util.List;

public interface ICompanyRepository {
    List<Company> select();
    List<Company> selectByName(String name);
    void update(CompanyUpdateReqDto dto);
    void insert(CompanyReqDto dto);
}
