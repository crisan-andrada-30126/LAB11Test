/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aut.utcluj.isp;

import aut.utcluj.isp.ex1.PersonTest;
import aut.utcluj.isp.ex2.EmployeeTest;
import aut.utcluj.isp.ex3.EmployeeControllerTest;
import aut.utcluj.isp.ex4.SalaryInfoTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author stefan
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        PersonTest.class,
        EmployeeTest.class,
        EmployeeControllerTest.class,
        aut.utcluj.isp.ex4.EmployeeTest.class,
        SalaryInfoTest.class
})
public class ColocviuTestSuite {

}
