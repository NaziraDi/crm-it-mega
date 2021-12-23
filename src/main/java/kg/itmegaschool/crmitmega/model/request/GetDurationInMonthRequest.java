package kg.itmegaschool.crmitmega.model.request;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class GetDurationInMonthRequest {
    private Integer from;
    private Integer to;

}
