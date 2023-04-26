package ru.netology.sqr;
public class SQRService {
    public int numberSquareRoots(int minValues, int maxValues) {
        int numbers = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= minValues && square <= maxValues) {
               numbers++;
            }
        }

        return numbers;
    }
}
