package geometry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the RectangularPrism class.
 * This class contains test cases to ensure that the RectangularPrism class functions correctly.
 */
class RectangularPrismTest {

    /**
     * Test to check if the cube is created successfully.
     */
    @Test
    void should_create_cube() {
        RectangularPrism cube = new RectangularPrism(10.0, 10.0, 10.0);
        assertNotNull(cube);  // Check if the cube is created
    }

    /**
     * Test to verify the volume of the cube.
     */
    @Test
    void should_have_volume_one() {
        RectangularPrism cube = new RectangularPrism(1.0, 1.0, 1.0);
        assertEquals(1.0, cube.volume(), 0.0001);
    }

    /**
     * Test to verify the surface area of the cube.
     */
    @Test
    void should_calculate_surface_area() {
        RectangularPrism cube = new RectangularPrism(1.0, 1.0, 1.0);
        assertEquals(6.0, cube.surfaceArea(), 0.0001);
    }
}
