package com.example.slf.adapter.controller;

import com.example.framework.dto.ResponseDto;
import com.example.framework.dto.SuccessRespDto;
import com.example.slf.dto.PriceDto;
import com.example.slf.dto.request.price.PriceReqDto;
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
    public ResponseDto getInfo(@RequestParam String createOn) {
        PriceDto dto = priceService.select(createOn);

        if(dto == null)
            dto = new PriceDto(0, 0, 0, "");

        return new SuccessRespDto(dto, "성공");
    }

    @PutMapping
    public ResponseDto insert(@RequestBody PriceReqDto priceReqDto) {
        PriceDto priceDto = priceService.select(priceReqDto.data().getCreateOn());

        if(priceDto != null)
            priceService.update(priceReqDto.data());
        else
            priceService.insert(priceReqDto.data());

        return new SuccessRespDto("성공");
    }

}
