package aop.jpaboard.repository;

import aop.jpaboard.domain.Site;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class SiteRepository {

    private final EntityManager em;

    public void save(Site site) {
        em.persist(site);
    }

    public List<Site> findAll() {
        return em.createQuery("select m from Site m", Site.class)
                .getResultList();
    }

    public List<Site> findbyName(String name) {
        return em.createQuery("select m form Site m where m.name = :name", Site.class)
                .getResultList();
    }
}
