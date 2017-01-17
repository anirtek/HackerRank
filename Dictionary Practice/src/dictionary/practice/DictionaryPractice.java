package dictionary.practice;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args) {
        // English to Marathi Dictionary
        Map<String, String> englSpanDictionary = new HashMap<String, String>(); 
        englSpanDictionary.put("Monday", "Somvar");
        englSpanDictionary.put("Tuesday", "Mangalvar");
        englSpanDictionary.put("Wednesday", "Budhvar");
        englSpanDictionary.put("Thursday", "Guruvar");
        englSpanDictionary.put("Friday", "Shukravar");
        englSpanDictionary.put("Saturday", "Shanivar");
        englSpanDictionary.put("Sunday", "Ravivar");
        //  Retrieve things from dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.keySet());
        System.out.println(englSpanDictionary.values());
        System.out.println(englSpanDictionary.size());

    }

}
