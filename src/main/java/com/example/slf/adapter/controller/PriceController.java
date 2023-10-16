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
    public ResponseDto getPrice(@RequestParam String name, @RequestParam String createdOn) {
        PriceRespDto dto = priceService.select(name, createdOn);

        if(dto == null)
            return new SuccessRespDto("", "성공");

        return new SuccessRespDto(dto, "성공");
    }


    @PostMapping
    public ResponseDto updatePrice(@RequestBody PriceReqDto priceReqDto) {

        PriceRespDto dto = priceService.select(priceReqDto.name(), priceReqDto.createdOn());

        if(dto == null)
            priceService.insert(priceReqDto);
        else
            priceService.update(priceReqDto);

        return new SuccessRespDto("성공");
    }

}
