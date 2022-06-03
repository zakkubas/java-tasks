package ru.mail.polis.homework.objects;


import java.util.Objects;

/**
 * Нужно найти символ, который встречается подряд в строке чаще всего, и указать количество повторений.
 * Если более одного символа с максимальным значением, то нужно вернуть тот символ,
 * который первый встречается в строчке
 * Если строка пустая или null, то вернуть null
 * Пример abbasbdlbdbfklsssbb -> (s, 3)
 */
public class RepeatingCharacters {

    public static Pair<Character, Integer> getMaxRepeatingCharacters(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        int charCount = 1;
        int max = 1;
        char maxChar = str.charAt(0); // изначально считаем, что первый символ в строке и есть максимально встречающийся
        for (int i = 1; i < str.length(); i++) { // проходим по всем символам строки
            if (str.charAt(i) == str.charAt(i - 1)) { // сравнием символ с предыдущем
                charCount++; // если символ тот же, то увеличиваем счетчик
                if (charCount > max) { // проверяем больше ли наш счетчик максимального значения
                    max = charCount; // если больше запоминаем как максимальное значение
                    maxChar = str.charAt(i); // и запоминаем символ с максимальным значением повторений
                }
            } else {
                charCount = 1; // если символы не одинаковые, то сбрасываем счетчик
            }
        }
        return new Pair<>(maxChar, max);
    }

    public static class Pair<T, V> {
        private final T first;
        private final V second;

        public Pair(T first, V second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public V getSecond() {
            return second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
        }

    }
}
