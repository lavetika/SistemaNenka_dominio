package dominio;

import dominio.Cliente;
import dominio.DetalleVenta;
import dominio.Empleado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-25T13:48:22")
@StaticMetamodel(Venta.class)
public class Venta_ extends EntityBase_ {

    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile SingularAttribute<Venta, Cliente> cliente;
    public static volatile SingularAttribute<Venta, Double> total;
    public static volatile SingularAttribute<Venta, Empleado> empleado;
    public static volatile ListAttribute<Venta, DetalleVenta> detallesVentas;

}