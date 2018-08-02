package base.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="systemparameter")
public class SystemParameter {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String seqname;
	@Column
	private int seq;
	public String getSeqname() {
		return seqname;
	}
	public void setSeqname(String seqname) {
		this.seqname = seqname;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getMaxseq() {
		return maxseq;
	}
	public void setMaxseq(int maxseq) {
		this.maxseq = maxseq;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getFreeusel() {
		return freeusel;
	}
	public void setFreeusel(String freeusel) {
		this.freeusel = freeusel;
	}
	@Column
	private int maxseq;
	@Column
	private String desc;
	@Column
	private String freeusel;
}
