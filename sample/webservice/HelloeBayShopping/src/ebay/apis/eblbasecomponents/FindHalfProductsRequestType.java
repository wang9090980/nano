// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Searches Half.com for stock product information (stock description
 * and Item Specifics), such as information about a particular
 * kind of DVD or book. Also, retrieves up to 30 Half.com listings associated
 * with a product.
 * 
 */
@RootElement(name = "FindHalfProductsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class FindHalfProductsRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "IncludeSelector")
	@Order(value=0)
	public String includeSelector;	
	
	@Element(name = "AvailableItemsOnly")
	@Order(value=1)
	public Boolean availableItemsOnly;	
	
	@Element(name = "DomainName")
	@Order(value=2)
	public List<String> domainName;	
	
	@Element(name = "ProductID")
	@Order(value=3)
	public ProductIDType productID;	
	
	@Element(name = "QueryKeywords")
	@Order(value=4)
	public String queryKeywords;	
	
	@Element(name = "SellerID")
	@Order(value=5)
	public String sellerID;	
	
	@Element(name = "ProductSort")
	@Order(value=6)
	public ProductSortCodeType productSort;	
	
	@Element(name = "SortOrder")
	@Order(value=7)
	public SortOrderCodeType sortOrder;	
	
	@Element(name = "MaxEntries")
	@Order(value=8)
	public Integer maxEntries;	
	
	@Element(name = "PageNumber")
	@Order(value=9)
	public Integer pageNumber;	
	
    
}