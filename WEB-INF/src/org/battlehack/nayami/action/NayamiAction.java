/*
 * Function:  Struts2 Getting Started - form_processing_db
 * Ref.:      https://struts.apache.org/docs/processing-forms.html
 * Version    1.1  2015/06/12  T.Hayashi  Created from CheckoutAction of version 0
 */


package org.battlehack.nayami.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

public class NayamiAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	/* Log */
	private Log log = LogFactory.getLog(this.getClass());

	public String execute() throws Exception {

		log.info("[LoginAction.execute()]");

		return SUCCESS;
	}

}
