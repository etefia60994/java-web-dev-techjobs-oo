package org.launchcode.techjobs_oo.Tests;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;


public class JobTest {
    private Job job1 = new Job();
    private Job job2 = new Job();
    private Job ProductTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    private Job ProductTestee = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));    //    @Before
//    public void generateTwoJobs(){
//       Job job1 = new Job();
//       Job job2 = new Job();
//    }
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
}}
