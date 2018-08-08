package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        int num = 1;
        int[][] input1 = new int[][]{
                new int[]{3, 2, 4},
        };
        int[] input2 = new int[]{
                6,
        };
        int[][] solution = new int[][]{
                new int[]{1,2},
        };
        for(int i=0;i<num;i++){
            assertArrayEquals(new TwoSum().twoSum(input1[i], input2[i]), solution[i]);
        }
    }
}