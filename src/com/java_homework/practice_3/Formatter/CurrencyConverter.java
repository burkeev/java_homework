package com.java_homework.practice_3.Formatter;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;


public class CurrencyConverter {

    public static void main(String[] args) {
        Map<String, Float> currencyRates = new HashMap<>();
        currencyRates.put("$", 60f);
        currencyRates.put("€", 70f);
        currencyRates.put("Руб", 100f);

        JDialog.setDefaultLookAndFeelDecorated(true);
        String[] selectionValues = {"$", "€", "Руб"};
        String initialSelection = "Currency";

        // Get the required currency from the user
        String requiredCurrency = (String) JOptionPane.showInputDialog(null, "Какая валюта вам нужна?",
                "Обмен валют", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

        // Get the user's current currency
        String userCurrency = (String) JOptionPane.showInputDialog(null, "Какую валюту предложите?",
                "Обмен валют", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

        try {
            // Get the currency exchange rate from the map
            float exchangeRate = currencyRates.get(userCurrency) / currencyRates.get(requiredCurrency);

            // Get the amount the user wants to exchange
            double amount = Double.parseDouble(JOptionPane.showInputDialog("Сколько " + userCurrency + " вы собираетесь обменять?"));

            // Display the resulting amount after exchange
            JOptionPane.showMessageDialog(null, "При конвертации " + amount + userCurrency + " в " + requiredCurrency + " Вы получите " + (exchangeRate * amount) + requiredCurrency);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ошибка ввода. Пожалуйста, введите число.");
        }
    }
}
