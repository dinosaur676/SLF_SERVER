package com.example.slf.adapter.controller;


import com.example.framework.dto.ResponseDto;
import com.example.framework.dto.SuccessRespDto;
import com.example.slf.dto.request.chicken.production.ChickenProductionDeleteDto;
import com.example.slf.dto.request.chicken.production.ChickenProductionInsertDto;
import com.example.slf.dto.request.chicken.production.ChickenProductionUpdateDto;
import com.example.slf.dto.request.chicken.sell.ChickenSellDeleteReqDto;
import com.example.slf.dto.request.chicken.sell.ChickenSellInsertReqDto;
import com.example.slf.dto.request.chicken.sell.ChickenSellUpdateReqDto;
import com.example.slf.dto.response.chicken.production.ChickenProductionRespDto;
import com.example.slf.dto.response.chicken.sell.ChickenSellRespDto;
import com.example.slf.service.virtual.IChickenProductionService;
import com.example.slf.service.virtual.IChickenSellService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chicken-sell")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ChickenSellController {
    IChickenSellService chickenSellService;

    public ChickenSellController(IChickenSellService chickenSellService) {
        this.chickenSellService = chickenSellService;
    }

    @GetMapping
    public ResponseDto getDatas(@RequestParam String parts, @RequestParam String createdOn) {
        List<ChickenSellRespDto> chickenSellRespDtos = chickenSellService.select(parts, createdOn);

        if(chickenSellRespDtos == null)
            return new SuccessRespDto();

        return new SuccessRespDto(chickenSellRespDtos);
    }

    @GetMapping("/prod-id")
    public ResponseDto getDatasByProdId(@RequestParam long prodId) {
        List<ChickenSellRespDto> chickenSellRespDtos = chickenSellService.selectByProdId(prodId);

        if(chickenSellRespDtos == null)
            return new SuccessRespDto();

        return new SuccessRespDto(chickenSellRespDtos);
    }

    @PutMapping
    public ResponseDto insertData(@RequestBody ChickenSellInsertReqDto insertDto) {
        chickenSellService.insert(insertDto);

        return new SuccessRespDto();
    }

    @PostMapping
    public ResponseDto updateData(@RequestBody ChickenSellUpdateReqDto updateDto) {
        chickenSellService.update(updateDto);

        return new SuccessRespDto();
    }

    @DeleteMapping
    public ResponseDto deleteData(@RequestBody ChickenSellDeleteReqDto deleteDto) {
        chickenSellService.delete(deleteDto);

        return new SuccessRespDto();
    }
}
