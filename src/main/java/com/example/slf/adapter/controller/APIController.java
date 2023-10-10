package com.example.slf.adapter.controller;

import com.example.framework.dto.ResponseDto;
import com.example.framework.dto.SuccessRespDto;
import com.example.slf.dto.request.AddRequestDto;
import com.example.slf.dto.request.GetRequestDto;
import com.example.slf.dto.request.RemoveReqeustDto;
import com.example.slf.service.virtual.IDataTableService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/chicken")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class APIController {

    final IDataTableService dataTableService;

    public APIController(IDataTableService dataTableService) {
        this.dataTableService = dataTableService;
    }

    @PostMapping
    public ResponseDto getInfo(@RequestBody GetRequestDto requestDto) {

        List list = dataTableService.selectAll(requestDto.mainKey(), requestDto.subKey(), requestDto.createOn());

        if(list == null)
            list = new ArrayList();

        return new SuccessRespDto(list, "성공");
    }

    @DeleteMapping
    public ResponseDto deleteItem(@RequestBody RemoveReqeustDto requestDto) {
        dataTableService.delete(requestDto.id());

        return new SuccessRespDto("성공");
    }

    @PutMapping
    public ResponseDto addItem(@RequestBody AddRequestDto requestDto) {
        dataTableService.insert(requestDto.mainKey(), requestDto.subKey(), requestDto.data());

        return new SuccessRespDto("성공");
    }



}
