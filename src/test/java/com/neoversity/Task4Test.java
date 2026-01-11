package com.neoversity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class Task4Test {

  @Test
  void testTask4_generatorValues() {
    long a = 17L;
    long c = 43L;
    long m = 1000L;
    long seed = 1L;

    List<Long> expected = List.of(1L, 60L, 63L, 114L, 981L, 720L);
    List<Long> actual = Assignments.task4(a, c, m, seed)
        .limit(6)
        .toList();

    assertEquals(expected, actual);
  }

}
