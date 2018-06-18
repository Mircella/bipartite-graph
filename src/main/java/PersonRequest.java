import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class PersonRequest {
    String personEmail;
    List<String> areaCodes;

//    public PersonRequest(String personEmail, List<String> areaCodes) {
//        this.personEmail = personEmail;
//        this.areaCodes = areaCodes;
//    }
}
