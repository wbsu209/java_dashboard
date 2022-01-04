package aop.jpaboard.service;


import aop.jpaboard.domain.Site;
import aop.jpaboard.repository.SiteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class SiteService {

    private final SiteRepository siteRepository;

    public List<Site> findSites() {
        return siteRepository.findAll();
    }
}
