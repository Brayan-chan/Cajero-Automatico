package models;

import java.util.ArrayList;

/**
 *
 * @author chanp
 */
public class Cliente {
    public static ArrayList<Cliente> clientes = new ArrayList<>();
    
    private String nombre;
    private String numeroCuenta;
    private Double saldo;

    public Cliente() {
    }

    public Cliente(String nombre, String numeroCuenta, Double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + '}';
    }
    
    public static void ingresarSaldo(int recNo, Double importe){
        Double saldoActual = clientes.get(recNo).getSaldo();
        
        clientes.get(recNo).setSaldo(importe+saldoActual);
    }
}
