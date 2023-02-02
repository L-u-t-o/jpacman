package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.Test;
import java.awt.*;
import static org.assertj.core.api.Assertions.assertThat;
public class PelletTest {
    private Sprite image = null;
    private final int value = 0;
    @Test
    public void testGetSprite() {
        Sprite newSprite = new Sprite() {
            @Override
            public void draw(Graphics graphics, int x, int y, int width, int height) {

            }
            @Override
            public Sprite split(int x, int y, int width, int height) {
                return null;
            }
            @Override
            public int getWidth() {
                return 0;
            }
            @Override
            public int getHeight() {
                return 0;
            }
        };
        Pellet pellet = new Pellet(0, newSprite);
        Sprite newerSprite = pellet.getSprite();
        assertThat(newerSprite).isEqualTo(newSprite);
        image = newSprite;
    }
    @Test
    void testPellet(){
        Pellet Pellet2 = new Pellet(value, image);
    }
}
