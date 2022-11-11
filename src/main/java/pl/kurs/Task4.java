package pl.kurs;

public class Task4 {

    public static String shortestName(String[] names) {
        int minLength = 0;
        String shortestName = names[0];
        for (String n : names)
            if (n.length() < shortestName.length())
                shortestName = n;

        minLength = shortestName.length();
        shortestName = "";
        for (String s : names) {
            if (s.length() == minLength)
                shortestName += s + " ";
        }
        return shortestName;
    }

    public static String longestName(String[] names) {
        int maxLength = 0;
        String longestName = names[0];
        for (String n : names)
            if (n.length() > longestName.length())
                longestName = n;

        maxLength = longestName.length();
        longestName = "";
        for (String s : names) {
            if (s.length() == maxLength)
                longestName += s + " ";
        }
        return longestName;
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