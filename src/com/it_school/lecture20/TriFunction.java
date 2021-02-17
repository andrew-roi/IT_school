package com.it_school.lecture20;

@FunctionalInterface
public interface TriFunction<T, V, U, R> {
    R apply(T t, V v, U u);
}
