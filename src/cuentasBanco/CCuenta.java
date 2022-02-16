package cuentasBanco;
/**
 * Clase en la que se gestionan las operaciones diarias de movimiento de dinero
 * @author Entornos de desarrollo
 * @version 1.0 
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    /**
     * Constructor de la clase CCuenta
     */
    public CCuenta()
    {
    }
    /**
     * Constructor de la clase CCuenta
     * @param nom Titular  de la cuenta
     * @param cue Número de cuenta
     * @param sal Saldo disponible
     * @param tipo Interés a aplicar
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /**
     * Método por el que se devuelve el saldo disponible en la cuenta
     * @return Devuelve el saldo disponible en la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
	/**
	 * Método por el que se realiza la operación de ingresar una cantidad de dinero en la cuenta, 
	 * incrementando así el valor del saldo de la cuenta
	 * @param cantidad Parámetro que representa la cantidad de dinero a ingresar
	 * @exception Exception Se genera una excepción si la cantidad es negativa
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
	 * Método por el que se realiza la operación de retirar una cantidad de dinero en la cuenta, 
	 * siempre que haya saldo disponible en la cuenta
	 * @param cantidad Parámetro que representa la cantidad de dinero a retirar
	 * @exception Exception Se genera una excepción si la cantidad es negativa o la cantidad mayor que el saldo
	 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
	/**
	 * Método por el que se obtiene una cadena de texto que representa al titular de la cuenta
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método por el que se fija el titular de la cuenta
	 * @param nombre Parámetro por el que se indica el titular de la cuenta
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Método por el que se obtiene una cadena de texto que representa el número de la cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * Método por el que se fija el número de la cuenta
	 * @param cuenta Parámetro por el que se indica el número de la cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * Método para obtener el dinero disponible en cuenta
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Método por el que se fija la cantidad de dinero disponible en cuenta
	 * @param saldo Parámetro por el que se indica el número de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * Método por el que se obtiene el porcentaje de intereses a aplicar
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}
	/**
	 * Método por el que se fija la cantidad de dinero disponible en cuenta
	 * @param tipoInteres Parámetro por el que se indica el porcentaje de intereses a aplicar
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
