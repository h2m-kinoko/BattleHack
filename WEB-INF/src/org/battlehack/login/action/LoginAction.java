/*
 * Function:  Struts2 Getting Started - form_processing_db
 * Ref.:      https://struts.apache.org/docs/processing-forms.html
 * Version    1.1  2015/06/12  T.Hayashi  Created from CheckoutAction of version 0
 */


package org.battlehack.login.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.interceptor.SessionAware;
import org.battlehack.login.model.Person;
import org.battlehack.nayami.model.Nayami;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;

	private Person personBean;

	private List<Nayami> nayamiList;

	/* Log */
	private Log log = LogFactory.getLog(this.getClass());

	public LoginAction() {
		nayamiList = new ArrayList<Nayami>();
		Nayami nayami1 = new Nayami("Jhon", "���{�̒�H���ɂ��������񂾂��ǁA���܂����|���Ă����܂���B", 1000, 5000);
		Nayami nayami2 = new Nayami("Angela", "�󌱕׋����ɖ����Ȃ�܂��B", 1000, 5000);
		Nayami nayami3 = new Nayami("�V���Y", "�ӌ�т̃��j���[���v�����܂���", 100, 500);
		nayamiList.add(nayami1);
		nayamiList.add(nayami2);
		nayamiList.add(nayami3);

		// TODO: Set in a session
//		Map nayamiList = new HashMap("", nayamiList);


		setSession(null);
	}

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
	 * @param personBean �Z�b�g���� personBean
	 */
	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}

	/**
	 * @return nayamiList
	 */
	public List<Nayami> getNayamiList() {
		return nayamiList;
	}

	/**
	 * @param nayamiList �Z�b�g���� nayamiList
	 */
	public void setNayamiList(List<Nayami> nayamiList) {
		this.nayamiList = nayamiList;
	}

	@SuppressWarnings("rawtypes")
	public void setSession(Map arg0) {

	}


}
