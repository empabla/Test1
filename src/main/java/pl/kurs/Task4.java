package pl.kurs;

public class Task4 {

    public static String shortestName(String[] names) {
        String shortestName = names[0];
        for (String n : names)
            if (n.length() < shortestName.length())
                shortestName = n;

        int minLength = shortestName.length();
        StringBuilder shortest = new StringBuilder();
        for (String s : names)
            if (s.length() == minLength)
                shortest.append(s).append(" ");
        return shortest.toString();
    }

    public static String longestName(String[] names) {
        String longestName = names[0];
        for (String n : names)
            if (n.length() > longestName.length())
                longestName = n;

        int maxLength = longestName.length();
        StringBuilder longest = new StringBuilder();
        for (String s : names)
            if (s.length() == maxLength)
                longest.append(s).append(" ");
        return longest.toString();
    }

    public static int femaleNamesQty(String[] names) {
        int qty = 0;
        for (String n : names)
            if (n.endsWith("a"))
                qty++;
        return qty;
    }

    public static int percentOfFemaleNames(String[] names) {
        return Math.round((float) femaleNamesQty(names) / names.length * 100);
    }

}