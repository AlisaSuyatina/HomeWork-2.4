package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {

    @Test

    public void testWithFewAnsweres() {
        SQRService service = new SQRService();

        int actual = service.numberSquareRoots(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testWithZeroAnswer() {
        SQRService service = new SQRService();

        int actual = service.numberSquareRoots(10, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWithOneAnswer() {
        SQRService service = new SQRService();

        int actual = service.numberSquareRoots(0, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}
