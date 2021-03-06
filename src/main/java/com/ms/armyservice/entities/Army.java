package com.ms.armyservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Army {
    @Id
    @GeneratedValue
    Long id;
    Long personId;
    int dragons;
    int knights;
    int soldiers;
    int ships;
}
