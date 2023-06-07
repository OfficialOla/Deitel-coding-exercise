import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyAPI {
        public static void main(String[] args) {
            // Call the method to fetch data from the API
            String jsonResponse = fetchDataFromAPI("https://randomuser.me/api/");

            // Perform calculation using the fetched data
            if (jsonResponse != null) {
                int result = performCalculation(jsonResponse);
                System.out.println("Calculation result: " + result);
            } else {
                System.out.println("Failed to fetch data from the API.");
            }
        }

        public static String fetchDataFromAPI(String apiUrl) {
            try {
                // Create the connection
                URL url = new URL(apiUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.connect();
                // Read the response
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Close the connection
                conn.disconnect();

                return response.toString();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public static int performCalculation(String jsonResponse) {
            // Extract the relevant values from the JSON response
            // and perform the calculation logic based on your requirements

            // For example, let's assume the JSON response contains two values: "value1" and "value2"
            int value1 = 0;
            int value2 = 0;

            // Parse the JSON response and extract the values
            // (You might need to use a JSON parsing library like Gson or Jackson for complex JSON parsing)
            try {
                // Sample JSON response: {"value1": 5, "value2": 10}
                // Parse the JSON and extract the values
                // Modify this code based on the structure of your JSON response
                value1 = extractValueFromJSON(jsonResponse, "value1");
                value2 = extractValueFromJSON(jsonResponse, "value2");
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Perform the calculation using the extracted values

            return value1 + value2;
        }

        public static int extractValueFromJSON(String jsonResponse, String key) {
            // Implement the JSON parsing logic to extract the value associated with the given key
            // Modify this code based on the JSON parsing library you are using

            // For simplicity, assuming the JSON response is a key-value pair represented as a string
            String valueString = jsonResponse.replaceAll("[^0-9,.-]", ""); // Remove non-numeric characters
            String[] values = valueString.split(","); // Split values by comma

            int extractedValue = 0;

            // Find the value associated with the given key
            for (String value : values) {
                String[] keyValue = value.split(":"); // Split key-value pair by colon
                String extractedKey = keyValue[0].replaceAll("\"", "").trim(); // Remove quotes and whitespace

                if (extractedKey.equals(key)) {
                    extractedValue = Integer.parseInt(keyValue[1].trim());
                    break;
                }
            }

            return extractedValue;
        }
    }


