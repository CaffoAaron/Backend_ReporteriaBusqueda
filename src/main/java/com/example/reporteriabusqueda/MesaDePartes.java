package com.example.reporteriabusqueda;

public class MesaDePartes {
    private String Nombre;
    private String Dni;
    private String NroRUC;
    private String RazonSocial;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String Teléfono;
    private String Correo;
    private String Dirección;
    private String NroDocumento;
    private String NroFolios;
    private String Asunto;
    private String TipoPersona;
    private String TipoDocumento;
    private String IntendenciaDirigida;

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

    public String getNroRUC() {
        return NroRUC;
    }

    public void setNroRUC(String nroRUC) {
        NroRUC = nroRUC;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        RazonSocial = razonSocial;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        ApellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        ApellidoMaterno = apellidoMaterno;
    }

    public String getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(String teléfono) {
        Teléfono = teléfono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String dirección) {
        Dirección = dirección;
    }

    public String getNroDocumento() {
        return NroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        NroDocumento = nroDocumento;
    }

    public String getNroFolios() {
        return NroFolios;
    }

    public void setNroFolios(String nroFolios) {
        NroFolios = nroFolios;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String asunto) {
        Asunto = asunto;
    }

    public String getTipoPersona() {
        return TipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        TipoPersona = tipoPersona;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }

    public String getIntendenciaDirigida() {
        return IntendenciaDirigida;
    }

    public void setIntendenciaDirigida(String intendenciaDirigida) {
        IntendenciaDirigida = intendenciaDirigida;
    }

    @Override
    public String toString() {
        return "{" +
                "Nombre:'" + Nombre + '\'' +
                ", Dni:'" + Dni + '\'' +
                ", NroRUC:'" + NroRUC + '\'' +
                ", RazonSocial:'" + RazonSocial + '\'' +
                ", ApellidoPaterno:'" + ApellidoPaterno + '\'' +
                ", ApellidoMaterno:'" + ApellidoMaterno + '\'' +
                ", Teléfono:'" + Teléfono + '\'' +
                ", Correo:'" + Correo + '\'' +
                ", Dirección:'" + Dirección + '\'' +
                ", NroDocumento:'" + NroDocumento + '\'' +
                ", NroFolios:'" + NroFolios + '\'' +
                ", Asunto:'" + Asunto + '\'' +
                ", TipoPersona:'" + TipoPersona + '\'' +
                ", TipoDocumento:'" + TipoDocumento + '\'' +
                ", IntendenciaDirigida:'" + IntendenciaDirigida + '\'' +
                '}';
    }
}
