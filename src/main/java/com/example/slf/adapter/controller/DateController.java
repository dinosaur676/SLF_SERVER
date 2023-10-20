package com.example.slf.adapter.controller;

import com.example.framework.dto.ResponseDto;
import com.example.framework.dto.SuccessRespDto;
import com.example.slf.dto.request.date.DeleteDateReqDto;
import com.example.slf.dto.request.date.UpdateDateReqDto;
import com.example.slf.service.virtual.IBuyService;
import com.example.slf.service.virtual.IChickenProductionService;
import com.example.slf.service.virtual.IChickenSellService;
import com.example.slf.service.virtual.IWorkService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/date")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DateController {

    IWorkService workService;
    IBuyService buyService;
    IChickenProductionService productionService;
    IChickenSellService sellService;

    public DateController(IWorkService workService, IBuyService buyService, IChickenProductionService productionService, IChickenSellService sellService) {
        this.workService = workService;
        this.buyService = buyService;
        this.productionService = productionService;
        this.sellService = sellService;
    }

    @PostMapping
    public ResponseDto updateDate(@RequestBody UpdateDateReqDto dto) {
        workService.updateDate(dto);
        buyService.updateDate(dto);
        productionService.updateDate(dto);
        sellService.updateDate(dto);

        return new SuccessRespDto();
    }

    @DeleteMapping
    public ResponseDto deleteDate(@RequestBody DeleteDateReqDto dto) {
        workService.deleteDate(dto);
        buyService.deleteDate(dto);
        productionService.deleteDate(dto);
        sellService.deleteDate(dto);

        return new SuccessRespDto();
    }
}
