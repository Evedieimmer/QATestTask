import io.restassured.RestAssured
import io.restassured.builder.RequestSpecBuilder
import io.restassured.filter.log.LogDetail
import io.restassured.http.ContentType

class PetController {

    init {
        RestAssured.requestSpecification = RequestSpecBuilder()
                .addHeader("api_key", "1qa2ws3ed4rfvcxz")
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .setBaseUri("https://petstore.swagger.io")
                .setBasePath("/v2/pet")
                .log(LogDetail.ALL).build()
    }

    fun addNewPetToTheStore(pet: Pet): Pet {
        return RestAssured.given()
                .body(pet)
                .post()
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .extract()
                .`as`(Pet::class.java)
    }

    fun deletePet(pet: Pet) {
        RestAssured.given()
                .delete(pet.id.toString())
    }

    fun getPetByID(pet: Pet): Message {
        return RestAssured.given()
                .get(pet.id.toString())
                .then()
                .contentType(ContentType.JSON)
                .log().all()
                .extract().body().`as`(Message::class.java)
    }

}
