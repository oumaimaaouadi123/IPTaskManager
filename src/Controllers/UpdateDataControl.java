/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import DatabaseConnection.DBconnectionSQL;
import java.sql.* ;
/**
 *
 * @author asus
 */
public class UpdateDataControl {
    DBconnectionSQL db = new DBconnectionSQL() ;
    
    public void saveTask(String gt, String gdt, String gdd, String gpic, String gs)
    {
        db.update("INSERT INTO `tasks`(`Task`, `Date`, `Deadline`, `PersonInCharge`, `State`) VALUES ('"+gt+"','"+gdt+"','"+gdd+"','"+gpic+"','"+gs+"')") ;
    }
    
    public void updateTask(int gtid, String gt, String gdt, String gdd, String gpic, String gs)
    {
        db.update("UPDATE `tasks` SET `Task`='"+gt+"',`Date`='"+gdt+"',`Deadline`='"+gdd+"',`PersonInCharge`='"+gpic+"',`State`='"+gs+"' WHERE `ID`="+gtid) ;
    }
    
    public void deleteTask(int gtid)
    {
        db.update("DELETE FROM `tasks` WHERE `ID`="+gtid);
    }
}
