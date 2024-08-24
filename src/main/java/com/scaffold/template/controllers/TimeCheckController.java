package com.scaffold.template.controllers;

import com.scaffold.template.dtos.ReceivedDto;
import com.scaffold.template.models.TimeCheck;
import com.scaffold.template.services.TimeCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/timeCheck")
public class TimeCheckController {
    @Autowired
    private TimeCheckService timeCheckService;

    @PostMapping("")
    public ResponseEntity<TimeCheck> createTime (@RequestBody ReceivedDto dto){
        if(dto.getUnprocessedData().isEmpty()){
            return ResponseEntity.badRequest().body(new TimeCheck());
        }
        String auxString = dto.getUnprocessedData();
        String numToConvert = auxString.substring(0,2);
        String yearToConvert = auxString.substring(3,7);
        String monthToConvert = auxString.substring(8,10);
        String dayToConvert = auxString.substring(11,13);
        String hourToConvert = auxString.substring(14,16);
        String minuteToConvert = auxString.substring(17,19);
        String secondToConvert = auxString.substring(20,22);
        char operation = auxString.charAt(auxString.length()-1);

        int convertedId = Integer.parseInt(numToConvert);
        int convertedYear = Integer.parseInt(yearToConvert);
        int convertedMonth = Integer.parseInt(monthToConvert);
        int convertedDay = Integer.parseInt(dayToConvert);
        int convertedHour = Integer.parseInt(hourToConvert);
        int convertedMinute = Integer.parseInt(minuteToConvert);
        int convertedSecond = Integer.parseInt(secondToConvert);

        LocalDateTime time = LocalDateTime.of(convertedYear, convertedMonth, convertedDay, convertedHour, convertedMinute, convertedSecond);
        return ResponseEntity.ok(timeCheckService.createTimeCheck(new TimeCheck((long) convertedId,time,operation)));
    }
}
