package org.wicketparts.combo;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: chaame
 * Date: 11/11/05
 * Time: 14:20
 * To change this template use File | Settings | File Templates.
 */
public class ChoiceElement implements Serializable {
	private String id;
	private String value;

	public ChoiceElement(String id, String value) {
		this.id = id;
		this.value = value;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
