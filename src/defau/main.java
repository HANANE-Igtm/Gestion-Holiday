package defau;

import Controller.*;
import DAO.*;
import Model.*;
import View.*;
import View.PanelsView;

public class main {


    public static void main(String[] args) {
        // Créer des instances des vues
        HolidayView holidayView = new HolidayView();   // Vue pour la gestion des congés
        EmployeView employeView = new EmployeView();   // Vue pour la gestion des employés

        // Créer les modèles et contrôleurs
        HolidayModel holidayModel = new HolidayModel(new HolidayDAOImpl());
        EmployeModel employeModel = new EmployeModel(new EmployeDAOImp());

        HolidayController holidayController = new HolidayController(holidayView, holidayModel);
        EmployeController employeController = new EmployeController(employeView, employeModel);

        // Créer la vue principale PanelsView et passer les vues
        new PanelsView(holidayView, employeView);  // Crée et affiche la fenêtre principale avec les onglets
    }
    }


