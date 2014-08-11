/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springexamleannabe1;

import Data.Mahasiswa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author root
 */
public class SpringExamleAnnabe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "Spring-Mahasiswa.xml" });
 
		      Mahasiswa mahasiswa = (Mahasiswa) appContext.getBean("dataMahasiswa");
 
		System.out.println("*************************");
		mahasiswa.cetakNama();
		System.out.println("*************************");
		mahasiswa.cetakNim();
		System.out.println("*************************");
		try {
			
		} catch (Exception e) {
 
		}
    }
}
