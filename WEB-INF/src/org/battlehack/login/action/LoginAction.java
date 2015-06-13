/*
 * Function:  Struts2 Getting Started - form_processing_db
 * Ref.:      https://struts.apache.org/docs/processing-forms.html
 * Version    1.1  2015/06/12  T.Hayashi  Created from CheckoutAction of version 0
 */


package org.battlehack.login.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.battlehack.login.model.Person;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Person personBean;

	/* Log */
	private Log log = LogFactory.getLog(this.getClass());

	public String execute() throws Exception {

		log.info("[LoginAction.execute()]");

		return SUCCESS;
	}

	/**
	 * @return personBean
	 */
	public Person getPersonBean() {
		return personBean;
	}

	/**
	 * @param personBean ƒZƒbƒg‚·‚é personBean
	 */
	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}

}
