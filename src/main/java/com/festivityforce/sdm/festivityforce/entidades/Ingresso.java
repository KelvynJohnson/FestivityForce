package com.festivityforce.sdm.festivityforce.entidades;

public class Ingresso {

    private String id;
    private String idCompra;
    private String dataEvento;  
    private String valor;
    private String status;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getIdCompra() {
        return idCompra;
    }
    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }
    public String getDataEvento() {
        return dataEvento;
    }
    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Ingresso(String id, String idCompra, String dataEvento, String valor, String status) {
        this.id = id;
        this.idCompra = idCompra;
        this.dataEvento = dataEvento;
        this.valor = valor;
        this.status = status;
    }
    @Override
    public String toString() {
        return "Ingresso [id=" + id + ", idCompra=" + idCompra + ", dataEvento=" + dataEvento + ", valor=" + valor
                + ", status=" + status + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((idCompra == null) ? 0 : idCompra.hashCode());
        result = prime * result + ((dataEvento == null) ? 0 : dataEvento.hashCode());
        result = prime * result + ((valor == null) ? 0 : valor.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
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
        Ingresso other = (Ingresso) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (idCompra == null) {
            if (other.idCompra != null)
                return false;
        } else if (!idCompra.equals(other.idCompra))
            return false;
        if (dataEvento == null) {
            if (other.dataEvento != null)
                return false;
        } else if (!dataEvento.equals(other.dataEvento))
            return false;
        if (valor == null) {
            if (other.valor != null)
                return false;
        } else if (!valor.equals(other.valor))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        return true;
    }

    

    
    


}
    
    