package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Sin Inversion of Control
		//Creacion de objetos
		Empleado jefe = new JefeEmpleado();
		Empleado secretario = new SecretarioEmpleado();
		Empleado director = new DirectorEmpleado();
		
		//Uso de objetos
		System.out.println(jefe.getTareas());
		System.out.println(secretario.getTareas());
		System.out.println(director.getTareas());
		*/
		
		//Con inversion of control
		
		//Creamos el contexto
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Creacion de objetos
		Empleado jefe = contexto.getBean("jefe", Empleado.class);
		Empleado secretario = contexto.getBean("secretario", Empleado.class);
		Empleado director = contexto.getBean("director", Empleado.class);
		
		//Uso de objetos
		System.out.println(jefe.getTareas());
		System.out.println(secretario.getTareas());
		System.out.println(director.getTareas());
		
		
		contexto.close();
		

	}

}
