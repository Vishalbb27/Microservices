package com.bank.accounts.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@MappedSuperclass
public class BaseEntity {
    LocalDate created_at;
    String created_by;
    LocalDate updated_at;
    String updated_by;
}
