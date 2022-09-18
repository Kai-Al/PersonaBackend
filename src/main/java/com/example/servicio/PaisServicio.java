package com.example.servicio;

import com.example.modelo.Pais;
import com.example.repositorio.IPais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class PaisServicio implements IPais {
    @Autowired
    private IPais IPais;

    @Override
    public List<Pais> findAll() {
        return IPais.findAll();
    }

    @Override
    public List<Pais> findAll(Sort sort) {
        return IPais.findAll(sort);
    }

    @Override
    public Page<Pais> findAll(Pageable pageable) {
        return IPais.findAll(pageable);
    }

    @Override
    public List<Pais> findAllById(Iterable<String> strings) {
        return IPais.findAllById(strings);
    }

    @Override
    public long count() {
        return IPais.count();
    }

    @Override
    public void deleteById(String s) {
        IPais.deleteById(s);
    }

    @Override
    public void delete(Pais entity) {
        IPais.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {
        IPais.deleteAllById(strings);
    }

    @Override
    public void deleteAll(Iterable<? extends Pais> entities) {
        IPais.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        IPais.deleteAll();
    }

    @Override
    public <S extends Pais> S save(S entity) {
        return IPais.save(entity);
    }

    @Override
    public <S extends Pais> List<S> saveAll(Iterable<S> entities) {
        return IPais.saveAll(entities);
    }

    @Override
    public Optional<Pais> findById(String s) {
        return IPais.findById(s);
    }

    @Override
    public boolean existsById(String s) {
        return IPais.existsById(s);
    }

    @Override
    public void flush() {
        IPais.flush();
    }

    @Override
    public <S extends Pais> S saveAndFlush(S entity) {
        return IPais.saveAndFlush(entity);
    }

    @Override
    public <S extends Pais> List<S> saveAllAndFlush(Iterable<S> entities) {
        return IPais.saveAllAndFlush(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Pais> entities) {
        IPais.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {
        IPais.deleteAllByIdInBatch(strings);
    }

    @Override
    public void deleteAllInBatch() {
        IPais.deleteAllInBatch();
    }

    @Override
    public Pais getOne(String s) {
        return  IPais.getOne(s);
    }

    @Override
    public Pais getById(String s) {
        return IPais.getById(s);
    }

    @Override
    public Pais getReferenceById(String s) {
        return IPais.getReferenceById(s);
    }

    @Override
    public <S extends Pais> Optional<S> findOne(Example<S> example) {
        return IPais.findOne(example);
    }

    @Override
    public <S extends Pais> List<S> findAll(Example<S> example) {
        return IPais.findAll(example);
    }

    @Override
    public <S extends Pais> List<S> findAll(Example<S> example, Sort sort) {
        return IPais.findAll(example, sort);
    }

    @Override
    public <S extends Pais> Page<S> findAll(Example<S> example, Pageable pageable) {
        return IPais.findAll(example, pageable);
    }

    @Override
    public <S extends Pais> long count(Example<S> example) {
        return IPais.count(example);
    }

    @Override
    public <S extends Pais> boolean exists(Example<S> example) {
        return IPais.exists(example);
    }

    @Override
    public <S extends Pais, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return  IPais.findBy(example, queryFunction);
    }
}
