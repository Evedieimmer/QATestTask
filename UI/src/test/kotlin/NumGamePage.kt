import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.WebDriverWait

class NumGamePage (private val driver: WebDriver) {

    private val pageUrl = "https://testsheepnz.github.io/random-number.html"

    init {
        PageFactory.initElements(driver, this)
    }

    @FindBy(id = "buildNumber")
    lateinit var build: WebElement

    @FindBy(id="rollDiceButton")
    lateinit var btnRollDice: WebElement

    @FindBy(id="numberGuess")
    lateinit var numberGuess: WebElement

    @FindBy(id="submitButton")
    lateinit var btnSubmit: WebElement

    @FindBy(id="feedbackLabel")
    lateinit var labelFB: WebElement

    fun open() = driver.get(pageUrl)

    fun verifyUrl() {
        WebDriverWait(driver, 10).until { it.currentUrl == pageUrl }
    }

}