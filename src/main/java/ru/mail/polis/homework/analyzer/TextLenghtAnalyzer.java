package ru.mail.polis.homework.analyzer;

public class TextLenghtAnalyzer implements TextAnalyzer {

    private final long maxLenght;

    public TextLenghtAnalyzer(long maxLenght) {
        this.maxLenght = maxLenght;
    }

    @Override
    public boolean analyze(String text) {
        return text.length() > maxLenght;
    }

    @Override
    public FilterType getFilterType() {
        return FilterType.TOO_LONG;
    }
}
