package nl.tudelft.jpacman.ui;
import nl.tudelft.jpacman.Launcher;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
public class LauncherTest {

    private Launcher launchTest = new Launcher();
    String test = "testing123";
    @Test
    void testWithMapFile(){
        assertThat(launchTest.withMapFile(test));
    }
}
