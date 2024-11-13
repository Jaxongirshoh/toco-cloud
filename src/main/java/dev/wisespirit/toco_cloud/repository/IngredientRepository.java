package dev.wisespirit.toco_cloud.repository;

import dev.wisespirit.toco_cloud.domains.Ingredient;

import java.util.Optional;

@Deprecated
public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
    void delete(String id);
}
