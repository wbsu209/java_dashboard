package aop.jpaboard.controller;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class ErrorForm {

    private String site;

    private String errorName;

    private LocalDateTime occurTime;
}
