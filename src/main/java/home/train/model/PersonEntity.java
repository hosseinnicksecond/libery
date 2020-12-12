package home.train.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class PersonEntity extends BaseEntity{

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Gender gender;
}
