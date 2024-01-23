
import controller.BankController;
import dao.BankDAO;

public class BankApp {
    public static void main(String[] args){
        BankDAO dao = new BankDAO();
        BankController con = new BankController(dao);
        Dispatcher d = new Dispatcher(con);
        d.route( "/delete");
    }
}