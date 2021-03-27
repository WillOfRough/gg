package com.body.gg.controller;

import com.body.gg.service.MeasurementInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class MeasurementController {

    @Autowired
    MeasurementInfoService measurementInfoService;

    @GetMapping("/info/measurement/{measurement}")
    public Map<String, Object> MeasurementInfoSelect(HttpServletRequest request, @PathVariable String measurement) {
        Map<String, Object> result = measurementInfoService.measurementInfoSelect(measurement);
        return result;
    }
}
