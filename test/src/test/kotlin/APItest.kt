import io.qameta.allure.Description
import io.qameta.allure.Feature
import org.apache.commons.lang3.RandomStringUtils
import org.junit.Assert
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.*


class APITest {
    @Test
    @DisplayName("Проверка добавления питомца")
    @Description("описание теста")
    @Feature("добавление питомца")
    fun `Add new pet to store test`() {
        val petTest = Pet(
                id = RandomStringUtils.randomNumeric(10).toLong(),
                name = "Pet_${RandomStringUtils.randomAlphabetic(8)}",
                status = "available"
        )

        val petResponse = PetController().addNewPetToTheStore(petTest)

        Assert.assertEquals(petTest, petResponse)
    }

    @Test
    @DisplayName("Проверка удаления питомца по ID")
    @Description("описание теста")
    @Feature("удаление питомца")
    fun `Delete pet from store test`() {
        val petTest = Pet(
                id = RandomStringUtils.randomNumeric(10).toLong(),
                name = "Pet_${RandomStringUtils.randomAlphabetic(8)}",
                status = "available"
        )

        PetController().apply {
            addNewPetToTheStore(petTest)
            deletePet(petTest)

            Assert.assertTrue(getPetByID(petTest).message == "Pet not found")
        }
    }
}