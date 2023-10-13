/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 *
 * @author estrosebas
 */
public class Representante {
    private int id_Usuario;
    private int dni_Repre;
    private String nom_Repre;
    private String ape_PRe;
    private String ape_MRe;
    private String sexo;
    private int id_distritoR;
    private String domicilio;
    private String lugar_traba;
    private String correo;
    private int id_telefono;

    public Representante(int id_Usuario, int dni_Repre, String nom_Repre, String ape_PRe, String ape_MRe, String sexo, int id_distritoR, String domicilio, String lugar_traba, String correo, int id_telefono) {
        this.id_Usuario = id_Usuario;
        this.dni_Repre = dni_Repre;
        this.nom_Repre = nom_Repre;
        this.ape_PRe = ape_PRe;
        this.ape_MRe = ape_MRe;
        this.sexo = sexo;
        this.id_distritoR = id_distritoR;
        this.domicilio = domicilio;
        this.lugar_traba = lugar_traba;
        this.correo = correo;
        this.id_telefono = id_telefono;
    }

    public Representante(int dni_Repre, String nom_Repre, String ape_PRe, String ape_MRe, String sexo, int id_distritoR, String domicilio, String lugar_traba, String correo, int id_telefono) {
        this.dni_Repre = dni_Repre;
        this.nom_Repre = nom_Repre;
        this.ape_PRe = ape_PRe;
        this.ape_MRe = ape_MRe;
        this.sexo = sexo;
        this.id_distritoR = id_distritoR;
        this.domicilio = domicilio;
        this.lugar_traba = lugar_traba;
        this.correo = correo;
        this.id_telefono = id_telefono;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public int getDni_Repre() {
        return dni_Repre;
    }

    public void setDni_Repre(int dni_Repre) {
        this.dni_Repre = dni_Repre;
    }

    public String getNom_Repre() {
        return nom_Repre;
    }

    public void setNom_Repre(String nom_Repre) {
        this.nom_Repre = nom_Repre;
    }

    public String getApe_PRe() {
        return ape_PRe;
    }

    public void setApe_PRe(String ape_PRe) {
        this.ape_PRe = ape_PRe;
    }

    public String getApe_MRe() {
        return ape_MRe;
    }

    public void setApe_MRe(String ape_MRe) {
        this.ape_MRe = ape_MRe;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getId_distritoR() {
        return id_distritoR;
    }

    public void setId_distritoR(int id_distritoR) {
        this.id_distritoR = id_distritoR;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getLugar_traba() {
        return lugar_traba;
    }

    public void setLugar_traba(String lugar_traba) {
        this.lugar_traba = lugar_traba;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getId_telefono() {
        return id_telefono;
    }

    public void setId_telefono(int id_telefono) {
        this.id_telefono = id_telefono;
    }
    
}
