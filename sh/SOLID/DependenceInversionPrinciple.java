package src.sh.SOLID;
// Vi phạm DIP
//class MySQLDatabase {
//    void save() { }
//}
//
//class UserService {
//    MySQLDatabase db = new MySQLDatabase(); // phụ thuộc cụ thể
//}
public class DependenceInversionPrinciple {
    interface Database {
        void save();
    }

    static class MysqlDataBase implements Database{
        @Override
        public void save() {
            System.out.println("MySql");
        }
    }
    static class OracleDataBase implements Database{
        @Override
        public void save() {
            System.out.println("Oracle");
        }
    }
    static class UserService{
        Database db;
        public UserService(Database db){
            this.db = db;
        }
    }

    public static void main(String[] args) {
        MysqlDataBase mysqlDataBase = new MysqlDataBase();
        UserService userService = new UserService(mysqlDataBase);
        userService.db.save();
    }
}
