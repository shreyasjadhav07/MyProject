package com.project.wastemanagement.service.transformer;

import com.project.wastemanagement.dto.WasteManagementDto;
import com.project.wastemanagement.entity.WasteManagement;
import org.springframework.stereotype.Component;

@Component
public class DtoToEntity {
    public WasteManagement transformWasteManagementDto2Entity(WasteManagementDto wasteManagementDto){
      WasteManagement wasteManagement=new WasteManagement();
        wasteManagement.setId(wasteManagementDto.getId());
        wasteManagement.setDustBinNO(wasteManagementDto.getDustBinNo());
        wasteManagement.setUserName(wasteManagementDto.getUserName());
        wasteManagement.setUserNo(wasteManagementDto.getUserNumber());
        wasteManagement.setWeight(wasteManagementDto.getWeight());

        return wasteManagement;
    }
}
