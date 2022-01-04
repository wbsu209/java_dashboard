package aop.jpaboard.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Site {

    @Id @GeneratedValue
    @Column(name = "site_id")
    private Long id;

    private String name;

    @Embedded
    private BaseInfo baseInfo;

    @OneToMany(mappedBy = "site")
    private List<Error> errors = new ArrayList<>();


}
