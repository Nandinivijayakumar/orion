package com.orion;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 577801
 * @since 4/7/2017
 *        {@code  : Created a spring Boot project to perform copying of file with the help
 *        of apache camel jar}
 * 
 * 
 **/
@SpringBootApplication
public class CopyFile {
	/**
	 * 
	 * Inside main method the source to destination copy of file action is
	 * Performed using Apache Camel.
	 * 
	 */
	public static void main(final String[] args) {
		// final long durationMs =
		// extractDurationMsFromCommandLineArgs(arguments);
		SpringApplication.run(CopyFile.class, args);

		final CamelContext camelContext = new DefaultCamelContext();
		try {
			camelContext.addRoutes(new RouteBuilder() {
				@Override
				public void configure() throws Exception {
					System.out.println("*****************Entered here**********************");
					from("file:D:\\datafiles\\input?noop=true").to("file:D:\\datafiles\\output");
					System.out.println("*****************Exited from here*******************");
				}
			});
			camelContext.start();
			Thread.sleep(100000);
			camelContext.stop();
			System.out.println("Executed this line");
		} catch (Exception camelException) {

			System.out.println("****************************Exception occured*****************");
		}
	}

}
