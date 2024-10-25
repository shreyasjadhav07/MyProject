package com.project.wastemanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WasteManagement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,updatable = false,nullable = false)
    private String dustBinNO;

    private double weight;
    private String userName;
    private Long userNo;
}
