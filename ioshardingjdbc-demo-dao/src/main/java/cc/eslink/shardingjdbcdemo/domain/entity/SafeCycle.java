package cc.eslink.shardingjdbcdemo.domain.entity;

import cc.eslink.common.base.BaseDomain;

import javax.persistence.Table;
import java.util.Date;


/**
 * 安检周期
 *
 * @author zyk 
 */
@Table(name ="safe_cycle")
public class SafeCycle extends BaseDomain {

	private static final long serialVersionUID = 1L;

	//=================================================

	/** 周期ID */
	private String cycleId;

	/**  */
	private String newCycleId;

	/** 周期配置ID */
	private String cycleConfigId;

	/** 周期描述 */
	private String cycleName;

	/** 0-全部，1-居民户，2-商业户 */
	private String userType;

	/** 周期所在年份 */
	private String safecheckYear;

	/** 开始年 */
	private String startYear;

	/** 开始月份 */
	private String startMonth;

	/** 结束年 */
	private String endYear;

	/** 开始时间 */
	private Date startTime;

	/** 结束月份 */
	private String endMonth;

	/** 结束时间 */
	private Date endTime;

	/** 租户ID */
	private String tenantId;

	/** 创建时间 */
	private Date createTime;

	/** 修改时间 */
	private Date modifyTime;

	//=================================================

	public void setCycleId(String cycleId){
		this.cycleId = cycleId;
	}
	public String getCycleId(){
		return cycleId;
	}
	public void setNewCycleId(String newCycleId){
		this.newCycleId = newCycleId;
	}
	public String getNewCycleId(){
		return newCycleId;
	}
	public void setCycleConfigId(String cycleConfigId){
		this.cycleConfigId = cycleConfigId;
	}
	public String getCycleConfigId(){
		return cycleConfigId;
	}
	public void setCycleName(String cycleName){
		this.cycleName = cycleName;
	}
	public String getCycleName(){
		return cycleName;
	}
	public void setUserType(String userType){
		this.userType = userType;
	}
	public String getUserType(){
		return userType;
	}
	public void setSafecheckYear(String safecheckYear){
		this.safecheckYear = safecheckYear;
	}
	public String getSafecheckYear(){
		return safecheckYear;
	}
	public void setStartYear(String startYear){
		this.startYear = startYear;
	}
	public String getStartYear(){
		return startYear;
	}
	public void setStartMonth(String startMonth){
		this.startMonth = startMonth;
	}
	public String getStartMonth(){
		return startMonth;
	}
	public void setEndYear(String endYear){
		this.endYear = endYear;
	}
	public String getEndYear(){
		return endYear;
	}
	public void setStartTime(Date startTime){
		this.startTime = startTime;
	}
	public Date getStartTime(){
		return startTime;
	}
	public void setEndMonth(String endMonth){
		this.endMonth = endMonth;
	}
	public String getEndMonth(){
		return endMonth;
	}
	public void setEndTime(Date endTime){
		this.endTime = endTime;
	}
	public Date getEndTime(){
		return endTime;
	}
	public void setTenantId(String tenantId){
		this.tenantId = tenantId;
	}
	public String getTenantId(){
		return tenantId;
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
