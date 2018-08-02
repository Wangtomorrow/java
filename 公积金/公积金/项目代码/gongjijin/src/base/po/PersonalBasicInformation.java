package base.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;


/**
 * 个人基本信息表，用于存储个人公积金的基本信息 
 */
@Entity
@Table(name = "personalbasicinformation")
public class PersonalBasicInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String accnum;
	@Column
	@IndexColumn(name = "unitaccnum")
	private String unitaccnum;
	@Column
	private String opendate;
	@Column
	private String balance;
	@Column
	private String peraccstate;
	@Column
	private double basenumber;
	@Column
	private double unitprop;
	@Column
	private double indiprop;
	@Column
	private String lastpaydate;
	@Column
	private double unitmonpaysum;
	@Column
	private double permonpaysum;
	@Column
	private double ypayamt;
	@Column
	private double ydrawamt;
	@Column
	private double yinterestbal;
	@Column
	private String instcode;
	@Column
	private String op;
	@Column
	private String remark;

	public String getAccnum() {
		return accnum;
	}

	public void setAccnum(String accnum) {
		this.accnum = accnum;
	}

	public String getUnitaccnum() {
		return unitaccnum;
	}

	public void setUnitaccnum(String unitaccnum) {
		this.unitaccnum = unitaccnum;
	}

	public String getOpendate() {
		return opendate;
	}

	public void setOpendate(String opendate) {
		this.opendate = opendate;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getPeraccstate() {
		return peraccstate;
	}

	public void setPeraccstate(String peraccstate) {
		this.peraccstate = peraccstate;
	}

	public double getBasenumber() {
		return basenumber;
	}

	public void setBasenumber(double basenumber) {
		this.basenumber = basenumber;
	}

	public double getUnitprop() {
		return unitprop;
	}

	public void setUnitprop(double unitprop) {
		this.unitprop = unitprop;
	}

	public double getIndiprop() {
		return indiprop;
	}

	public void setIndiprop(double indiprop) {
		this.indiprop = indiprop;
	}

	public String getLastpaydate() {
		return lastpaydate;
	}

	public void setLastpaydate(String lastpaydate) {
		this.lastpaydate = lastpaydate;
	}

	public double getUnitmonpaysum() {
		return unitmonpaysum;
	}

	public void setUnitmonpaysum(double unitmonpaysum) {
		this.unitmonpaysum = unitmonpaysum;
	}

	public double getPermonpaysum() {
		return permonpaysum;
	}

	public void setPermonpaysum(double permonpaysum) {
		this.permonpaysum = permonpaysum;
	}

	public double getYpayamt() {
		return ypayamt;
	}

	public void setYpayamt(double ypayamt) {
		this.ypayamt = ypayamt;
	}

	public double getYdrawamt() {
		return ydrawamt;
	}

	public void setYdrawamt(double ydrawamt) {
		this.ydrawamt = ydrawamt;
	}

	public double getYinterestbal() {
		return yinterestbal;
	}

	public void setYinterestbal(double yinterestbal) {
		this.yinterestbal = yinterestbal;
	}

	public String getInstcode() {
		return instcode;
	}

	public void setInstcode(String instcode) {
		this.instcode = instcode;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
