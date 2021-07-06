import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.Select
import java.util.concurrent.TimeUnit

class TestNumGame : StringSpec() {

    private val driver: WebDriver = ChromeDriver()
    private val gamePage = NumGamePage(driver)
    private val pageUrl = "https://testsheepnz.github.io/random-number.html"


    init {
        driver.manage()?.timeouts()?.implicitlyWait(10, TimeUnit.SECONDS)
        driver.manage()?.window()?.maximize()

        "Page open" {
            gamePage.run {
                open()
                verifyUrl()
            }

        }

        "Page Down"{
            gamePage.run {
                open()
                val xOffset = build.rect.getX()
                val yOffset = build.rect.getY()
                val actionProvider = Actions(driver)
                actionProvider.moveByOffset(xOffset, yOffset).build().perform()
            }
        }

        "Test game"{
            gamePage.run{
                open()
                val selectBuild = Select(build)
                selectBuild.selectByVisibleText("Demo")
                btnRollDice.click()
                numberGuess.sendKeys("string")
                btnSubmit.click()
                labelFB.isDisplayed
            }
        }
    }
}