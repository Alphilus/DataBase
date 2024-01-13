package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankingDTO {
    private String email;
    private String phone;
    private String accountNum;
    private String nameBank;
}
