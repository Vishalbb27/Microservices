package com.bank.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data

public class AccountsDto {
    @NotEmpty(message = "Account number cannot be null")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Account number must be 10 digits")
    int accountsNumber;
    @NotEmpty(message = "Account Type cannot be null or empty")
    String accountType;
    @NotEmpty(message = "Branch Address cannot be null or empty")
    String branchAddress;
}
