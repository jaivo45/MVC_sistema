package main;

import models.*;
import views.*;
import controllers.*;

import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
        
        CustomersModel customersModel = new CustomersModel();
        CustomersView customersView = new CustomersView();
        CustomersController customersController = new CustomersController(customersModel, customersView);
        
        
        
        Model_Clientes suppliersModel = new Model_Clientes();
        View_Proveedor suppliersView = new View_Proveedor();
       // Controller_Proveedor proveedorController = new Controller_Proveedor(suppliersModel, suppliersView);
        
        Model_prductos productsModel = new Model_prductos();
        View_productos productsView = new View_productos();
        Controller_productos productsController = new Controller_productos(productsModel, productsView);
        
        Model_login model_login = new Model_login();
        View_login view_login = new View_login();
        //Controller_login controller_login = new Controller_login(model_login, view_login);
        
        
        
        
        JPanel paneArray[] = new JPanel[3];
        paneArray[0] = customersView;
        paneArray[1] = suppliersView;
        paneArray[2] = productsView;
        
      // paneArray[3] = view_login;
        
        MainModel mainModel = new MainModel();
        MainView mainView = new MainView();
        MainController mainController = new MainController(mainModel, mainView, paneArray);
    } 

    public static class Model_Proveedor {

        public Model_Proveedor() {
        }
    }
}
