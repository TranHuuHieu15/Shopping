package edu.poly.shopping.repository;

import edu.poly.shopping.entity.Slides;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlideRepository extends JpaRepository<Slides, Long> {
}
