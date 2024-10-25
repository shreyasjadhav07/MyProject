package com.project.wastemanagement.api;

import com.project.wastemanagement.dto.WasteManagementDto;
import com.project.wastemanagement.service.WasteManagementService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Api(tags = "WasteManagement")
public class WasteManagementController implements WasteManagementApi{
    @Autowired
    private WasteManagementService wasteManagementService;
    @Override
    public ResponseEntity<List<WasteManagementDto>> getAllDetails() throws Exception {
        return WasteManagementApi.super.getAllDetails();
    }

    @Override
    public ResponseEntity<WasteManagementDto> createDetails(WasteManagementDto wasteManagementDto) throws Exception {
        return new ResponseEntity<>(wasteManagementService.createDetails(wasteManagementDto), HttpStatus.CREATED);  }
}
