package org.battlehack.login.model;


/**
 * Models a Person who registers.
 * @author bruce phillips
 *
 */
public class Person
{
    private String id;
    private String password;

    /**
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id �Z�b�g���� id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password �Z�b�g���� password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

    public String toString()
    {
        return "ID: " + getId() + " password:  " + getPassword();
    }
}
