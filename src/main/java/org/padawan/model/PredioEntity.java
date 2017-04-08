package org.padawan.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NamedStoredProcedureQuery(
        name = "predioEmerson",
        procedureName = "dbo.cantPredio",
        resultClasses = PredioEntity.class,
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Integer.class, name = "iOpSp"),
                @StoredProcedureParameter(mode = ParameterMode.IN, type = Date.class, name = "fecha"),
                @StoredProcedureParameter(mode = ParameterMode.OUT, type = Double.class, name = "sum")
        }
)
public class PredioEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column
    private int periodo;

    @Column
    private int cantidad;

    @Override
    public String toString() {
        String result = getClass().getSimpleName() + " ";
        if (id != null)
            result += "id: " + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PredioEntity)) {
            return false;
        }
        PredioEntity other = (PredioEntity) obj;
        if (id != null) {
            if (!id.equals(other.id)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}