package fx;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CurrencyConverter {
	

	    @RequestMapping("/convert")
	    public @ResponseBody ConversionResult convert(
	            @RequestParam(value="from", required=false, defaultValue="USD") String from,
	            @RequestParam(value="to", required=false, defaultValue="INR") String to,
	            @RequestParam(value="amount", required=true) BigDecimal amt
	            ) {
	    	
	    	System.out.println("Input:: from: "+from+" to: "+to+" Amount: "+amt);
	    	
	    	// TODO: validate Currency code Currency.getCurrencyCode()
	    	// FAKE IT TILL YOU MAKE IT!!
	    	BigDecimal convertedAmt = amt.multiply( new BigDecimal(63.53) );
	    	System.out.println("Converted Amount: "+convertedAmt);
	    	
	        return new ConversionResult(from, to, convertedAmt);
	    }

}
