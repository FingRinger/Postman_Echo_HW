import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class Test1 {
    @Test
    void shouldReturnSomething() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("http://postman-echo.com")
                .body("some data")
                // Выполняемые действия
                .when()
                .post("/post")
                // Проверки
                .then()
                .statusCode(200)
                .body(/* --> ваша проверка здесь <-- */);
    }
}
