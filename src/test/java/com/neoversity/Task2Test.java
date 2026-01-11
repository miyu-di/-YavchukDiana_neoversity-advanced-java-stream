package com.neoversity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

public class Task2Test {

  @Test
  void testTask2_basic() {
    List<String> input = List.of("apple", "banana", "cherry");
    List<String> result = Assignments.task2(input);
    assertEquals(List.of("CHERRY", "BANANA", "APPLE"), result);
  }

  @Test
  void testTask2_empty() {
    assertTrue(Assignments.task2(List.of()).isEmpty());
  }

}
