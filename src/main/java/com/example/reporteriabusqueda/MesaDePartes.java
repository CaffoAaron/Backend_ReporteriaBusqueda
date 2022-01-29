package com.example.reporteriabusqueda;

public class MesaDePartes {
    private String Nombre;
    private String Dni;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    @Override
    public String toString() {
        return "{" +
                "Nombre:'" + Nombre + '\'' +
                ", Dni:'" + Dni + '\'' +
                '}';
    }
}
