package com.example.servicio;

import com.example.modelo.Departamento;
import com.example.repositorio.IDepartamento;
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
public class DepartamentoServicio implements IDepartamento {

    private IDepartamento IDepartamento;

    @Override
    public List<Departamento> findAll() {
        return IDepartamento.findAll();
    }

    @Override
    public List<Departamento> findAll(Sort sort) {
        return IDepartamento.findAll(sort);
    }

    @Override
    public Page<Departamento> findAll(Pageable pageable) {
        return IDepartamento.findAll(pageable);
    }

    @Override
    public List<Departamento> findAllById(Iterable<String> strings) {
        return IDepartamento.findAllById(strings);
    }

    @Override
    public long count() {
        return IDepartamento.count();
    }

    @Override
    public void deleteById(String s) {
        IDepartamento.deleteById(s);
    }

    @Override
    public void delete(Departamento entity) {
        IDepartamento.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {
        IDepartamento.deleteAllById(strings);
    }

    @Override
    public void deleteAll(Iterable<? extends Departamento> entities) {
        IDepartamento.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        IDepartamento.deleteAll();
    }

    @Override
    public <S extends Departamento> S save(S entity) {
        return IDepartamento.save(entity);
    }

    @Override
    public <S extends Departamento> List<S> saveAll(Iterable<S> entities) {
        return IDepartamento.saveAll(entities);
    }

    @Override
    public Optional<Departamento> findById(String s) {
        return IDepartamento.findById(s);
    }

    @Override
    public boolean existsById(String s) {
        return IDepartamento.existsById(s);
    }

    @Override
    public void flush() {
        IDepartamento.flush();
    }

    @Override
    public <S extends Departamento> S saveAndFlush(S entity) {
        return IDepartamento.saveAndFlush(entity);
    }

    @Override
    public <S extends Departamento> List<S> saveAllAndFlush(Iterable<S> entities) {
        return IDepartamento.saveAllAndFlush(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Departamento> entities) {
        IDepartamento.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {
        IDepartamento.deleteAllByIdInBatch(strings);
    }

    @Override
    public void deleteAllInBatch() {
        IDepartamento.deleteAllInBatch();
    }

    @Override
    public Departamento getOne(String s) {
        return IDepartamento.getOne(s);
    }

    @Override
    public Departamento getById(String s) {
        return IDepartamento.getById(s);
    }

    @Override
    public Departamento getReferenceById(String s) {
        return IDepartamento.getReferenceById(s);
    }

    @Override
    public <S extends Departamento> Optional<S> findOne(Example<S> example) {
        return IDepartamento.findOne(example);
    }

    @Override
    public <S extends Departamento> List<S> findAll(Example<S> example) {
        return IDepartamento.findAll(example);
    }

    @Override
    public <S extends Departamento> List<S> findAll(Example<S> example, Sort sort) {
        return IDepartamento.findAll(example, sort);
    }

    @Override
    public <S extends Departamento> Page<S> findAll(Example<S> example, Pageable pageable) {
        return IDepartamento.findAll(example, pageable);
    }

    @Override
    public <S extends Departamento> long count(Example<S> example) {
        return IDepartamento.count(example);
    }

    @Override
    public <S extends Departamento> boolean exists(Example<S> example) {
        return IDepartamento.exists(example);
    }

    @Override
    public <S extends Departamento, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return IDepartamento.findBy(example, queryFunction);
    }
}
