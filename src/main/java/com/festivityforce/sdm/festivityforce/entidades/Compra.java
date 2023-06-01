package com.festivityforce.sdm.festivityforce.entidades;

public class Compra {

    private String id;
    private String idUsuario;
    private String idIngresso;
    private String idFestival;
    private String dataCompra;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getIdIngresso() {
        return idIngresso;
    }
    public void setIdIngresso(String idIngresso) {
        this.idIngresso = idIngresso;
    }
    public String getIdFestival() {
        return idFestival;
    }
    public void setIdFestival(String idFestival) {
        this.idFestival = idFestival;
    }
    public String getDataCompra() {
        return dataCompra;
    }
    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
    public Compra(String id, String idUsuario, String idIngresso, String idFestival, String dataCompra) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idIngresso = idIngresso;
        this.idFestival = idFestival;
        this.dataCompra = dataCompra;
    }
    @Override
    public String toString() {
        return "Compra [id=" + id + ", idUsuario=" + idUsuario + ", idIngresso=" + idIngresso + ", idFestival="
                + idFestival + ", dataCompra=" + dataCompra + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
        result = prime * result + ((idIngresso == null) ? 0 : idIngresso.hashCode());
        result = prime * result + ((idFestival == null) ? 0 : idFestival.hashCode());
        result = prime * result + ((dataCompra == null) ? 0 : dataCompra.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Compra other = (Compra) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (idUsuario == null) {
            if (other.idUsuario != null)
                return false;
        } else if (!idUsuario.equals(other.idUsuario))
            return false;
        if (idIngresso == null) {
            if (other.idIngresso != null)
                return false;
        } else if (!idIngresso.equals(other.idIngresso))
            return false;
        if (idFestival == null) {
            if (other.idFestival != null)
                return false;
        } else if (!idFestival.equals(other.idFestival))
            return false;
        if (dataCompra == null) {
            if (other.dataCompra != null)
                return false;
        } else if (!dataCompra.equals(other.dataCompra))
            return false;
        return true;
    }

    

}    
   