package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MatrixTest {

    @Test
    void shouldTransposeMatrix() {
        int[][] matrix1 = {{0, 1, 2}, {3, 4, 5}};
        int[][] matrix2 = {{0, 3}, {1, 4}, {2, 5}};
        assertThat(Matrix.transposeMatrix(matrix1)).isEqualTo(matrix2);
    }
}