package edu.poly.shopping.service;

import edu.poly.shopping.entity.Slides;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface SlideService {

    <S extends Slides> List<S> findAll(Example<S> example);

    <S extends Slides> List<S> findAll(Example<S> example, Sort sort);

    <S extends Slides> List<S> saveAll(Iterable<S> entities);

    List<Slides> findAll();

    List<Slides> findAllById(Iterable<Long> longs);

    <S extends Slides> S save(S entity);

    Optional<Slides> findById(Long aLong);

    boolean existsById(Long aLong);

    long count();

    void deleteById(Long aLong);

    void delete(Slides entity);

    List<Slides> findAll(Sort sort);

    Page<Slides> findAll(Pageable pageable);
}
