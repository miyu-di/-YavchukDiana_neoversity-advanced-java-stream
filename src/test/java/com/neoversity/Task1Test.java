package com.neoversity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class Task1Test {

  @Test
  void testTask1_emptyList() {
    assertEquals("", Assignments.task1(List.of()));
  }

  @Test
  void testTask1_oneElement() {
    assertEquals("", Assignments.task1(List.of("OnlyOne")));
  }

  @Test
  void testTask1_twoElements() {
    assertEquals("1. Two", Assignments.task1(List.of("One", "Two")));
  }

  @Test
  void testTask1_spacingFormat() {
    List<String> names = List.of("Anna", "Bella", "Cara", "Dora");
    assertEquals("1. Bella, 3. Dora", Assignments.task1(names));
  }

}
