package com.neoversity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Task3Test {

  @Test
  void testTask3_flattenAndSort() {
    String[] input = {"1, 2, 0", "4, 5"};
    assertEquals("0, 1, 2, 4, 5", Assignments.task3(input));
  }

  @Test
  void testTask3_emptyArray() {
    String[] input = {};
    assertEquals("", Assignments.task3(input));
  }

}
