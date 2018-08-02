package base.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 单位基本信息表，用于存储单位基本信息，可以进行增删改查等操作 
 */
@Entity
@Table(name = "unitbasicinformation")
public class UnitBasicInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String unitaccnum;
	@Column
	private String unitaccname;
	@Column
	private String unitaddr;
	@Column
	private String orgcode;
	@Column
	private String unitchar;
	@Column
	private String unitkind;
	@Column
	private String salarydate;
	@Column
	private String unitphone;
	@Column
	private String unitlinkman;
	@Column
	private String unitagentpapno;
	@Column
	private String accstate;
	@Column
	private double balance;
	@Column
	private double basenumber;
	@Column
	private double unitprop;
	@Column
	private double perprop;
	@Column
	private double unitpaysum;
	@Column
	private double perpaysum;
	@Column
	private int perssum;
	@Column
	private String lastpaydate;

	public String getUnitaccnum() {
		return unitaccnum;
	}

	public void setUnitaccnum(String unitaccnum) {
		this.unitaccnum = unitaccnum;
	}

	public String getUnitaccname() {
		return unitaccname;
	}

	public void setUnitaccname(String unitaccname) {
		this.unitaccname = unitaccname;
	}

	public String getUnitaddr() {
		return unitaddr;
	}

	public void setUnitaddr(String unitaddr) {
		this.unitaddr = unitaddr;
	}

	public String getOrgcode() {
		return orgcode;
	}

	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	public String getUnitchar() {
		return unitchar;
	}

	public void setUnitchar(String unitchar) {
		this.unitchar = unitchar;
	}

	public String getUnitkind() {
		return unitkind;
	}

	public void setUnitkind(String unitkind) {
		this.unitkind = unitkind;
	}

	public String getSalarydate() {
		return salarydate;
	}

	public void setSalarydate(String salarydate) {
		this.salarydate = salarydate;
	}

	public String getUnitphone() {
		return unitphone;
	}

	public void setUnitphone(String unitphone) {
		this.unitphone = unitphone;
	}

	public String getUnitlinkman() {
		return unitlinkman;
	}

	public void setUnitlinkman(String unitlinkman) {
		this.unitlinkman = unitlinkman;
	}

	public String getUnitagentpapno() {
		return unitagentpapno;
	}

	public void setUnitagentpapno(String unitagentpapno) {
		this.unitagentpapno = unitagentpapno;
	}

	public String getAccstate() {
		return accstate;
	}

	public void setAccstate(String accstate) {
		this.accstate = accstate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
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

	public double getPerprop() {
		return perprop;
	}

	public void setPerprop(double perprop) {
		this.perprop = perprop;
	}

	public double getUnitpaysum() {
		return unitpaysum;
	}

	public void setUnitpaysum(double unitpaysum) {
		this.unitpaysum = unitpaysum;
	}

	public double getPerpaysum() {
		return perpaysum;
	}

	public void setPerpaysum(double perpaysum) {
		this.perpaysum = perpaysum;
	}

	public int getPerssum() {
		return perssum;
	}

	public void setPerssum(int perssum) {
		this.perssum = perssum;
	}

	public String getLastpaydate() {
		return lastpaydate;
	}

	public void setLastpaydate(String lastpaydate) {
		this.lastpaydate = lastpaydate;
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

	public String getCreatdate() {
		return creatdate;
	}

	public void setCreatdate(String creatdate) {
		this.creatdate = creatdate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column
	private String instcode;
	@Column
	private String op;
	@Column
	private String creatdate;
	@Column
	private String remark;
}
