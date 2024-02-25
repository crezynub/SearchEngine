package searchengine.utils;

import searchengine.model.Lemma;

import java.util.Comparator;

public class LemmaComparator implements Comparator<Lemma> {

    @Override
    public int compare(Lemma l1, Lemma l2) {
        if (l1.getFrequency() < l2.getFrequency())
        {
            return -1;
        }
        if (l1.getFrequency()> l2.getFrequency()){
            return 1;
        }
        return 0;
    }
}
