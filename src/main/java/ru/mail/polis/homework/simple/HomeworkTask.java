package ru.mail.polis.homework.simple;

import java.util.function.ToDoubleFunction;

public class HomeworkTask {

    /**
     * Нужно численно посчитать интеграл от a до b с шагом delta от функции function
     * Для того, что бы получить значение по Y для точки X, надо просто написать function.applyAsDouble(t)
     * Считаем, что функция определена на всем пространстве от a до b
     */
    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        return 0;
    }

    /**
     * Вывести номер максимальной цифры. Счет начинается слева направо,
     * выводим номер первой максимальной цифры (если их несколько)
     */
    public static byte maxNumber(long a) {
        a = Math.abs(a);
        int digits = (byte) String.valueOf(a).length() + 1;  // cчитаем колличество цифр в числе
        int last_digit = (int) (a % 10);  // последняя цифра
        int max_digit = last_digit;  // принимаем последнию цифру за миксимвльную
        int i = 1; // порядковый номер цифры
        int count_max_digit = 1; // изначально считаем справа налево, при виводе результата сконвертируем
        long n = a / 10;  // отбрасываем последнию цифру
        while (n > 0) {
            i++;
            last_digit = (int) (n % 10);
            if (last_digit >= max_digit) { // сравнием цифры с записанным значением
                max_digit = last_digit;  // при необходимости перезаписываем значение
                count_max_digit = i;
            }
            n = n / 10;
        }
        return (byte) ((byte) digits - count_max_digit);
    }


    /**
     * Даны две точки в пространстве (x1, y1) и (x2, y2). Вам нужно найти Y координату третьей точки (x3, y3),
     * которая находится на той же прямой что и первые две.
     */
    public static double lineFunction(int x1, int y1, int x2, int y2, int x3) {
        double y3;
        y3 = (double) (x2 * y1 - x3 * y1 - x1 * y2 + x3 * y2) / (x2 - x1);
        return y3;
    }

    /**
     * Даны 4 точки в пространстве A(x1, y1), B(x2, y2), C(x3, y3), D(x4, y4). Найдите площадь выпуклого
     * четырехуголька ABCD.
     * Это дополнительное задание, необязательное для выполнения
     */
    public static double square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        return 0;
    }

}
