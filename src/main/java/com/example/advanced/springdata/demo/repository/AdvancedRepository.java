package com.example.advanced.springdata.demo.repository;

import java.util.List;

public interface AdvancedRepository<T, ID> {
    List<T> getByPass(String query);
}
