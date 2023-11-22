package com.example.demo.DTO.Producto;
import jakarta.persistence.*; // for Spring Boot 3
//import javax.persistence.*; // for Spring Boot 2
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Entity
//@Getter
//@Setter
@Table(name="product")

//IMPORTANTE: NO DEJES DE COLOCAR LOS SETTER Y GETTERS, NI EL CONSTRUCTOR VACIO!; POR QUE NO CORRIA 
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "idproduct")
	private Long idproduct;
	
	@Column(name = "sname")
	private String sname; 
	
	@Column(name = "nprice")
	private double nprice = 0;

	public Producto(){}
	
	public Producto(String sname, double nprice)
	{
		this.sname = sname;
		this.nprice = nprice;
	}
	
	//Getters
	public Long getId()
	{
		return idproduct;
	}
	
	public String getName() {
		return sname;
	}
	
	public double getPrice() {
		return nprice;
	}
	
	//Setters
	public void setName(String sName) {
		this.sname = sName;
	}
	
	public void setPrice(Double nPrice) {
		this.nprice = nPrice;
	}
}
