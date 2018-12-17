package com.github.ledoyen.scratch;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class HelloTest {

    @Test
    void hello_test() {
        Hello hello = new Hello();

        assertThat(hello.hello()).contains("world");
    }
}