package org.wicketparts;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.wicketparts.combo.dhx.DhxComboBoxPage;
import org.wicketparts.combo.dojo.DojoComboBoxPage;
import org.wicketparts.combo.extjs.ExtJsComboBoxPage;
import org.wicketparts.combo.jquery.JQueryComboBoxPage;
import org.wicketparts.combo.jquery2.TextComboBoxPage;

/**
 * Created by IntelliJ IDEA.
 * User: chaame
 * Date: 11/11/03
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
public class TestPage extends WebPage {
	public TestPage() {
		add(new Link<Void>("dhx"){
			@Override
			public void onClick() {
				setResponsePage(DhxComboBoxPage.class);
			}
		});
		add(new Link<Void>("dojo"){
			@Override
			public void onClick() {
				setResponsePage(DojoComboBoxPage.class);
			}
		});
		add(new Link<Void>("ext"){
			@Override
			public void onClick() {
				setResponsePage(ExtJsComboBoxPage.class);
			}
		});
		add(new Link<Void>("jq"){
			@Override
			public void onClick() {
				setResponsePage(JQueryComboBoxPage.class);
			}
		});
		add(new Link<Void>("jq2"){
			@Override
			public void onClick() {
				setResponsePage(TextComboBoxPage.class);
			}
		});
	}
}
