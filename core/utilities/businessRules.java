package core.utilities;

public class businessRules implements resultDao {
	
	public finalResult run(finalResult ...args) {
		for (var param : args) {
			
			if (!param.success) {
				return param;
			}
		}
		return null;
		
	}
	
}
