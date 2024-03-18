package validator;

public class Validation {
	
	private String lineEnd;
	
	public Validation() {
		this.lineEnd = "\n";
	}
	
	public Validation(String lineEnd) {
		
		this.lineEnd = lineEnd;
	}
	
	public String isPresent(String value, String name) {
		
		String message = "";
		
		if(value.isEmpty()) {
			
			message = name + " is required" + lineEnd;
		}
		
		return message;
	}
	
	public String isDouble(String value, String name) {
		
		String message = "";
		
		try {
			Double.parseDouble(value);
		} catch (NumberFormatException e) {
			

			message = e.getMessage() +" " +name+ " must be a number" + lineEnd;
		}
		
		return message;
	}
	
	public String isInteger(String value, String name) {
		
		String message = "";
		
		try {
			Integer.parseInt(value);
		} catch (NumberFormatException e) {
			

			message = e.getMessage() +" " +name+ " must be a number" + lineEnd;
		}
		
		return message;
	}

}
