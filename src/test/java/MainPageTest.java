import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainPageTest extends AbstractTest{

    @Test
    void mainMenuNavigateTest(){
        MainMenu mainMenu = new MainMenu(getWebDriver());
        mainMenu
                .clickPsychology()
                .clickVideo()
                .clickFood()
                .clickHealth()
                .clickTraveling();
        Assertions.assertEquals("https://www.livejournal.com/category/puteshestviya/",getWebDriver().getCurrentUrl());
    }
    @Test
    void mainMenuWelcomeTest(){
        MainMenu mainMenu = new MainMenu(getWebDriver());
        mainMenu.clickWelcome();
        Assertions.assertEquals("https://www.livejournal.com/",getWebDriver().getCurrentUrl());
    }
    @Test
    void searchTest(){
        SearchPage searchPage = new SearchPage(getWebDriver());
        searchPage.toSearch("Русское географическое общество");
    }
}