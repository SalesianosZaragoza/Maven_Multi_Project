import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeacherTest {

	Teacher teacher;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		System.out.println("al principio de todo");
		if(System.getProperty("os.name").startsWith("Windows")) {
		}
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		System.out.println("al final de todo");
	}

	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("antes");
		teacher = Teacher.getInstance();
	}

	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("despues");
	}

	@Test
	public void testIfGetInstanceAlwaysReturnSameObject() {
		assertSame(Teacher.getInstance(), teacher);
	}

	@Test
	public void testSumarDosNumeros() {
		
		Integer n1 = 2;
		Integer n2 = 3;
		assertEquals(5, teacher.sumar(n1, n2));

		n1 = 6;
		n2 = 7;
		assertEquals(13, teacher.sumar(n1, n2));
	}

	@Test
	public void testSumarSeisYsieteMeDevuelveTrece() {

		int n1 = 6;
		int n2 = 7;
		assertEquals(13, teacher.sumar(n1, n2));
	}

	@Test
	public void testSumarIfOperandIsNull() {

		Integer n1 = null;
		Integer n2 = null;
		
		try {
			teacher.sumar(n1, n2);
			fail("jamas deberia alcanzar esta linea");
		} catch (Exception e) {
		}
		
		
		
		
		
		
	}






}
