package MrDuyExcercises;

import com.swabunga.spell.engine.SpellDictionary;
import com.swabunga.spell.engine.SpellDictionaryHashMap;
import com.swabunga.spell.event.*;

import java.io.File;
import java.io.IOException;

public class JazzySpellChecker implements SpellCheckListener {
    private SpellChecker spellChecker;

    private SpellDictionary dictionary;

    public JazzySpellChecker() {
        File dict = new File("src/main/java/dictionary/dictionary.txt");
        try {
            dictionary = new SpellDictionaryHashMap(dict);
            initialize();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initialize() {
        spellChecker = new SpellChecker(dictionary);
        spellChecker.addSpellCheckListener(this);
    }

    @Override
    public void spellingError(SpellCheckEvent spellCheckEvent) {
    }

    public int checkSpelling(String line) {
        return spellChecker.checkSpelling(new StringWordTokenizer(line, new TeXWordFinder()));
    }
}
