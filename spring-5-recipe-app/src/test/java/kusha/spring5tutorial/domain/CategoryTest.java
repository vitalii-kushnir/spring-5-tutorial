package kusha.spring5tutorial.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CategoryTest {

    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void testGetId() throws Exception {
        long id = 4L;
        category.setId(id);
        assertEquals(Long.valueOf(id), category.getId());
    }
}