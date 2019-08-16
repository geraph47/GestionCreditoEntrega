package com.myspace.proyectogestioncredito.implementacion;

import com.myspace.proyectogestioncredito.interfaz.ICalculoCredito;
import com.myspace.proyectogestioncredito.modelo.bo.DescripcionSoliCred;

public class ServCalculoCredito implements ICalculoCredito {


public java.lang.Integer totalEndeudamiento(DescripcionSoliCred credito){
    
		
		java.lang.Integer ganancia = credito.getSalario()-credito.getGastos();
		java.lang.Integer valor = ((ganancia*25)/100);
		java.lang.Integer endeudamiento = (valor/credito.getTiempoTotalAmort());
		
	
		
	
		
		System.out.println("endeu  "+ endeudamiento);
	

		return endeudamiento;
}





}