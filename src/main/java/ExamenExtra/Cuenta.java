/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenExtra;

/**
 *
 * @author DANIC
 */
public class Cuenta {
    private int SaldoDeCuenta;
    private int NumCuenta;
    private int NipCuenta;

    public void setSaldoDeCuenta(int SaldoDeCuenta) {
        this.SaldoDeCuenta = SaldoDeCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public void asignarNIP(int NipCuenta) {
        this.NipCuenta = NipCuenta;
    }
    
    public Cuenta(int SaldoDeCuenta, int NumCuenta, int NipCuenta){
        this.SaldoDeCuenta= SaldoDeCuenta;
        this.NumCuenta = NumCuenta;
        this.NipCuenta = NipCuenta;
    }

    public int getSaldoDeCuenta() {
        return SaldoDeCuenta;
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public int getNipCuenta() {
        return NipCuenta;
    }
    
    public int crear(){
        return 0;
    }
    
    public int deposito(){
        return 0;
    }
    public int retiro (){
        return 0;
    }
    public int buscar(){
        return 0;
    }
    public int cerrar(){
        return 0;
    }
    public int exit(){
        return 0;
    }
}
