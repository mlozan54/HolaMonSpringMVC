/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.xtec.ioc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import junit.framework.TestCase;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author MiguelAngel
 */
public class HolaControllerTest extends TestCase {
    
    public HolaControllerTest(String testName) {
        super(testName);
    }

    /**
     * Test of handleRequest method, of class HolaController.
     */
    public void testHandleRequest() throws Exception {
        System.out.println("handleRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        HolaController instance = new HolaController();
        //ModelAndView expResult = null;
        ModelAndView result = instance.handleRequest(request, response);
        assertEquals("Hola a tothom", result.getModelMap().get("salutacio"));
    }

    /**
     * Test of handleRequestDia method, of class HolaController.
     */
    /*public void testHandleRequestDia() throws Exception {
        System.out.println("handleRequestDia");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        HolaController instance = new HolaController();
        ModelAndView expResult = null;
        ModelAndView result = instance.handleRequestDia(request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of handleRequestNit method, of class HolaController.
     */
    /*public void testHandleRequestNit() throws Exception {
        System.out.println("handleRequestNit");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        HolaController instance = new HolaController();
        ModelAndView expResult = null;
        ModelAndView result = instance.handleRequestNit(request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
}
