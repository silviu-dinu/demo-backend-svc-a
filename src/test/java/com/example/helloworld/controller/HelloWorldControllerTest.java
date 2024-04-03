package com.example.helloworld.controller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldControllerTest {

    private final HelloWorldController helloWorldController = new HelloWorldController();

    @Test
    public void helloApiShouldReturnHelloWorld() {
        // When
        String result = helloWorldController.hello();

        // Then
        assertThat(result).isEqualTo("Hello World!");
    }

    @Test
    public void greetApiShouldReturnHelloWithName() {
        // Given
        String name = "John";

        // When
        String result = helloWorldController.greet(name);

        // Then
        assertThat(result).isEqualTo("Hello, " + name);
    }

    @Test
    public void greetApiShouldThrowExceptionIfNameContainsNumbersAndAlphabets() {
        // Given
        String name = "John21323";

        // When/Then
        assertThrows(IllegalArgumentException.class, () -> helloWorldController.greet(name));
    }

    @Test
    public void greetApiShouldThrowExceptionIfNameContainsOnlyNumbers() {
        // Given
        String name = "1323";

        // When/Then
        assertThrows(IllegalArgumentException.class, () -> helloWorldController.greet(name));
    }

}