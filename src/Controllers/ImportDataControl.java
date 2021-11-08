/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import java.sql.* ;
import DatabaseConnection.DBconnectionSQL;

/**
 *
 * @author asus
 */
public class ImportDataControl {
    DBconnectionSQL db = new DBconnectionSQL() ;
    
    public ResultSet loadAllTasks()
    {
        ResultSet rs = db.search("select * from tasks") ;
        return rs ;
    }
    
    public ResultSet loadTasksToday(String deadline)
    {
        ResultSet rs = db.search("select * from tasks where deadline='"+deadline+"'") ;
        return rs ;
    }
    
    public ResultSet searchTask(String gt, String gdt, String gdd, String gpic, String gs)
    {
        ResultSet rs = db.search("select * from `tasks` where `Task` like '%"+gt+"%' and `Date` like '%"+gdt+"%' and `Deadline` like '%"+gdd+"%' and `PersonInCharge` like '%"+gpic+"%' and `State` like '%"+gs+"%'") ;
        return rs ;
    }
    
    public ResultSet taskState(String State)
    {
        ResultSet rs = db.search("select * from tasks where state='"+State+"'");
        return rs ;
    }
}
