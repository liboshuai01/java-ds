package cn.liboshuai.learning.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void testBinarySearchBasic_Found() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int expectedIndex = 2;
        int actualIndex = BinarySearch.binarySearchBasic(array, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchBasic_NotFound() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        int expectedIndex = -1;
        int actualIndex = BinarySearch.binarySearchBasic(array, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchBasic_EmptyArray() {
        int[] array = {};
        int target = 1;
        int expectedIndex = -1;
        int actualIndex = BinarySearch.binarySearchBasic(array, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchBasic_SingleElement_Found() {
        int[] array = {5};
        int target = 5;
        int expectedIndex = 0;
        int actualIndex = BinarySearch.binarySearchBasic(array, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchBasic_SingleElement_NotFound() {
        int[] array = {5};
        int target = 3;
        int expectedIndex = -1;
        int actualIndex = BinarySearch.binarySearchBasic(array, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchImproved_Found() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int expectedIndex = 2;
        int actualIndex = BinarySearch.binarySearchImproved(array, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchImproved_NotFound() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        int expectedIndex = -1;
        int actualIndex = BinarySearch.binarySearchImproved(array, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchImproved_EmptyArray() {
        int[] array = {};
        int target = 1;
        int expectedIndex = -1;
        int actualIndex = BinarySearch.binarySearchImproved(array, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchImproved_SingleElement_Found() {
        int[] array = {5};
        int target = 5;
        int expectedIndex = 0;
        int actualIndex = BinarySearch.binarySearchImproved(array, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchImproved_SingleElement_NotFound() {
        int[] array = {5};
        int target = 3;
        int expectedIndex = -1;
        int actualIndex = BinarySearch.binarySearchImproved(array, target);
        assertEquals(expectedIndex, actualIndex);
    }
}