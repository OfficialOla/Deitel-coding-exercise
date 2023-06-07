
import javax.swing.JOptionPane;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;


public class NairaConverter {
        public static void main(String[] args) {
            String endpoint = "https://api.exchangerate-api.com/v4/latest/NGN";
            try {
                URL url = new URL(endpoint);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.connect();
                Scanner scanner = new Scanner(url.openStream());
                String response = scanner.useDelimiter("\\Z").next();
                scanner.close();
                JSONObject data = new JSONObject(response);
                BigDecimal usd = data.getJSONObject("rates").getBigDecimal("USD");
                BigDecimal eur = data.getJSONObject("rates").getBigDecimal("EUR");
                BigDecimal jpy = data.getJSONObject("rates").getBigDecimal("JPY");
                BigDecimal gbp = data.getJSONObject("rates").getBigDecimal("GBP");
                BigDecimal aud = data.getJSONObject("rates").getBigDecimal("AUD");
                BigDecimal cad = data.getJSONObject("rates").getBigDecimal("CAD");
                BigDecimal zar = data.getJSONObject("rates").getBigDecimal("ZAR");
                String input = JOptionPane.showInputDialog(null, "Enter the amount you want to convert (₦):", "Naira Converter", JOptionPane.PLAIN_MESSAGE);
                try {
                    BigDecimal ngn = new BigDecimal(input);
                    String[] currencies = {"United States Dollar ($)", "Euro (€)", "Japanese Yen (¥)", "Pound Sterling (£)", "Australian Dollar ($)", "Canadian Dollar ($)", "South African Rand (R)"};
                    String selection = (String) JOptionPane.showInputDialog(null, "Select a currency to convert to:", "Naira Converter", JOptionPane.PLAIN_MESSAGE, null, currencies, currencies[0]);
                    BigDecimal result;
                    switch (selection) {
                        case "United States Dollar ($)" -> result = ngn.multiply(usd);
                        case "Euro (€)" -> result = ngn.multiply(eur);
                        case "Japanese Yen (¥)" -> result = ngn.multiply(jpy);
                        case "Pound Sterling (£)" -> result = ngn.multiply(gbp);
                        case "Australian Dollar ($)" -> result = ngn.multiply(aud);
                        case "Canadian Dollar ($)" -> result = ngn.multiply(cad);
                        case "South African Rand (R)" -> result = ngn.multiply(zar);
                        default -> {
                            JOptionPane.showMessageDialog(null, "Invalid selection.", "Naira Converter", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                    String message = String.format("₦%.2f = %s %.2f", ngn, selection, result);
                    JOptionPane.showMessageDialog(null, message, "Naira Converter", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid amount.", "Naira Converter", JOptionPane.ERROR_MESSAGE);
                    main(args);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }
