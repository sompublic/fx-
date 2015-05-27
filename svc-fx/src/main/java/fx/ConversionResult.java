package fx;

import java.math.BigDecimal;

public class ConversionResult {
	
	private String from;
	private String to;
	private BigDecimal convertedAmount;
	
	public ConversionResult(String from, String to, BigDecimal convertedAmount) {
		this.from = from;
		this.to = to;
		this.convertedAmount = convertedAmount;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public BigDecimal getConvertedAmount() {
		return convertedAmount;
	}
	
	public String toString() {
		return "From: "+from+"| To:"+to+" | Amount: "+convertedAmount;
	}


}
