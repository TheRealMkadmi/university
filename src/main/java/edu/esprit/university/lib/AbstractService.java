package edu.esprit.university.lib;

import lombok.SneakyThrows;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public abstract class AbstractService<T extends AbstractEntity<T>> {
    private final AbstractRepository<T> repository;
    public AbstractService(AbstractRepository<T> repository) {
        this.repository = repository;
    }
    public Page<T> getPage(Pageable pageable){
        return repository.findAll(pageable);
    }

    public List<T> getAll() {
        return repository.findAll();
    }

    @SneakyThrows
    public T get(Long id){
        return repository.findById(id).orElseThrow(
                Exception::new // todo: figure out the correct not found exception.
        );
    }
    @Transactional
    public T update(T updated){
        T model = get(updated.getId());
        model.update(updated);
        return repository.save(model);
    }

    @Transactional
    public T create(T newDomain){
        T model = newDomain.create();
        model.update(newDomain);
        return repository.save(model);
    }

    @Transactional
    public void delete(Long id){
        repository.deleteById(id);
    }
}