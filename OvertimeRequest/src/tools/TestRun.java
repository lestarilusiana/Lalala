/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.DivisionController;
import controllers.EmployeeController;
import controllers.EmployeeControllerInterface;
import controllers.OvertimeController;
import controllers.OvertimeControllerInterface;
import controllers.RoleController;
import controllers.TimeSheetController;
import controllers.TimeSheetControllerInterface;
import controllers.UserController;
import controllers.UserControllerInterface;
import daos.GeneralDAO;
import models.Division;
import models.Employee;
import models.Overtime;
import models.TimeSheet;
import org.hibernate.SessionFactory;

/**
 *
 * @author milhamafemi
 */
public class TestRun {

    public static void main(String[] args) {

        SessionFactory factory = HibernateUtil.getSessionFactory();
//        GeneralDAO gdao = new GeneralDAO(factory);
//        OvertimeController oc= new OvertimeController(factory);
        DivisionController dc = new DivisionController(factory);
//        RoleController rc= new RoleController(factory);
//        System.out.println(rc.getById("R01").getId());
//        System.out.println( oc.insert("o020", "2019-03-04", "180", "masuk kuliah", "1", "TS07"));
//        System.out.println(dc.getAll());
//        for (Object object : dc.getAll()) {
//            Division division= (Division) object;
//            System.out.println(object);
//        }
//        for (Object object : gdao.getData(new Employee(), "")) {
//            Employee emp= (Employee) object;
//            System.out.println(emp.getName());
//        }
//        for (Object object : gdao.getData(new Division(), "")) {
//            Division d= (Division) object;
//            System.out.println(d.getName());

//            UserController uc = new UserController(factory);
//            System.out.println(uc.login("alien", "alien"));
//        }OvertimeControllerInterface oc = new OvertimeController(factory);
        String id = "E01";
        String idtab = "TS01";
        TimeSheetControllerInterface tc = new TimeSheetController(factory);
        EmployeeControllerInterface ec = new EmployeeController(factory);
        OvertimeControllerInterface oc = new OvertimeController(factory);
        UserControllerInterface uc = new UserController(factory);
//        System.out.println(ec.getById("E02").getRoleList().get(0).getJob().getId());

//            Employee e = ec.getById(id);
//            Overt = tc.getByid(idtab).getOvertimeList();
//        for (Object object : dc.getAll()) {
//            Division d=(Division) object;
//            System.out.println(d.getName());
//        }
        System.out.println(uc.save("ucik", "ucik", "E02"));
    }
}
