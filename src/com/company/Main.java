package com.company;

import java.util.*;

public class Main {

    public static void checkMagazine(List<String> magazine, List<String> note) {


        HashMap<String, Integer> zineMap = new HashMap<>();
        HashMap<String, Integer> noteMap = new HashMap<>();

        if (magazine.containsAll(note)) {
            //nested for loop on magazine
            // count variable initialized at 0;
            // if magazine.get(i).equals magazine.get(j) count++
            //zineMap.put(Key magazine.get(i), count)

            // nested for loop on note
            // count variable initialized at 0
            // if note.get(i).equals note.get(j) count++
            // noteMap.put(Key note.get(i), count)

            for (int i = 0; i < magazine.size(); i++)  {
                int count = 0;
                for (int j = 0; j < magazine.size(); j++) {
                    if (magazine.get(i).equals(magazine.get(j))) {
                        count++;
                        zineMap.put(magazine.get(i), count);
                    }
                }
            }

            for (int i = 0; i < note.size(); i++) {
                int count = 0;
                for (int j = 0; j < note.size(); j++) {
                    if (note.get(i).equals(note.get(j))) {
                        count++;
                        noteMap.put(note.get(i), count);
                    }
                }
            }

            System.out.println(zineMap + "\n" + noteMap);

            ArrayList<String> zineMapKeys = new ArrayList<>();
            ArrayList<String> noteMapKeys = new ArrayList<>();

            int zineWordCount = 0;
            while (zineMapKeys.size() < magazine.size()) {
                zineMapKeys.add(magazine.get(zineWordCount));
                zineWordCount++;
            }
            int noteWordCount = 0;
            while (noteMapKeys.size() < note.size()) {
                noteMapKeys.add(note.get(noteWordCount));
                noteWordCount++;
            }

            Collections.sort(zineMapKeys);
            Collections.sort(noteMapKeys);

            for (int i = 0; i < zineMapKeys.size(); i++) {
                for (int j = 0; j < noteMapKeys.size(); j++) {

                        // if common key values are all equal sout "Yes"
                        // else sout "No"

                }
            }


        }

//        System.out.println("Yes");

    }




    public static void main(String[] args) {

        List<String> mag = new ArrayList<String>();

        List<String> note = new ArrayList<String>();

        mag.add("two");
        mag.add("times");
        mag.add("three");
        mag.add("is");
        mag.add("not");
        mag.add("four");

        note.add("two");
        note.add("times");
        note.add("two");
        note.add("is");
        note.add("four");

        checkMagazine(mag, note);

    }
}
