package com.scaffold.template.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "TimeCheck")
public class TimeCheckEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "timeId", nullable = false)
    private Long id;

    @Column(name = "employeeId", nullable = false)
    private Long employeeId;

    @Column(name="operationDate",nullable = false)
    private LocalDateTime dateTime;

    @Column(name="operationType", nullable = false)
    private char operation;
}
