package kg.itmegaschool.crmitmega.model.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateMentorRequest {
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    LocalDate dob;
    BigDecimal salary;
}
