package ru.mail.polis.homework.analyzer;

import java.util.Arrays;

public class TextSpamAnalyzer implements TextAnalyzer {

    private final String[] spamWords;
    private final FilterType filterType;

    public TextSpamAnalyzer(String[] spamWords) {
        this(spamWords, FilterType.SPAM);
    }

    protected TextSpamAnalyzer(String[] spamWords, FilterType filterType) {
        this.spamWords = Arrays.copyOf(spamWords, spamWords.length );
        this.filterType = filterType;
    }

    @Override
    public boolean analyze(String text) {
        for (String word : spamWords) {
             if (text.contains(word)) {
                 return  true;
             }
        }
        return false;
    }

    @Override
    public FilterType getFilterType() {
        return filterType;
    }
}
