package org.wicketparts;

import org.apache.wicket.SharedResources;
import org.apache.wicket.protocol.http.WebApplication;
import org.wicketparts.combo.dhx.DhxComboBoxPage;
import org.wicketparts.combo.dojo.DojoComboBoxPage;
import org.wicketparts.combo.extjs.ExtJsComboBoxPage;
import org.wicketparts.combo.jquery.JQueryComboBoxPage;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 * 
 * @see org.wicketparts.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{    
    /**
     * Constructor
     */
	public WicketApplication()
	{
	}
	
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	public Class<TestPage> getHomePage()
	{
		return TestPage.class;
	}

	@Override
	public void init() {
		//
		SharedResources resources = getSharedResources();
		resources.putClassAlias(DhxComboBoxPage.class, "combodhx");
		resources.putClassAlias(DojoComboBoxPage.class, "combodojo");
		resources.putClassAlias(ExtJsComboBoxPage.class, "comboextjs");
		resources.putClassAlias(JQueryComboBoxPage.class, "combojquery");
	}

}
