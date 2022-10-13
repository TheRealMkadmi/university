package edu.esprit.university.lib;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractRepository<T extends AbstractEntity<T>> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {
}
