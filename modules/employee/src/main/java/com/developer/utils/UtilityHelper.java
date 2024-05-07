package com.developer.utils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.developer.model.Employee;

/**
 * @author Manjinder.rooprai
 */
public class UtilityHelper {
    private UtilityHelper() {
    }

    public static Supplier<List<Employee>> employeeSupplier = () -> {

        Employee santhosh = new Employee();
        santhosh.setId(1);
        santhosh.setFirstName("Santhosh");
        santhosh.setLastName("Vernekar");
        santhosh.setAge(30);
        santhosh.setEmail("santosh@gmail.com");
        santhosh.setPhoneNumber("9999999999");
        santhosh.setAddress("111-5770 Hastings st, burnaby, bc, canada");

        Employee virat = new Employee();
        virat.setId(2);
        virat.setFirstName("Virat");
        virat.setLastName("Kohli");
        virat.setAge(28);
        virat.setEmail("Virat@gmail.com");
        virat.setPhoneNumber("9999999900");
        virat.setAddress("111-5777 Hastings st, burnaby, bc, canada");
        return Arrays.asList(santhosh, virat);
    };

}
