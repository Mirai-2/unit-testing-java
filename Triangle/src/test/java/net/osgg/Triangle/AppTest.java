package net.osgg.Triangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.mockito.Matchers.startsWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
    public void TC08() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4", b = "4", c = "4";
    	assertTrue( t.getTriangleType(a, b, c).equals("Equilatero") );
    }
	
	
	@Test
    public void TC09a() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4", b = "4", c = "3";
    	assertTrue( t.getTriangleType(a, b, c).equals("Isósceles") );
    }
	@Test
    public void TC09b() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4", b = "3", c = "4";
    	assertTrue( t.getTriangleType(a, b, c).equals("Isósceles") );
    }
	@Test
    public void TC09c() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "3", b = "4", c = "4";
    	assertTrue( t.getTriangleType(a, b, c).equals("Isósceles") );
    }
	
	@Test
    public void TC10() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4", b = "2", c = "3";
    	assertTrue( t.getTriangleType(a, b, c).equals("Escaleno") );
    }
	
	@Test
    public void TC11a() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4", b = "2", c = "0";
    	assertTrue( t.getTriangleType(a, b, c).equals("los valores ingresados no corresponden con los de un triángulo") );
    }
	@Test
    public void TC11b() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4", b = "0", c = "3";
    	assertTrue( t.getTriangleType(a, b, c).equals("los valores ingresados no corresponden con los de un triángulo") );
    }
	@Test
    public void TC11c() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "0", b = "3", c = "0";
    	assertTrue( t.getTriangleType(a, b, c).equals("los valores ingresados no corresponden con los de un triángulo") );
    }
	@Test
    public void TC11d() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "1", b = "1", c = "5";
    	assertTrue( t.getTriangleType(a, b, c).equals("los valores ingresados no corresponden con los de un triángulo") );
    }
	
	
	@Test
    public void TC12a() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4", b = "3", c = "1.5";
    	assertTrue( t.getTriangleType(a, b, c).equals("los tres valores a ingresar deben ser números enteros") );
    }
	@Test
    public void TC12b() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4", b = "2.9", c = "2";
    	assertTrue( t.getTriangleType(a, b, c).equals("los tres valores a ingresar deben ser números enteros") );
    }
	@Test
    public void TC12c() {
    	TriangleUtils t = new TriangleUtils();
    	String a = "4.5", b = "4", c = "3";
    	assertTrue( t.getTriangleType(a, b, c).equals("los tres valores a ingresar deben ser números enteros") );
    }
	
	
	
}

