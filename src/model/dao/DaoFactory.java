package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJBDC;

public class DaoFactory {
    public static SellerDao createdSellerDao(){
        return new SellerDaoJBDC(DB.getConnection());
    }
    public static DepartmentDao createdDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
