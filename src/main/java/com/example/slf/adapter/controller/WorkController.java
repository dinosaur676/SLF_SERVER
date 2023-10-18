package com.example.slf.adapter.controller;

import com.example.framework.dto.ResponseDto;
import com.example.framework.dto.SuccessRespDto;
import com.example.slf.dto.request.work.WorkDeleteReqDto;
import com.example.slf.dto.request.work.WorkInsertReqDto;
import com.example.slf.dto.request.work.WorkUpdateReqDto;
import com.example.slf.dto.response.work.WorkRespDto;
import com.example.slf.service.virtual.IWorkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/work")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class WorkController {

    IWorkService workService;

    public WorkController(IWorkService workService) {
        this.workService = workService;
    }

    @GetMapping
    public ResponseDto getWorkDatas(@RequestParam() String createdOn) {
        List<WorkRespDto> workRespDtos = workService.select(createdOn);

        return new SuccessRespDto(workRespDtos);
    }

    @GetMapping("/one")
    public ResponseDto getWorkData(@RequestParam() long id) {
        WorkRespDto workRespDto = workService.selectById(id);

        if(workRespDto == null) {
            return new SuccessRespDto();
        }

        return new SuccessRespDto(workRespDto);
    }

    @GetMapping("/buy")
    public ResponseDto getWorkDatasByBuyID(@RequestParam() long buyId)
    {
        List<WorkRespDto> workRespDtos = workService.selectByBuyId(buyId);

        return new SuccessRespDto(workRespDtos);
    }

    @PutMapping
    public ResponseDto insertData(@RequestBody WorkInsertReqDto reqDto) {
        workService.insert(reqDto);

        return new SuccessRespDto();
    }

    @PostMapping
    public ResponseDto updateData(@RequestBody WorkUpdateReqDto reqDto) {
        workService.update(reqDto);

        return new SuccessRespDto();
    }

    @DeleteMapping
    public ResponseDto deleteData(@RequestBody WorkDeleteReqDto reqDto) {
        workService.delete(reqDto);

        return new SuccessRespDto();
    }
}
