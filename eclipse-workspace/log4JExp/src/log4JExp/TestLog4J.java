package log4JExp;

import org.apache.log4j.Logger;

public class TestLog4J {

	static Logger log = org.apache.log4j.Logger.getLogger(TestLog4J.class); 
	public static void main(String[] args) {
		
		log.debug("This is Debug Log");
		log.info("This is Error Log");
		log.error("Error in a product");
		

	}

}
