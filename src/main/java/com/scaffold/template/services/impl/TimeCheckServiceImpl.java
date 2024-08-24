package com.scaffold.template.services.impl;

import com.scaffold.template.entities.TimeCheckEntity;
import com.scaffold.template.models.TimeCheck;
import com.scaffold.template.repositories.TimeCheckRepository;
import com.scaffold.template.services.TimeCheckService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TimeCheckServiceImpl implements TimeCheckService {
    @Autowired
    private TimeCheckRepository timeCheckRepository;

    @Qualifier("moddelMapper")
    @Autowired
    private ModelMapper mapper;

    @Override
    public TimeCheck createTimeCheck(TimeCheck timeCheck) {
        //TimeCheckEntity entity = mapper.map(timeCheck, TimeCheckEntity.class);
        //return mapper.map(timeCheckRepository.save(entity), TimeCheck.class);
        TimeCheckEntity entity = new TimeCheckEntity();
        entity.setDateTime(timeCheck.getDateTime());
        entity.setEmployeeId(timeCheck.getEmployeeId());
        entity.setOperation(timeCheck.getOperationType());
        timeCheckRepository.save(entity);
        return(timeCheck);
    }
}