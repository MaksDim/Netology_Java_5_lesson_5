package ru.netology.cycle;

public class MultipService {

    public int sqrtCeil(int number) {
        for (int i = 0; i <= number; i++) {
            if (i * i >= number) {
                return i;
            }
        }
        return 0;
    }
}
