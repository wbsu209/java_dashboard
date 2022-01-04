package aop.jpaboard.repository;

import aop.jpaboard.domain.Error;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ErrorRepository {

    private final EntityManager em;

    public void save(Error error) {em.persist(error);}

    public List<Error> findAll() {
        return em.createQuery("select e from Error e", Error.class)
                .getResultList();
    }

}
