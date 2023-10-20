package com.example.slf.adapter.controller;

import com.example.framework.dto.ResponseDto;
import com.example.framework.dto.SuccessRespDto;
import com.example.slf.dto.request.company.CompanyReqDto;
import com.example.slf.dto.request.company.CompanyUpdateReqDto;
import com.example.slf.dto.response.company.CompanyRespDto;
import com.example.slf.service.virtual.ICompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/company")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CompanyController {

    ICompanyService companyService;

    public CompanyController(ICompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public ResponseDto getCompany(@RequestParam(defaultValue = "") String name) {
        List<CompanyRespDto> dtos = new ArrayList<>();

        dtos = companyService.selectByName(name);


        return new SuccessRespDto(dtos, "성공");
    }

    @PostMapping
    public ResponseDto updateCompany(@RequestBody CompanyUpdateReqDto dto) {
        CompanyRespDto respDto = companyService.selectOne(dto.after());

        if(respDto == null)
            companyService.update(dto);


        return new SuccessRespDto("성공");
    }

    @PutMapping
    public ResponseDto insertCompany(@RequestBody CompanyReqDto dto) {
        CompanyRespDto respDto = companyService.selectOne(dto.name());

        if(respDto == null)
            companyService.insert(dto);

        return new SuccessRespDto("성공");
    }

    @DeleteMapping
    public ResponseDto deleteCompany(@RequestBody CompanyReqDto dto) {
        companyService.delete(dto);

        return new SuccessRespDto("성공");
    }
}
