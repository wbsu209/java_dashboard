package aop.jpaboard.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class LoginForm {
    @NotEmpty(message = "작성해주세요.")
    private String email;
    private String password;
}
