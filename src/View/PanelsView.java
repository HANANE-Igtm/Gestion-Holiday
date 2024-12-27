package View;

import javax.swing.*;

public class PanelsView extends JFrame {
    private JTabbedPane tabbedPane = new JTabbedPane();

    public PanelsView(HolidayView holidayView, EmployeView employeView) {
        setTitle("Admin Dashboard - Gestion des Congés et des Employés");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 520); // Taille ajustée pour les nouveaux panneaux
        setLocationRelativeTo(null);

        // Ajouter les vues comme onglets dans le JTabbedPane
        tabbedPane.addTab("Gestion des Employés", employeView);
        tabbedPane.addTab("Gestion des Congés", holidayView);


        // Ajouter le JTabbedPane à la fenêtre principale
        add(tabbedPane);

        // S'assurer que la fenêtre est visible
        setVisible(true);
        pack();
    }
}
