package aop.jpaboard.controller;

import aop.jpaboard.domain.Error;
import aop.jpaboard.service.ErrorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ErrorController {

    private final ErrorService errorService;

    @GetMapping("/errorList")
    public String list(Model model) {
        List<Error> errors = errorService.findErrors();
        model.addAttribute("errors", errors);
        return "/errorList";
    }
}
