package controllers;

import models.Model_clientes;
import views.View_Proveedor;

public class Controller_clientes {
    Model_clientes suppliersModel;
    View_Proveedor suppliersView;

    public Controller_clientes(Model_clientes suppliersModel, View_Proveedor suppliersView) {
        this.suppliersModel = suppliersModel;
        this.suppliersView = suppliersView;
    }
    
    
}
