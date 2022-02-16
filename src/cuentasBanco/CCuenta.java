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
     * @param cue N�mero de cuenta
     * @param sal Saldo disponible
     * @param tipo Inter�s a aplicar
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /**
     * M�todo por el que se devuelve el saldo disponible en la cuenta
     * @return Devuelve el saldo disponible en la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
	/**
	 * M�todo por el que se realiza la operaci�n de ingresar una cantidad de dinero en la cuenta, 
	 * incrementando as� el valor del saldo de la cuenta
	 * @param cantidad Par�metro que representa la cantidad de dinero a ingresar
	 * @exception Exception Se genera una excepci�n si la cantidad es negativa
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
	 * M�todo por el que se realiza la operaci�n de retirar una cantidad de dinero en la cuenta, 
	 * siempre que haya saldo disponible en la cuenta
	 * @param cantidad Par�metro que representa la cantidad de dinero a retirar
	 * @exception Exception Se genera una excepci�n si la cantidad es negativa o la cantidad mayor que el saldo
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
	 * M�todo por el que se obtiene una cadena de texto que representa al titular de la cuenta
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * M�todo por el que se fija el titular de la cuenta
	 * @param nombre Par�metro por el que se indica el titular de la cuenta
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * M�todo por el que se obtiene una cadena de texto que representa el n�mero de la cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * M�todo por el que se fija el n�mero de la cuenta
	 * @param cuenta Par�metro por el que se indica el n�mero de la cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * M�todo para obtener el dinero disponible en cuenta
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * M�todo por el que se fija la cantidad de dinero disponible en cuenta
	 * @param saldo Par�metro por el que se indica el n�mero de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * M�todo por el que se obtiene el porcentaje de intereses a aplicar
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}
	/**
	 * M�todo por el que se fija la cantidad de dinero disponible en cuenta
	 * @param tipoInteres Par�metro por el que se indica el porcentaje de intereses a aplicar
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
