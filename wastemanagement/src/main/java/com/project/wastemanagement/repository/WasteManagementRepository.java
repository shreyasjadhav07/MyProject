package com.project.wastemanagement.repository;

import com.project.wastemanagement.entity.WasteManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WasteManagementRepository extends JpaRepository<WasteManagement,Long> {
}
