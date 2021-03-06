/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;

/** <summary>
 * The Reference resource retrieves collections of standards the Mozu system currently supports. This includes content locales, top-level domains, units of measure, countries, currencies, time zones, and shipping or billing address schemas.
 * </summary>
 */
public class ReferenceDataResource {
	
	/**
	 * Retrieves a specific address schema based on the country code provided. This operation allows the creation of custom shipping and billing address fields.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	AddressSchema addressSchema = referencedata.GetAddressSchema();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.reference.AddressSchema
	 * @see com.mozu.api.contracts.reference.AddressSchema
	 */
	public com.mozu.api.contracts.reference.AddressSchema getAddressSchema() throws Exception
	{
		return getAddressSchema( null);
	}

	/**
	 * Retrieves a specific address schema based on the country code provided. This operation allows the creation of custom shipping and billing address fields.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	AddressSchema addressSchema = referencedata.GetAddressSchema( countryCode);
	 * </code></pre></p>
	 * @param countryCode The 2-letter geographic code representing the country for the physical or mailing address. Currently limited to the US.
	 * @return com.mozu.api.contracts.reference.AddressSchema
	 * @see com.mozu.api.contracts.reference.AddressSchema
	 */
	public com.mozu.api.contracts.reference.AddressSchema getAddressSchema(String countryCode) throws Exception
	{
		MozuClient<com.mozu.api.contracts.reference.AddressSchema> client = com.mozu.api.clients.platform.ReferenceDataClient.getAddressSchemaClient( countryCode);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the entire list of address schemas that the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	AddressSchemaCollection addressSchemaCollection = referencedata.GetAddressSchemas();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.reference.AddressSchemaCollection
	 * @see com.mozu.api.contracts.reference.AddressSchemaCollection
	 */
	public com.mozu.api.contracts.reference.AddressSchemaCollection getAddressSchemas() throws Exception
	{
		MozuClient<com.mozu.api.contracts.reference.AddressSchemaCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getAddressSchemasClient();
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * ***Always private and should not be published.***
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	Behavior behavior = referencedata.GetBehavior( behaviorId);
	 * </code></pre></p>
	 * @param behaviorId ***Always private and should not be published.***
	 * @return com.mozu.api.contracts.core.Behavior
	 * @see com.mozu.api.contracts.core.Behavior
	 */
	public com.mozu.api.contracts.core.Behavior getBehavior(Integer behaviorId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.Behavior> client = com.mozu.api.clients.platform.ReferenceDataClient.getBehaviorClient( behaviorId);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * ***Always private and should not be published.***
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	BehaviorCategoryCollection behaviorCategoryCollection = referencedata.GetBehaviorCategories();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.core.BehaviorCategoryCollection
	 * @see com.mozu.api.contracts.core.BehaviorCategoryCollection
	 */
	public com.mozu.api.contracts.core.BehaviorCategoryCollection getBehaviorCategories() throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.BehaviorCategoryCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getBehaviorCategoriesClient();
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * ***Always private and should not be published.***
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	BehaviorCategory behaviorCategory = referencedata.GetBehaviorCategory( categoryId);
	 * </code></pre></p>
	 * @param categoryId ***Always private and should not be published.***
	 * @return com.mozu.api.contracts.core.BehaviorCategory
	 * @see com.mozu.api.contracts.core.BehaviorCategory
	 */
	public com.mozu.api.contracts.core.BehaviorCategory getBehaviorCategory(Integer categoryId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.BehaviorCategory> client = com.mozu.api.clients.platform.ReferenceDataClient.getBehaviorCategoryClient( categoryId);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * ***Always private and should not be published.***
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	BehaviorCollection behaviorCollection = referencedata.GetBehaviors();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.core.BehaviorCollection
	 * @see com.mozu.api.contracts.core.BehaviorCollection
	 */
	public com.mozu.api.contracts.core.BehaviorCollection getBehaviors() throws Exception
	{
		return getBehaviors( null);
	}

	/**
	 * ***Always private and should not be published.***
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	BehaviorCollection behaviorCollection = referencedata.GetBehaviors( userType);
	 * </code></pre></p>
	 * @param userType 
	 * @return com.mozu.api.contracts.core.BehaviorCollection
	 * @see com.mozu.api.contracts.core.BehaviorCollection
	 */
	public com.mozu.api.contracts.core.BehaviorCollection getBehaviors(String userType) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.BehaviorCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getBehaviorsClient( userType);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the list of content locales the system supports. Content locales indicate the language used and the country where the language is used.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	ContentLocaleCollection contentLocaleCollection = referencedata.GetContentLocales();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.reference.ContentLocaleCollection
	 * @see com.mozu.api.contracts.reference.ContentLocaleCollection
	 */
	public com.mozu.api.contracts.reference.ContentLocaleCollection getContentLocales() throws Exception
	{
		MozuClient<com.mozu.api.contracts.reference.ContentLocaleCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getContentLocalesClient();
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the entire list of countries that the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	CountryCollection countryCollection = referencedata.GetCountries();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.reference.CountryCollection
	 * @see com.mozu.api.contracts.reference.CountryCollection
	 */
	public com.mozu.api.contracts.reference.CountryCollection getCountries() throws Exception
	{
		MozuClient<com.mozu.api.contracts.reference.CountryCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getCountriesClient();
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the entire list of currencies that the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	CurrencyCollection currencyCollection = referencedata.GetCurrencies();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.reference.CurrencyCollection
	 * @see com.mozu.api.contracts.reference.CurrencyCollection
	 */
	public com.mozu.api.contracts.reference.CurrencyCollection getCurrencies() throws Exception
	{
		MozuClient<com.mozu.api.contracts.reference.CurrencyCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getCurrenciesClient();
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the entire list of time zones that the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	TimeZoneCollection timeZoneCollection = referencedata.GetTimeZones();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.reference.TimeZoneCollection
	 * @see com.mozu.api.contracts.reference.TimeZoneCollection
	 */
	public com.mozu.api.contracts.reference.TimeZoneCollection getTimeZones() throws Exception
	{
		MozuClient<com.mozu.api.contracts.reference.TimeZoneCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getTimeZonesClient();
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the entire list of top-level internet domains that the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	TopLevelDomainCollection topLevelDomainCollection = referencedata.GetTopLevelDomains();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.reference.TopLevelDomainCollection
	 * @see com.mozu.api.contracts.reference.TopLevelDomainCollection
	 */
	public com.mozu.api.contracts.reference.TopLevelDomainCollection getTopLevelDomains() throws Exception
	{
		MozuClient<com.mozu.api.contracts.reference.TopLevelDomainCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getTopLevelDomainsClient();
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves an array list of all units of measure the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	UnitOfMeasureCollection unitOfMeasureCollection = referencedata.GetUnitsOfMeasure();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.reference.UnitOfMeasureCollection
	 * @see com.mozu.api.contracts.reference.UnitOfMeasureCollection
	 */
	public com.mozu.api.contracts.reference.UnitOfMeasureCollection getUnitsOfMeasure() throws Exception
	{
		return getUnitsOfMeasure( null);
	}

	/**
	 * Retrieves an array list of all units of measure the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	UnitOfMeasureCollection unitOfMeasureCollection = referencedata.GetUnitsOfMeasure( filter);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @return com.mozu.api.contracts.reference.UnitOfMeasureCollection
	 * @see com.mozu.api.contracts.reference.UnitOfMeasureCollection
	 */
	public com.mozu.api.contracts.reference.UnitOfMeasureCollection getUnitsOfMeasure(String filter) throws Exception
	{
		MozuClient<com.mozu.api.contracts.reference.UnitOfMeasureCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getUnitsOfMeasureClient( filter);
		client.executeRequest();
		return client.getResult();

	}

}



