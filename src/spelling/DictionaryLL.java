package spelling;

import java.util.LinkedList;
import java.util.Locale;

/**
 * A class that implements the Dictionary interface using a LinkedList
 *
 */
public class DictionaryLL implements Dictionary 
{

	private LinkedList<String> dict;
	
    public DictionaryLL() {
        this.dict = new LinkedList<>();
    }


    /** Add this word to the dictionary.  Convert it to lowercase first
     * for the assignment requirements.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
    public boolean addWord(String word) {
    	word = word.toLowerCase();
    	if (!dict.contains(word)) {
            this.dict.add(word);
            return true;
        }
        return false;
    }


    /** Return the number of words in the dictionary */
    public int size()
    {
        return this.dict.size();
    }

    /** Is this a word according to this dictionary? */
    public boolean isWord(String s) {
        //TODO: Implement this method
        return this.dict.contains(s.toLowerCase());
    }

    
}
