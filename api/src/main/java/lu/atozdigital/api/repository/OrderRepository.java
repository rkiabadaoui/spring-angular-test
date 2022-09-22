package main.java.lu.atozdigital.api.repository;

import lu.atozdigital.api.model.Article;
import lu.atozdigital.api.api.model.Ordre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Ordre,Long> {
}
