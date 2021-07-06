import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.Select
import java.util.concurrent.TimeUnit

class TestCon: StringSpec() {

    private val driver: WebDriver = ChromeDriver()
    private val calcPage = CalcPage(driver)
    private val pageUrl = "https://testsheepnz.github.io/BasicCalculator.html"


    init {
        driver.manage()?.timeouts()?.implicitlyWait(10, TimeUnit.SECONDS)
        driver.manage()?.window()?.maximize()

        "Page calculator open" {
            calcPage.run {
                open()
                verifyUrl()
            }
        }

        "Page Down"{
            calcPage.run {
                open()
                val xOffset = answer.rect.getX()
                val yOffset = answer.rect.getY()
                val actionProvider = Actions(driver)
                actionProvider.moveByOffset(xOffset, yOffset).build().perform()
            }
        }
        "Test concatenate"{
            calcPage.run{
                open()
                val selectBuild = Select(build)
                selectBuild.selectByVisibleText("Prototype")
                firstNumber.sendKeys("gs")
                secondNumber.sendKeys("bu")
                val selectOperation = Select(operation)
                selectOperation.selectByVisibleText("Concatenate")
                calculate.click()
                answer.getAttribute("value").shouldBe("gsbu")
            }
        }
    }
}
