package controllers;

import models.Model_clientes;
import views.View_clientes;

public class Controller_clientes {
    Model_clientes suppliersModel;
    View_clientes suppliersView;

    public Controller_clientes(Model_clientes suppliersModel, View_clientes suppliersView) {
        this.suppliersModel = suppliersModel;
        this.suppliersView = suppliersView;
    }
    
    
}
