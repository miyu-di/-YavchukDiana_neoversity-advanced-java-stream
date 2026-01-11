package com.neoversity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class Task5Test {

  @Test
  void testTask5_equalSize() {
    Stream<String> zipped = Assignments.task5(
        Stream.of("A", "B", "C"),
        Stream.of("1", "2", "3")
    );
    assertEquals(List.of("A", "1", "B", "2", "C", "3"), zipped.toList());
  }

  @Test
  void testTask5_firstShorter() {
    Stream<String> zipped = Assignments.task5(
        Stream.of("A"),
        Stream.of("1", "2", "3")
    );
    assertEquals(List.of("A", "1"), zipped.toList());
  }

  @Test
  void testTask5_secondShorter() {
    Stream<String> zipped = Assignments.task5(
        Stream.of("A", "B", "C"),
        Stream.of("1")
    );
    assertEquals(List.of("A", "1"), zipped.toList());
  }

  @Test
  void testTask5_bothEmpty() {
    Stream<Object> zipped = Assignments.task5(Stream.of(), Stream.of());
    assertTrue(zipped.toList().isEmpty());
  }

  @Test
  void testTask5_oneEmpty() {
    Stream<String> zipped = Assignments.task5(Stream.of("A", "B"), Stream.of());
    assertTrue(zipped.toList().isEmpty());
  }

}
