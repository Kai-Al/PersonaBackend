package com.example.servicio;

import com.example.modelo.Persona;
import com.example.repositorio.IPersona;
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
public class PersonaServicio implements IPersona {

    private IPersona IPersona;

    @Override
    public List<Persona> findAll() {
        return IPersona.findAll();
    }

    @Override
    public List<Persona> findAll(Sort sort) {
        return IPersona.findAll(sort);
    }

    @Override
    public Page<Persona> findAll(Pageable pageable) {
        return IPersona.findAll(pageable);
    }

    @Override
    public List<Persona> findAllById(Iterable<String> strings) {
        return IPersona.findAllById(strings);
    }

    @Override
    public long count() {
        return IPersona.count();
    }

    @Override
    public void deleteById(String s) {
        IPersona.deleteById(s);
    }

    @Override
    public void delete(Persona entity) {
        IPersona.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {
        IPersona.deleteAllById(strings);
    }

    @Override
    public void deleteAll(Iterable<? extends Persona> entities) {
        IPersona.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        IPersona.deleteAll();
    }

    @Override
    public <S extends Persona> S save(S entity) {
        return IPersona.save(entity);
    }

    @Override
    public <S extends Persona> List<S> saveAll(Iterable<S> entities) {
        return IPersona.saveAll(entities);
    }

    @Override
    public Optional<Persona> findById(String s) {
        return IPersona.findById(s);
    }

    @Override
    public boolean existsById(String s) {
        return IPersona.existsById(s);
    }

    @Override
    public void flush() {
        IPersona.flush();
    }

    @Override
    public <S extends Persona> S saveAndFlush(S entity) {
        return IPersona.saveAndFlush(entity);
    }

    @Override
    public <S extends Persona> List<S> saveAllAndFlush(Iterable<S> entities) {
        return IPersona.saveAllAndFlush(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Persona> entities) {
        IPersona.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {
        IPersona.deleteAllByIdInBatch(strings);
    }

    @Override
    public void deleteAllInBatch() {
        IPersona.deleteAllInBatch();
    }

    @Override
    public Persona getOne(String s) {
        return IPersona.getOne(s);
    }

    @Override
    public Persona getById(String s) {
        return IPersona.getById(s);
    }

    @Override
    public Persona getReferenceById(String s) {
        return IPersona.getReferenceById(s);
    }

    @Override
    public <S extends Persona> Optional<S> findOne(Example<S> example) {
        return IPersona.findOne(example);
    }

    @Override
    public <S extends Persona> List<S> findAll(Example<S> example) {
        return IPersona.findAll(example);
    }

    @Override
    public <S extends Persona> List<S> findAll(Example<S> example, Sort sort) {
        return IPersona.findAll(example, sort);
    }

    @Override
    public <S extends Persona> Page<S> findAll(Example<S> example, Pageable pageable) {
        return IPersona.findAll(example, pageable);
    }

    @Override
    public <S extends Persona> long count(Example<S> example) {
        return IPersona.count(example);
    }

    @Override
    public <S extends Persona> boolean exists(Example<S> example) {
        return IPersona.exists(example);
    }

    @Override
    public <S extends Persona, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return IPersona.findBy(example, queryFunction);
    }
}
