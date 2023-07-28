package com.example;

import io.micronaut.data.model.Sort;
import io.micronaut.data.repository.PageableRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
@ExecuteOn(TaskExecutors.IO)
@Controller("/table1")
public class Controller1 {

    @Inject
    Table1Repository repository;



    @Get("/")
    public Iterable<Table1Record> findAll() {
        return repository.findAll(getSortOrder());
    }

    private Sort getSortOrder() {
        List<Sort.Order> orders = new ArrayList<>();
        orders.add(new Sort.Order( "key1"));
        orders.add(new Sort.Order( "key2"));
        return Sort.of(orders);
    }

}
