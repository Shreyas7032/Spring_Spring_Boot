package com.Lombok;
/*
 * 
 * This project inform you about the Project Lombok dependancy...
 * we need to add project Lombok dependancy
 * it will get
 * 1.setters  2.getters  2.noargsconstructor  3.allargsconstructor  4.toString  5.EqualsAndHashCode methods
 * But Their combination is @Data Annotation but it not supports all args constructor or we take @allargsconstructor then  no argsconstructor not giving
 * 
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Demo {
	
	private int roll;
	private String name;
	private String addr;
	private String Last;
	
	public static void main(String[] args) {
		Demo d=new Demo();
		d.setAddr("Shreyas");
		d.getAddr();
		d.toString();
	}
	
	

}
