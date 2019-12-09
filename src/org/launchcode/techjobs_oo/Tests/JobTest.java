package org.launchcode.techjobs_oo.Tests;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.util.prefs.BackingStoreException;


public class JobTest {
    Job job1;
    Job job2;
    Job ProductTestee;
    Job ProductTester;
    Job BlankField;
    @Before
    public void generateJobs(){
        job1 = new Job();
        job2 = new Job();
        ProductTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        ProductTestee = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        BlankField = new Job("position", new Employer(""), new Location ("St. Elsewhere"), new PositionType("Wage Slave"), new CoreCompetency("C#"));
    }
    @Test
    public void testSettingJobId(){
        assertTrue(job2.getId() - job1.getId() == 1 && job1.getId() != job2.getId());
        assertTrue( job1.getId() == 1);
        assertTrue(job2.getId() == 2);
    }
@Test
    public void testJobConstructor(){
    assertTrue(ProductTester.getEmployer() instanceof Employer);
    assertTrue(ProductTester.getLocation() instanceof Location);
    assertTrue(ProductTester.getPositionType() instanceof PositionType);
    assertTrue(ProductTester.getCoreCompetency() instanceof CoreCompetency);

}
@Test
    public void testJobsforEquality(){
        assertFalse(ProductTester.equals(ProductTestee));
}
@Test
    public void toStringTestNewLines() {
    assertTrue(ProductTester.toString().startsWith("\n"));
    assertTrue(ProductTester.toString().endsWith("\n"));
}
@Test
        public void toStringTestMethod(){
    assertEquals(ProductTester.toString(),
            "\n" + "ID: " + ProductTester.getId() +
                    "\n" + "Name: " + ProductTester.getName() +
                    "\n" + "Employer: " + ProductTester.getEmployer() +
                    "\n" + "Location: " + ProductTester.getLocation() +
                    "\n" + "Position Type: " + ProductTester.getPositionType() +
                    "\n" + "Core Competency: " + ProductTester.getCoreCompetency() + "\n");
}
@Test
    public void blankFieldTest(){
        assertEquals(BlankField.getEmployer().toString(), "No Data Available");
}
}
