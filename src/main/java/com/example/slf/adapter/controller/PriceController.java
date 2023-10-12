package com.example.slf.adapter.controller;

import com.example.framework.dto.ResponseDto;
import com.example.framework.dto.SuccessRespDto;
import com.example.slf.dto.request.price.PriceReqDto;
import com.example.slf.dto.response.price.PriceRespDto;
import com.example.slf.service.virtual.IPriceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/price")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PriceController {

    final IPriceService priceService;

    public PriceController(IPriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping
    public ResponseDto getInfo(@RequestParam String name, @RequestParam String createdOn) {
        PriceRespDto dto = priceService.select(name, createdOn);

        if(dto == null)
            return new SuccessRespDto("", "성공");

        return new SuccessRespDto(dto, "성공");
    }

    @PutMapping
    public ResponseDto insert(@RequestBody PriceReqDto priceReqDto) {
        priceService.insert(priceReqDto);

        return new SuccessRespDto("성공");
    }

    @PostMapping
    public ResponseDto update(@RequestBody PriceReqDto priceReqDto) {
        priceService.update(priceReqDto);

        return new SuccessRespDto("성공");
    }

}
