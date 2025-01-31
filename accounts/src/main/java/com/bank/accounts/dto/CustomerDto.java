package com.bank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {
    @Schema(
            description = "Name of the customer",
            example = "Jacks"
    )
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5,max = 30,message = "The length of the customer name should be between 5 and 30")
    String name;
    @NotEmpty(message = "Email address cannot be null or empty")
    @Email(message = "Email address should be a valid value")
    String email;
    @NotEmpty(message = "Mobile number cannot be null")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    String mobileNumber;
    private AccountsDto accountsDto;
}
