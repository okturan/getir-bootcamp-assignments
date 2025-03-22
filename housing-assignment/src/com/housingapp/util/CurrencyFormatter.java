package com.housingapp.util;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    // Helper method to format a currency value to Turkish locale (10000" -> "10.000")
    public static String formatCurrency(double amount) {
        Locale turkishLocale = Locale.of("tr", "TR");
        NumberFormat formatter = NumberFormat.getIntegerInstance(turkishLocale);
        return formatter.format(amount);
    }
}
