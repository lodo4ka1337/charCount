package com.lodo4ka.charCount.services.impl;

import com.lodo4ka.charCount.services.CharNumberService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CharNumberServiceImpl implements CharNumberService {
    @Override
    public String getCharNumber(String inputLine) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < inputLine.length(); i++) {
            char c = inputLine.charAt(i);
            if (charMap.containsKey(c)) charMap.put(c, charMap.get(c) + 1);
            else charMap.put(c, 1);
        }

        Map<Character, Integer> charMapSorted = charMap.entrySet().stream()
                .sorted((Map.Entry.comparingByValue(Comparator.reverseOrder())))
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> null, LinkedHashMap::new));

        return getResultLine(charMapSorted);
    }

    private String getResultLine(Map<Character, Integer> charMap) {
        StringBuilder resultLine = new StringBuilder();
        Iterator<Map.Entry<Character, Integer>> it = charMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Character, Integer> pair = it.next();
            if (it.hasNext()) resultLine
                    .append("\"")
                    .append(pair.getKey())
                    .append("\": ")
                    .append(pair.getValue())
                    .append(", ");
            else resultLine
                    .append("\"")
                    .append(pair.getKey())
                    .append("\": ")
                    .append(pair.getValue())
                    .append(".");
        }

        return resultLine.toString();
    }
}
