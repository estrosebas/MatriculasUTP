/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 *
 * @author estrosebas
 */
import java.util.Date;

public class Alumno {

    private int ID_Alumno;
    private String Grado_2023;
    private String Colegio_Origen;
    private String Distrito;
    private String Apellido_Paterno;
    private String Apellido_Materno;
    private String Nombres;
    private Date Fecha_Nacimiento;
    private String Lugar_Nacimiento;
    private String Direccion_Domicilio;
    private String DNI;
    private String Religión;
    private String DNI_Padre;
    private String DNI_Madre;

    public Alumno(String Grado_2023, String Colegio_Origen, String Distrito, String Apellido_Paterno, String Apellido_Materno, String Nombres, Date Fecha_Nacimiento, String Lugar_Nacimiento, String Direccion_Domicilio, String DNI, String Religión, String DNI_Padre, String DNI_Madre) {
        this.Grado_2023 = Grado_2023;
        this.Colegio_Origen = Colegio_Origen;
        this.Distrito = Distrito;
        this.Apellido_Paterno = Apellido_Paterno;
        this.Apellido_Materno = Apellido_Materno;
        this.Nombres = Nombres;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Lugar_Nacimiento = Lugar_Nacimiento;
        this.Direccion_Domicilio = Direccion_Domicilio;
        this.DNI = DNI;
        this.Religión = Religión;
        this.DNI_Padre = DNI_Padre;
        this.DNI_Madre = DNI_Madre;
    }

    public int getID_Alumno() {
        return ID_Alumno;
    }

    public void setID_Alumno(int ID_Alumno) {
        this.ID_Alumno = ID_Alumno;
    }

    public String getGrado_2023() {
        return Grado_2023;
    }

    public void setGrado_2023(String Grado_2023) {
        this.Grado_2023 = Grado_2023;
    }

    public String getColegio_Origen() {
        return Colegio_Origen;
    }

    public void setColegio_Origen(String Colegio_Origen) {
        this.Colegio_Origen = Colegio_Origen;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public String getApellido_Paterno() {
        return Apellido_Paterno;
    }

    public void setApellido_Paterno(String Apellido_Paterno) {
        this.Apellido_Paterno = Apellido_Paterno;
    }

    public String getApellido_Materno() {
        return Apellido_Materno;
    }

    public void setApellido_Materno(String Apellido_Materno) {
        this.Apellido_Materno = Apellido_Materno;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getLugar_Nacimiento() {
        return Lugar_Nacimiento;
    }

    public void setLugar_Nacimiento(String Lugar_Nacimiento) {
        this.Lugar_Nacimiento = Lugar_Nacimiento;
    }

    public String getDireccion_Domicilio() {
        return Direccion_Domicilio;
    }

    public void setDireccion_Domicilio(String Direccion_Domicilio) {
        this.Direccion_Domicilio = Direccion_Domicilio;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getReligión() {
        return Religión;
    }

    public void setReligión(String Religión) {
        this.Religión = Religión;
    }

    public String getDNI_Padre() {
        return DNI_Padre;
    }

    public void setDNI_Padre(String DNI_Padre) {
        this.DNI_Padre = DNI_Padre;
    }

    public String getDNI_Madre() {
        return DNI_Madre;
    }

    public void setDNI_Madre(String DNI_Madre) {
        this.DNI_Madre = DNI_Madre;
    }

    @Override
    public String toString() {
        return
                "\nID_Alumno=" + ID_Alumno
                + "\nGrado_2023=" + Grado_2023
                + "\nColegio_Origen=" + Colegio_Origen
                + "\nDistrito=" + Distrito
                + "\nApellido_Paterno=" + Apellido_Paterno
                + "\nApellido_Materno=" + Apellido_Materno
                + "\nNombres=" + Nombres
                + "\nFecha_Nacimiento=" + Fecha_Nacimiento
                + "\nLugar_Nacimiento=" + Lugar_Nacimiento
                + "\nDireccion_Domicilio=" + Direccion_Domicilio
                + "\nDNI=" + DNI
                + "\nReligión=" + Religión
                + "\nDNI_Padre=" + DNI_Padre
                + "\nDNI_Madre=" + DNI_Madre
                + "\n";
    }

}
