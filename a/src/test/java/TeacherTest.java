

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class TeacherTest {

	Teacher teacher;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("al principio de todo");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("al final de todo");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("antes");
		teacher = Teacher.getInstance();
	}

	@After
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

		Integer n1 = 6;
		Integer n2 = 7;
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
