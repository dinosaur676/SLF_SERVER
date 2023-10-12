package com.example.slf.service;

import com.example.slf.dto.request.company.CompanyReqDto;
import com.example.slf.dto.request.company.CompanyUpdateReqDto;
import com.example.slf.dto.response.company.CompanyRespDto;
import com.example.slf.repository.virtual.ICompanyRepository;
import com.example.slf.service.virtual.ICompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyService implements ICompanyService {

    final ICompanyRepository companyRepository;

    public CompanyService(ICompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<CompanyRespDto> select() {
        return companyRepository.select().stream().map(CompanyRespDto::create).collect(Collectors.toList());
    }

    @Override
    public List<CompanyRespDto> selectByName(String name) {
        return companyRepository.selectByName(name).stream().map(CompanyRespDto::create).collect(Collectors.toList());
    }

    @Override
    public void update(CompanyUpdateReqDto dto) {
        companyRepository.update(dto);
    }

    @Override
    public void insert(CompanyReqDto dto) {
        companyRepository.insert(dto);
    }
}
