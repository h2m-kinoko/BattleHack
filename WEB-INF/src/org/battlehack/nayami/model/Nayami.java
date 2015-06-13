package org.battlehack.nayami.model;


/**
 * Models a Nayami user has.
 * @author bruce phillips
 *
 */
public class Nayami
{
    private String name;
    private String nayami;
    private int achievedMoney;
	private int targetMoney;

	public Nayami(String name, String nayami, int achievedMoney, int targetMoney){
		this.name = name;
		this.nayami = nayami;
		this.achievedMoney = achievedMoney;
		this.targetMoney = targetMoney;
	}

    /**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return nayami
	 */
	public String getNayami() {
		return nayami;
	}

	/**
	 * @param nayami セットする nayami
	 */
	public void setNayami(String nayami) {
		this.nayami = nayami;
	}

	/**
	 * @return achievedMoney
	 */
	public int getAchievedMoney() {
		return achievedMoney;
	}

	/**
	 * @param achievedMoney セットする achievedMoney
	 */
	public void setAchievedMoney(int achievedMoney) {
		this.achievedMoney = achievedMoney;
	}

	/**
	 * @return targetMoney
	 */
	public int getTargetMoney() {
		return targetMoney;
	}

	/**
	 * @param targetMoney セットする targetMoney
	 */
	public void setTargetMoney(int targetMoney) {
		this.targetMoney = targetMoney;
	}


    public String toString()
    {
        return "name: " + getName() + " nayami:  " + getNayami() + " 目標金額: " + getTargetMoney() + " 達成金額: " + getAchievedMoney() ;
    }
}
