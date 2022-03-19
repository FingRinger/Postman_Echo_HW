import io.restassured.specification.Argument;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Test1 {
    @Test
    void shouldReturnGoodSong() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("http://postman-echo.com")
                .body("Travel On The Wind")
                // Выполняемые действия
                .when()
                .post("/post")
                // Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("Travel On The Wind"));
    }
    @Test
    void shouldReturnFigure() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("http://postman-echo.com")
                .body(100000)
                // Выполняемые действия
                .when()
                .post("/post")
                // Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo(100000));
    }


}
