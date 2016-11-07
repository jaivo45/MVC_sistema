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
        
        Model_clientes suppliersModel = new Model_clientes();
        View_Proveedor suppliersView = new View_Proveedor();
        Controller_clientes suppliersController = new Controller_clientes(suppliersModel, suppliersView);
        
        Model_prductos productsModel = new Model_prductos();
        View_productos productsView = new View_productos();
        Controller_productos productsController = new Controller_productos(productsModel, productsView);
        
        
        
        
        JPanel paneArray[] = new JPanel[3];
        paneArray[0] = customersView;
        paneArray[1] = suppliersView;
        paneArray[2] = productsView;
        //paneArray[3] =
        
        MainModel mainModel = new MainModel();
        MainView mainView = new MainView();
        MainController mainController = new MainController(mainModel, mainView, paneArray);
    } 

    private static class Model_clientes {

        public Model_clientes() {
        }
    }
}
