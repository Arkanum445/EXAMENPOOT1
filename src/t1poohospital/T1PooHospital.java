/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1poohospital;

import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class T1PooHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        PacienteControlador controla = new PacienteControlador();

        String rpta = "si";

        while (rpta.equals("si")) {

            Paciente p = new Paciente();

            while (p.getTipoDocumento() == null) {
                System.out.println("Ingrese el tipo de documento");
                p.setTipoDocumento(sc.nextLine());
            }

            while (p.getNumeroDocumento() == null) {
                System.out.println("Ingrese el número de documento");
                p.setNumeroDocumento(sc.nextLine());
            }

            System.out.println("Ingrese el Apellido Paterno");
            p.setApePaterno(sc.nextLine());

            System.out.println("Ingrese el Apellido Materno");
            p.setApeMaterno(sc.nextLine());

            System.out.println("Ingrese el Nombre Completo");
            p.setNombreCompleto(sc.nextLine());

            while (p.getFechaNacimiento() == null) {
                System.out.println("Ingrese la fecha de nacimiento");
                p.setFechaNacimiento(sc.nextLine());
            }

            while (p.getTipoSangre() == null) {
                System.out.println("Ingrese el tipo de sangre");
                p.setTipoSangre(sc.nextLine());
            }

            while (p.getAlergias() == null) {
                System.out.println("Ingrese las alergias");
                p.setAlergias(sc.nextLine());
            }

            while (p.getTelefono() == null) {
                System.out.println("Ingrese el número de teléfono");
                p.setTelefono(sc.nextLine());
            }

            while (p.getCorreo() == null) {
                System.out.println("Ingrese el correo electrónico");
                p.setCorreo(sc.nextLine());
            }

            controla.agregarPaciente(p);

            System.out.println("Desea ingresar otro paciente: si/no");
            rpta = sc.nextLine();

            System.out.println(rpta);
        }

        controla.listarPacientes();
    }
    
}
