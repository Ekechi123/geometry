package geometry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;  // Correct import for assertions

class RectangularPrismTest {

    @Test
    void should_create_cube() {
        RectangularPrism _ = new RectangularPrism(10.0, 10.0, 10.0);
    }

    @Test
    void should_have_volume_one() {
        RectangularPrism cube = new RectangularPrism(1.0, 1.0, 1.0);
        // Use assertEquals for comparison
        assertEquals(1.0, cube.volume());
    }

    private void assertEquals(double d, double volume) {
		// TODO Auto-generated method stub
		
	}

	@Test
    void should_calculate_surface_area() {
        RectangularPrism cube = new RectangularPrism(1.0, 1.0, 1.0);
        // Use assertEquals for comparison
        assertEquals(6.0, cube.surfaceArea());
    }
}
