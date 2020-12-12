package home.train.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book extends NameEntity{

    private int pages;
    private Arthur arthur;
    private Integer SNumber;
    private Member Owner;
    private Set<Member> ownerHistory;

    private BookType bookType;


}
