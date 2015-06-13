/*
 * Function:  Struts2 Getting Started - form_processing_db
 * Ref.:      https://struts.apache.org/docs/processing-forms.html
 * Version    1.1  2015/06/12  T.Hayashi  Created from CheckoutAction of version 0
 */


package org.battlehack.purchase.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.braintreegateway.BraintreeGateway;
//import com.braintreegateway.ClientTokenRequest;
import com.braintreegateway.Environment;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	/* Log */
	private Log log = LogFactory.getLog(this.getClass());

	// merchant ID, public key and private key are of sand-box.
    private static BraintreeGateway gateway = new BraintreeGateway(
            Environment.SANDBOX,
            "66kwgny58y9r3r2k",
            "y723g5fnjnc5qms2",
            "15cc2ecbd404c2a6ca3a58b5f4cf377a"
        );

	private String clientToken;

	public String execute() throws Exception {

		log.info("[PurchaseAction.execute()]");
		this.post();

		return SUCCESS;
	}


	private void post() {
		  this.clientToken = gateway.clientToken().generate();

		  // This is for case with an existing customer
//		  String aCustomerId = "12345";
//		  ClientTokenRequest clientTokenRequest = new ClientTokenRequest()
//		      .customerId(aCustomerId );
//		  String clientTokenGenerated =  gateway.clientToken().generate(clientTokenRequest);
//		  System.out.println("[CheckoutAction.post:L86]clientTokenGenerated = " + clientTokenGenerated);

	}


	/**
	 * @return clientToken
	 */
	public String getClientToken() {
		return clientToken;
	}

	/**
	 * @param clientToken �Z�b�g���� clientToken
	 */
	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
	}


}
