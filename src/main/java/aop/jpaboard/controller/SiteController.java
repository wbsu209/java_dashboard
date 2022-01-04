package aop.jpaboard.controller;

import aop.jpaboard.domain.Site;
import aop.jpaboard.service.SiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class SiteController {

    private final SiteService siteService;

    @GetMapping(value = "/siteList")
    public String list(Model model) {
        List<Site> sites = siteService.findSites();
        model.addAttribute("sites", sites);
        return "/siteList";
    }

}
