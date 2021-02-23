package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.launchcode.techjobs_oo.*;

public class JobTest {

    Job test_job_one;

    @Before
    public void createJobObjectOne() {
        test_job_one = new Job();
    }

    Job test_job_two;

    @Before
    public void createJobObjectTwo() {
        test_job_two = new Job();
    }

    @Test
    public void testSettingJobId() { assertFalse(test_job_one.getId() == test_job_two.getId()); }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job_three;
        test_job_three = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job_three.getName() == "Product tester");
        assertTrue(test_job_three.getEmployer().getValue() == "ACME");
        assertTrue(test_job_three.getLocation().getValue() == "Desert");
        assertTrue(test_job_three.getPositionType().getValue() == "Quality control");
        assertTrue(test_job_three.getCoreCompetency().getValue() == "Persistence");
        assertTrue(test_job_three.getEmployer() instanceof Employer);
        assertTrue(test_job_three.getLocation() instanceof Location);
        assertTrue(test_job_three.getPositionType() instanceof  PositionType);
        assertTrue(test_job_three.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job test_job_four;
        Job test_job_five;
        test_job_four = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job_five = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job_four.equals(test_job_five));
    }
}
