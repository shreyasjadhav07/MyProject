package com.project.wastemanagement.service;

import com.project.wastemanagement.dao.WasteManagementDao;
import com.project.wastemanagement.dto.WasteManagementDto;
import com.project.wastemanagement.entity.WasteManagement;
import com.project.wastemanagement.service.transformer.DtoToEntity;
import com.project.wastemanagement.service.transformer.EntityToDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WasteManagementService {
    @Autowired
    private WasteManagementDao wasteManagementDao;
    @Autowired
    private DtoToEntity dtoToEntity;
    @Autowired
    private EntityToDto entityToDto;
    public WasteManagementDto createDetails(WasteManagementDto wasteManagementDto) {
        WasteManagement  wasteManagement=new WasteManagement();
        wasteManagement=wasteManagementDao.createDetails(dtoToEntity.transformWasteManagementDto2Entity(wasteManagementDto));
        return entityToDto.transformWasteManagementEntityToDto(wasteManagement);
    }
}
