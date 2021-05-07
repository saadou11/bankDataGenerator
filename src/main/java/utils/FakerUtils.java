package utils;

import com.github.javafaker.Faker;
import org.json.JSONObject;

import java.util.Locale;

public class FakerUtils {

    static public Faker faker = null;
    static JSONObject json = new JSONObject();

    /**
     * singleton data faker
     *
     * @return faker
     */
    static public Faker getFaker() {
        if (faker == null)
            faker = new Faker(Locale.ENGLISH);

        return faker;
    }

    static public JSONObject fakeJsonData(Faker faker) {
        /*
         * Random fields from data faker
         *
         */

        json.put("firstname", faker.name().firstName());
        json.put("lastname", faker.name().lastName());
        json.put("age", faker.number().numberBetween(18,100));
        json.put("sold", faker.number().numberBetween(-100, 50000));
        json.put("typeAccount", faker.number().numberBetween(0,2));
        json.put("dateInscription", faker.date());
        json.put("clientId",faker.idNumber().invalid());
        json.put("bankId",faker.idNumber().invalid());
        json.put("typeCard", faker.number().numberBetween(0,3));
        json.put("bankName",faker.name().name());
        json.put("bankType",faker.number().numberBetween(0,3));
        json.put("ammount",faker.number().numberBetween(1,10000));

        return json;
    }

    static public JSONObject createClient(Faker faker){
        json.put("firstname", faker.name().firstName());
        json.put("lastname", faker.name().lastName());
        json.put("age", faker.number().numberBetween(20,65));
        json.put("sold", faker.number().numberBetween(-100, 50000));
        json.put("paiementLimit", faker.number().numberBetween(600,10000));
        json.put("withdrawalLimit", faker.number().numberBetween(300,5000));

    }

    static public String convertDataTypeJavaSql(String type) {
        String result = null;

        if (type.equals("String"))
            result = "varchar(100)";

        return result;
    }
}
