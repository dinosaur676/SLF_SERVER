package com.example.slf.adapter.controller;

import com.example.framework.dto.ResponseDto;
import com.example.framework.dto.SuccessRespDto;
import com.example.slf.dto.request.buy.BuyDeleteReqDto;
import com.example.slf.dto.request.buy.BuyInsertReqDto;
import com.example.slf.dto.request.buy.BuyUpdateReqDto;
import com.example.slf.dto.request.work.WorkInsertReqDto;
import com.example.slf.dto.response.buy.BuyRespDto;
import com.example.slf.service.virtual.IBuyService;
import com.example.slf.service.virtual.IWorkService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/buy")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BuyController {
    IBuyService buyService;
    IWorkService workService;

    public BuyController(IBuyService buyService, IWorkService workService) {
        this.buyService = buyService;
        this.workService = workService;
    }

    @GetMapping
    public ResponseDto getBuyDatas(@RequestParam String createdOn) {
        List<BuyRespDto> buyRespDtoList = buyService.select(createdOn);

        if(buyRespDtoList == null)
        {
            return new SuccessRespDto(new ArrayList<>());
        }

        return new SuccessRespDto(buyRespDtoList);
    }

    @GetMapping("/id")
    public ResponseDto getBuyDataById(@RequestParam long id) {
        BuyRespDto buyRespDto = buyService.selectById(id);

        if(buyRespDto == null)
            return new SuccessRespDto();

        return new SuccessRespDto(buyRespDto);
    }

    @PutMapping
    public ResponseDto insertData(@RequestBody BuyInsertReqDto buyInsertReqDto) {
        buyService.insert(buyInsertReqDto);

        return new SuccessRespDto();
    }

    @PostMapping
    public ResponseDto updateData(@RequestBody BuyUpdateReqDto buyUpdateReqDto) {
        buyService.update(buyUpdateReqDto);

        return new SuccessRespDto();
    }

    @DeleteMapping
    public ResponseDto deleteData(@RequestBody BuyDeleteReqDto buyDeleteReqDto) {
        buyService.delete(buyDeleteReqDto);

        return new SuccessRespDto();
    }
}
