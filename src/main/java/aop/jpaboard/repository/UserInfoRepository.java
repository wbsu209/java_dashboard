package aop.jpaboard.repository;

import aop.jpaboard.domain.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserInfoRepository {

    private final EntityManager em;

    public void save(UserInfo userInfo) {
        em.persist(userInfo);
    }

    public List <UserInfo> findAll() {
        return em.createQuery("select m from user_info m", UserInfo.class)
                .getResultList();
    }
}
