/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1poohospital;

import java.util.ArrayList;

/**
 *
 * @author edgar
 */
public class PacienteControlador {
    
    ArrayList<Paciente> lista_pacientes = new ArrayList();

    void agregarPaciente(Paciente p) {
        lista_pacientes.add(p);
    }

    void listarPacientes() {
        System.out.println("La lista de pacientes es:");

        for (Paciente paciente : lista_pacientes) {
            paciente.verPaciente();
        }
    }
}

