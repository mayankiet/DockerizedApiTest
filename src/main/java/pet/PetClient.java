package pet;

import io.restassured.http.ContentType;
import pet.response.PetResponseBody;
import utilities.ConfigReader;
import java.io.IOException;
import static io.restassured.RestAssured.given;

public class PetClient {

    private ConfigReader configReader = new ConfigReader();

    public PetClient() throws IOException {
    }

    public PetResponseBody getPetInfoByID(){
        return
                given()
                .contentType(ContentType.JSON)
                .when()
                .get(configReader.getEndpointUrl())
                .as(PetResponseBody.class);

    }
}
