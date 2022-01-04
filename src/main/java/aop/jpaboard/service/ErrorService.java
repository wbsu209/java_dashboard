package aop.jpaboard.service;

import aop.jpaboard.domain.Error;
import aop.jpaboard.repository.ErrorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ErrorService {

    private final ErrorRepository errorRepository;

    public List<Error> findErrors() {
        return errorRepository.findAll();
    }
}
