package com.project.wastemanagement.service.transformer;

import com.project.wastemanagement.dto.WasteManagementDto;
import com.project.wastemanagement.entity.WasteManagement;
import org.springframework.stereotype.Component;

@Component
public class EntityToDto {
    public WasteManagementDto transformWasteManagementEntityToDto(WasteManagement wasteManagement){
        WasteManagementDto wasteManagementDto=new WasteManagementDto();
        wasteManagementDto.setId(wasteManagement.getId());
        wasteManagementDto.setDustBinNo(wasteManagement.getDustBinNO());
        wasteManagementDto.setUserName(wasteManagement.getUserName());
        wasteManagementDto.setUserNumber(wasteManagement.getUserNo());
        wasteManagementDto.setWeight(wasteManagement.getWeight());
        return wasteManagementDto;
    }
}
