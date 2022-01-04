package aop.jpaboard.domain;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "errors")
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Error {

    @Id @GeneratedValue
    @Column(name = "error_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "site_id")
    private Site site;

    private String name;

    private LocalDateTime time; //발생시간

    private LocalDate date;

}
