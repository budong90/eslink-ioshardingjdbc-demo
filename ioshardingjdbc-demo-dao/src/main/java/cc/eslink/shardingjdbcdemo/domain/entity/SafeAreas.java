package cc.eslink.shardingjdbcdemo.domain.entity;

import cc.eslink.common.base.BaseDomain;

import javax.persistence.Table;
import java.util.Date;


/**
 * 安检片区
 *
 * @author zyk 
 */
@Table(name ="safe_areas")
public class SafeAreas extends BaseDomain {

	private static final long serialVersionUID = 1L;

	//=================================================

	/** 片区ID */
	private String areasId;

	/** 外部片区Id */
	private String outAreasId;

	/** 片区名称 */
	private String areasName;

	/** 租户ID */
	private String tenantId;

	/**  */
	private Integer state;

	/** 创建时间 */
	private Date createTime;

	/** 修改时间 */
	private Date modifyTime;

	//=================================================

	public void setAreasId(String areasId){
		this.areasId = areasId;
	}
	public String getAreasId(){
		return areasId;
	}
	public void setOutAreasId(String outAreasId){
		this.outAreasId = outAreasId;
	}
	public String getOutAreasId(){
		return outAreasId;
	}
	public void setAreasName(String areasName){
		this.areasName = areasName;
	}
	public String getAreasName(){
		return areasName;
	}
	public void setTenantId(String tenantId){
		this.tenantId = tenantId;
	}
	public String getTenantId(){
		return tenantId;
	}
	public void setState(Integer state){
		this.state = state;
	}
	public Integer getState(){
		return state;
	}
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
	public Date getCreateTime(){
		return createTime;
	}
	public void setModifyTime(Date modifyTime){
		this.modifyTime = modifyTime;
	}
	public Date getModifyTime(){
		return modifyTime;
	}
}
