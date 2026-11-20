package org.example.model;

import java.util.Objects;

public class Paciente {
    private String documento;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;

    public Paciente(String documento, String nombres, String apellidos, String telefono, String correo) {
        this.documento = validarTextoObligatorio(documento, "El documento es obligatorio");
        this.nombres = validarTextoObligatorio(nombres, "Los nombres son obligatorios");
        this.apellidos = validarTextoObligatorio(apellidos, "Los apellidos son obligatorios");
        this.telefono = telefono;
        this.correo = correo;
    }

    private static String validarTextoObligatorio(String valor, String mensaje) {
        Objects.requireNonNull(mensaje, "El mensaje de validación no puede ser null");

        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException(mensaje);
        }

        return valor.strip();
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = validarTextoObligatorio(documento, "El documento es obligatorio");
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = validarTextoObligatorio(apellidos, "Los apellidos son obligatorios");
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paciente that)) return false;
        return Objects.equals(documento, that.documento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documento);
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "documento='" + documento + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
