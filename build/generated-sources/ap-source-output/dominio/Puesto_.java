package dominio;

import dominio.Empleado;
import enums.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-12T00:24:29")
@StaticMetamodel(Puesto.class)
public class Puesto_ extends EntityBase_ {

    public static volatile ListAttribute<Puesto, Empleado> empleados;
    public static volatile SingularAttribute<Puesto, Rol> rol;

}