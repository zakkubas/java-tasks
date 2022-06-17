package ru.mail.polis.homework.analyzer;

public class TextNegativeEmotionsAnalyzer extends TextSpamAnalyzer  {

    private static final String[] NEGATIVE_EMOTIONS = {"=(", ":(", ":|"};

    public TextNegativeEmotionsAnalyzer() {
        super(NEGATIVE_EMOTIONS, FilterType.NEGATIVE_TEXT);
    }

}
