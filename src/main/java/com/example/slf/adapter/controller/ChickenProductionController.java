package com.example.slf.adapter.controller;

import com.example.framework.dto.ResponseDto;
import com.example.framework.dto.SuccessRespDto;
import com.example.slf.dto.request.chicken.production.ChickenProductionDeleteDto;
import com.example.slf.dto.request.chicken.production.ChickenProductionInsertDto;
import com.example.slf.dto.request.chicken.production.ChickenProductionUpdateDto;
import com.example.slf.dto.response.chicken.production.ChickenProductionRespDto;
import com.example.slf.service.virtual.IChickenProductionService;
import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/chicken-production")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ChickenProductionController {
    IChickenProductionService productionService;

    public ChickenProductionController(IChickenProductionService productionService) {
        this.productionService = productionService;
    }

    @GetMapping
    public ResponseDto getDatas(@RequestParam(required = false) String parts, @RequestParam String createdOn) {
        List<ChickenProductionRespDto> chickenProductionRespDtoList;

        if(parts == null || parts.equals("")) {
            chickenProductionRespDtoList = productionService.selectJustDate(createdOn);
        }
        else {
            chickenProductionRespDtoList = productionService.selectAll(parts, createdOn);
        }

        if(chickenProductionRespDtoList == null)
            return new SuccessRespDto();

        return new SuccessRespDto(chickenProductionRespDtoList);
    }

    @GetMapping("/id")
    public ResponseDto getDataById(@RequestParam long id) {
        ChickenProductionRespDto chickenProductionRespDto = productionService.selectById(id);

        if(chickenProductionRespDto == null)
             return new SuccessRespDto();

        return new SuccessRespDto(chickenProductionRespDto);
    }

    @PutMapping
    public ResponseDto insertData(@RequestBody ChickenProductionInsertDto insertDto) {
        productionService.insert(insertDto);

        return new SuccessRespDto();
    }

    @PostMapping
    public ResponseDto updateData(@RequestBody ChickenProductionUpdateDto updateDto) {
        productionService.update(updateDto);

        return new SuccessRespDto();
    }

    @DeleteMapping
    public ResponseDto deleteData(@RequestBody ChickenProductionDeleteDto deleteDto) {
        productionService.delete(deleteDto);

        return new SuccessRespDto();
    }
}
