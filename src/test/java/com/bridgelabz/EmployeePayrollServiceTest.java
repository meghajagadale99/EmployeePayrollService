package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

import static com.bridgelabz.EmployeePayrollService.IOService.FILE_IO;
public class EmployeePayrollServiceTest {
    @Test
    public void given3EmployeeWhenWrittenToFile_shouldMatchEmployeeEntries() {
        EmployeePayrollData[] arrayOfEmps = {
                new EmployeePayrollData(1, "Jeff Bezos", 100000.0),
                new EmployeePayrollData(2, "Bill Gates", 200000.0),
                new EmployeePayrollData(3, "Sundar Pichai", 300000.0)
        };
        EmployeePayrollService employeePayrollService;
        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
        employeePayrollService.writeEmployeePayrollData(FILE_IO);
        employeePayrollService.printData(FILE_IO);
        long entries = employeePayrollService.countEntries(FILE_IO);
        Assert.assertEquals(3, entries);
    }
}
