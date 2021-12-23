package kg.itmegaschool.crmitmega.model.dto;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MentorDto {
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    LocalDate dob;
    BigDecimal salary;
}
