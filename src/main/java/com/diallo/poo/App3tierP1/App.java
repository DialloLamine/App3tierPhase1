package com.diallo.poo.App3tierP1;

import org.springframework.boot.CommandLineRunner;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.diallo.poo.App3tierP1.Ui.IUi;



/**
 * Hello world!
 *
 */
//@SpringBootApplication
public class App implements CommandLineRunner
{
	private static IUi ui;

	public static void main( String[] args )
    {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springP1-config.xml"); // je n'arrive a resoudre ce problem de import 
		
		ui = (IUi) ctx.getBean("uiConsole");
		
        //Avant lancement du programme
		System.out.println( "Bonjour et bienvenue!" );
        
        //Lancement du programme
        ui.run();
        
        //Apr�s la fin du programme
        System.out.println("Merci d'avoir utilis� ce programme.");
    }

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}