import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.Select

class CalcPage(private val driver: WebDriver) {

    private val pageUrl = "https://testsheepnz.github.io/BasicCalculator.html"

    init {
        PageFactory.initElements(driver, this)
    }

    @FindBy(id = "selectBuild")
    lateinit var build: WebElement

    @FindBy(id = "number1Field")
    lateinit var firstNumber: WebElement

    @FindBy(id = "number2Field")
    lateinit var secondNumber: WebElement

    @FindBy(id = "selectOperationDropdown")
    lateinit var operation: WebElement
//    val selectOperation = Select(operation)

    @FindBy(id = "calculateButton")
    lateinit var calculate: WebElement

    @FindBy(id = "numberAnswerField")
    lateinit var answer: WebElement

    fun open() = driver.get(pageUrl)

    fun verifyUrl() {
        WebDriverWait(driver, 10).until { it.currentUrl == pageUrl }
    }

}