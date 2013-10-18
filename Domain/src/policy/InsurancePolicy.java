package policy;

import org.eclipse.jdt.annotation.NonNull;

/**
 * An insurance policy.
 */
public class InsurancePolicy {
	private double value;
	private String description;
	
	/**
	 * Constructs an instance of an insurance policy. 
	 * @param value Required non-null value.
	 */
	public InsurancePolicy(double value, @NonNull String description)
	{
		this.value = value;
		this.setDescription(description);
	}
	
	/**
	 * 
	 * @param valueToAdd The value to add
	 */
	public void add(double valueToAdd)
	{
		this.value += valueToAdd;
	}

	/**
	 * 
	 * @return The value
	 */
	public double getValue()
	{
		return value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
