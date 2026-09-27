/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1poohospital;

/**
 *
 * @author edgar
 */
public class Paciente {
    private String tipoDocumento;
    private String numeroDocumento;
    private String apePaterno; 
    private String apeMaterno; 
    private String nombreCompleto;
    private String fechaNacimiento;
    private String tipoSangre;
    private String alergias;
    private String telefono;
    private String correo;

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
         if (tipoDocumento.equals("DNI") ||
            tipoDocumento.equals("Carnet de Extranjería")) {
            this.tipoDocumento = tipoDocumento;
        } else {
            System.out.println("El tipo de documento no es correcto");
        }
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        if (tipoDocumento == null) {
            System.out.println("Primero debe ingresar el tipo de documento");
        } else if (tipoDocumento.equals("DNI")) {

            if (numeroDocumento.length()==8) {
                this.numeroDocumento = numeroDocumento;
            } else {
                System.out.println("El DNI debe tener 8 dígitos");
            }

        } else if (tipoDocumento.equals("Carnet de Extranjería")) {

            if (numeroDocumento.length()==9) {
                this.numeroDocumento = numeroDocumento;
            } else {
                System.out.println(
                    "El Carnet de Extranjería debe tener 9 dígitos"
                );
            }
        }
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        if (nombreCompleto != null && !nombreCompleto.trim().isEmpty()) {
            this.nombreCompleto = nombreCompleto;
        } else {
            System.out.println("El nombre no puede estar vacío");
        }
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        if (fechaNacimiento != null && !fechaNacimiento.trim().isEmpty()) {
            this.fechaNacimiento = fechaNacimiento;
        } else {
            System.out.println("La fecha de nacimiento no puede estar vacía");
        }
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        if (tipoSangre != null && !tipoSangre.trim().isEmpty()) {
            this.tipoSangre = tipoSangre;
        } else {
            System.out.println("El tipo de sangre no puede estar vacío");
        }

    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
         if (alergias != null && !alergias.trim().isEmpty()) {
            this.alergias = alergias;
        } else {
            System.out.println("El campo alergias no puede estar vacío");
        }

    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
         if (telefono != null && telefono.length()== 9) {
            this.telefono = telefono;
        } else {
            System.out.println("El teléfono debe tener 9 dígitos");
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
         if (correo != null && correo.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.com$")) {
            this.correo = correo;
        } else {
            System.out.println("El correo debe tener un formato válido .com");
        }
    }
   public void verPaciente (){
       System.out.println("PACIENTE TIPO DOC:  " + this.tipoDocumento + " NRO DOC: " +
               this.numeroDocumento + " Nombre: " + this.nombreCompleto + " MATERNO: " + this.apeMaterno +
               " PATERNO: " + this.apePaterno + " FENAC: " + this.fechaNacimiento + "TIPO SANGRE: " + this.tipoSangre +
               " ALERGIAS: " + this.alergias + " TELEFONO " + this.telefono + " CORREO: " + this.correo);
   }
}
