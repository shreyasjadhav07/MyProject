package com.project.wastemanagement.dao;

import com.project.wastemanagement.entity.WasteManagement;
import com.project.wastemanagement.repository.WasteManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WasteManagementDao {
    @Autowired
    private WasteManagementRepository wasteManagementRepository;
    public WasteManagement createDetails(WasteManagement wasteManagement) {
        return wasteManagementRepository.save(wasteManagement);
    }
}
