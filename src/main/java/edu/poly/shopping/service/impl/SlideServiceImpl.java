package edu.poly.shopping.service.impl;

import edu.poly.shopping.entity.Slides;
import edu.poly.shopping.repository.SlideRepository;
import edu.poly.shopping.service.SlideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SlideServiceImpl implements SlideService {
    @Autowired
    SlideRepository slideRepository;

    @Override
    public <S extends Slides> List<S> findAll(Example<S> example) {
        return slideRepository.findAll(example);
    }

    @Override
    public <S extends Slides> List<S> findAll(Example<S> example, Sort sort) {
        return slideRepository.findAll(example, sort);
    }

    @Override
    public <S extends Slides> List<S> saveAll(Iterable<S> entities) {
        return slideRepository.saveAll(entities);
    }

    @Override
    public List<Slides> findAll() {
        return slideRepository.findAll();
    }

    @Override
    public List<Slides> findAllById(Iterable<Long> longs) {
        return slideRepository.findAllById(longs);
    }

    @Override
    public <S extends Slides> S save(S entity) {
        return slideRepository.save(entity);
    }

    @Override
    public Optional<Slides> findById(Long aLong) {
        return slideRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return slideRepository.existsById(aLong);
    }

    @Override
    public long count() {
        return slideRepository.count();
    }

    @Override
    public void deleteById(Long aLong) {
        slideRepository.deleteById(aLong);
    }

    @Override
    public void delete(Slides entity) {
        slideRepository.delete(entity);
    }

    @Override
    public List<Slides> findAll(Sort sort) {
        return slideRepository.findAll(sort);
    }

    @Override
    public Page<Slides> findAll(Pageable pageable) {
        return slideRepository.findAll(pageable);
    }
}
