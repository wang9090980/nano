// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the <b>SellereBayPaymentProcessConsent</b> container, which is returned to all DE and
 * AT sellers, and consists of details of the seller's account status regarding the new eBay payment process.
 * 
 */
public class SellereBayPaymentProcessConsentCodeType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PayoutMethodSet")
	@Order(value=0)
	public Boolean payoutMethodSet;	
	
	@Element(name = "PayoutMethod")
	@Order(value=1)
	public PayoutMethodType payoutMethod;	
	
	@Element(name = "UserAgreementInfo")
	@Order(value=2)
	public List<UserAgreementInfoType> userAgreementInfo;	
	
	@AnyElement
	@Order(value=3)
	public List<Object> any;	
	
    
}