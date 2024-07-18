import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class lesson10 {
public static void main(String[] args) {
String[] words = {"памело", "мандарин", "грейпфрукт", "апельсин", "лимон", "памело", "мандарин", "грейпфрукт", "апельсин", "кокос"};

WordAnalyzer wordAnalyzer = new WordAnalyzer();
wordAnalyzer.analyzeWords(words);
}
}
class WordAnalyzer {

public void analyzeWords(String[] words) {
Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
System.out.println("Уникальный фрукт: " + uniqueWords);

Map<String, Integer> wordCount = new HashMap<>();
for (String word : words) {
if (wordCount.containsKey(word)) {
wordCount.put(word, wordCount.get(word) + 1);
} else {
wordCount.put(word, 1);
}
}

System.out.println("Количество слов:");
for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
System.out.println(entry.getKey() + ": " + entry.getValue());
}


// Задание 2: телефонный справочник
PhoneCatalog catalog = new PhoneCatalog();

catalog.add("Гладей", "+7(911)000-00-01");
catalog.add("Гладей", "+7(911)000-00-00");
catalog.add("Дрягин", "+7(921)111-11-11");
catalog.add("Васильева", "+7(981)222-22-22");
catalog.add("Васильев", "+7(981)222-22-23");
catalog.add("Волошина", "+7(962)333-33-33");
catalog.add("Волошин", "+7(962)333-33-34");
catalog.add("Биндарс", "+7(901)444-44-44");

System.out.println(catalog.get("Гладей"));
System.out.println(catalog.get("Васильева"));
System.out.println(catalog.get("Волошин"));
System.out.println(catalog.get("Биндарс"));
}
}