import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    public static Map<String, List<String>> map = new HashMap<>();
    public static void add(String phoneNum, String name) {
        if (map.containsKey(name)) {
            List<String> phoneNumbers = map.get(name);
            phoneNumbers.add(phoneNum);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNum);
            map.put(name, phoneNumbers);
        }
    }
    public static String getPhoneNum(String phoneNum) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> phoneNumbers = entry.getValue();
            if (phoneNumbers.contains(phoneNum)) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(" : ");
                stringBuilder.append(entry.getValue());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
    public static String getByName(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        if (map.containsKey(name)) {
            List<String> phoneNumbers = map.get(name);
            for (String phoneNumber : phoneNumbers) {
                stringBuilder.append(phoneNumber);
                stringBuilder.append(" : ");
                stringBuilder.append(name);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public static String getAll() {
        StringBuilder stringBuilder = new StringBuilder();
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(map.entrySet());
        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
        for (Map.Entry<String, List<String>> entry : entries) {
            List<String> phoneNumbers = entry.getValue();
            stringBuilder.append(entry.getKey());
            stringBuilder.append(" : ");
            stringBuilder.append(phoneNumbers);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}

