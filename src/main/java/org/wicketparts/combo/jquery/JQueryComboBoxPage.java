package org.wicketparts.combo.jquery;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.HiddenField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.wicketparts.TestPage;
import org.wicketparts.combo.ChoiceElement;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: chaame
 * Date: 11/11/03
 * Time: 22:53
 * To change this template use File | Settings | File Templates.
 */
public class JQueryComboBoxPage extends WebPage {
	private String selectedId;
	private String selectedValue;
	private String manualInputValue;

	public JQueryComboBoxPage() {
		add(new Link<Void>("top"){
			@Override
			public void onClick() {
				setResponsePage(TestPage.class);
			}
		});

		List<ChoiceElement> choices = Arrays.asList(
				new ChoiceElement("test1", "てすと１"),
				new ChoiceElement("test2", "テスト２"),
				new ChoiceElement("test3", "TEST3")
		);
		final DropDownChoice<ChoiceElement> combo = new DropDownChoice<ChoiceElement>(
						"combo", new Model<ChoiceElement>(), choices, new ChoiceRenderer<ChoiceElement>("value", "id"));
		Form<Void> form = new Form<Void>("form") {
			@Override
			protected void onSubmit() {
				ChoiceElement elem = combo.getModelObject();
				if (elem != null) {
					// 選択した値の場合
					selectedId = elem.getId();
					selectedValue = elem.getValue();
					manualInputValue = "";
				} else {
					// 自分で書き換えた場合
					selectedId = manualInputValue;
					selectedValue = manualInputValue;
				}
			}
		};
		form.add(combo);
		form.add(new HiddenField<String>("manualInputValue", new PropertyModel<String>(this, "manualInputValue")));
		add(form);

		add(new Label("selectedId", new PropertyModel<String>(this, "selectedId")));
		add(new Label("selectedValue", new PropertyModel<String>(this, "selectedValue")));
	}
}
