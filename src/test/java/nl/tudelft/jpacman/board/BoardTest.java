package nl.tudelft.jpacman.board;
import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class BoardTest {

    @Test
    public void testSquareAt() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new Square() {
            @Override
            public boolean isAccessibleTo(Unit unit) {
                return false;
            }
            @Override
            public Sprite getSprite() {
                return null;
            }
        };
        Board board = new Board(grid);

        Square result = board.squareAt(0, 0);
        assertThat(grid[0][0] == result);

    }
}
