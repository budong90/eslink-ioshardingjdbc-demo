package cc.eslink.shardingjdbcdemo.domain.entity;

import cc.eslink.common.base.BaseDomain;

import javax.persistence.Table;
import java.util.Date;
import java.util.List;


/**
 * 用户
 *
 * @author zyk 
 */
@Table(name ="biz_user")
public class BizUser extends BaseDomain {

	private static final long serialVersionUID = 1L;

	//=================================================

	/** 用户ID */
	private String userId;

	/** 外部用户ID */
	private String outUserId;

	/** 用户号 */
	private String userNo;

	/** 用户类型 (1-居民用户，2-非居民用户) */
	private String userType;

	/** 用户名称 */
	private String userName;

	/** 性别 */
	private String gender;

	/** 出生日期 */
	private Date birthDate;

	/** 身份证号 */
	private String certificateNo;

	/** 证件类型 */
	private String certificateType;

	/** 联系地址 */
	private String contactAddress;

	/** 手机 */
	private String mobile;

	/** 电话 */
	private String telephone;

	/** 单位名称 */
	private String unitName;

	/** 单位性质 (1-市政，2-学校，3-工厂，4-酒店，5-医院，6-餐饮) */
	private String unitType;

	/** 单位描述 */
	private String unitDesc;

	/** 联系人 */
	private String contactUser;

	/** 邮件 */
	private String mailbox;

	/** 拉黑标识-1-黑名单，0-白名单 */
	private String blackFlag;

	/** 其他信息 */
	private String otherInfo;

	/** 标签，多个 用逗号隔开 */
	private String tagIds;

	/** 是否是新用户 0-旧用户，1-新用户 */
	private Integer newUserFlag;

	/** 状态 （1-正常，2-禁用，3-注销） */
	private Integer state;

	/** 上次安检年份 */
	private Integer lastSafechcekYear;

	/** 上次安检时间 */
	private Date lastSafecheckTime;

	/** 租户ID */
	private String tenantId;

	/** 创建时间 */
	private Date createTime;

	/** 修改时间 */
	private Date modifyTime;

	//=================================================

	private List<BizAddress> addressList;

	public List<BizAddress> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<BizAddress> addressList) {
		this.addressList = addressList;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}
	public String getUserId(){
		return userId;
	}
	public void setOutUserId(String outUserId){
		this.outUserId = outUserId;
	}
	public String getOutUserId(){
		return outUserId;
	}
	public void setUserNo(String userNo){
		this.userNo = userNo;
	}
	public String getUserNo(){
		return userNo;
	}
	public void setUserType(String userType){
		this.userType = userType;
	}
	public String getUserType(){
		return userType;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getUserName(){
		return userName;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}
	public void setBirthDate(Date birthDate){
		this.birthDate = birthDate;
	}
	public Date getBirthDate(){
		return birthDate;
	}
	public void setCertificateNo(String certificateNo){
		this.certificateNo = certificateNo;
	}
	public String getCertificateNo(){
		return certificateNo;
	}
	public void setCertificateType(String certificateType){
		this.certificateType = certificateType;
	}
	public String getCertificateType(){
		return certificateType;
	}
	public void setContactAddress(String contactAddress){
		this.contactAddress = contactAddress;
	}
	public String getContactAddress(){
		return contactAddress;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getMobile(){
		return mobile;
	}
	public void setTelephone(String telephone){
		this.telephone = telephone;
	}
	public String getTelephone(){
		return telephone;
	}
	public void setUnitName(String unitName){
		this.unitName = unitName;
	}
	public String getUnitName(){
		return unitName;
	}
	public void setUnitType(String unitType){
		this.unitType = unitType;
	}
	public String getUnitType(){
		return unitType;
	}
	public void setUnitDesc(String unitDesc){
		this.unitDesc = unitDesc;
	}
	public String getUnitDesc(){
		return unitDesc;
	}
	public void setContactUser(String contactUser){
		this.contactUser = contactUser;
	}
	public String getContactUser(){
		return contactUser;
	}
	public void setMailbox(String mailbox){
		this.mailbox = mailbox;
	}
	public String getMailbox(){
		return mailbox;
	}
	public void setBlackFlag(String blackFlag){
		this.blackFlag = blackFlag;
	}
	public String getBlackFlag(){
		return blackFlag;
	}
	public void setOtherInfo(String otherInfo){
		this.otherInfo = otherInfo;
	}
	public String getOtherInfo(){
		return otherInfo;
	}
	public void setTagIds(String tagIds){
		this.tagIds = tagIds;
	}
	public String getTagIds(){
		return tagIds;
	}
	public void setNewUserFlag(Integer newUserFlag){
		this.newUserFlag = newUserFlag;
	}
	public Integer getNewUserFlag(){
		return newUserFlag;
	}
	public void setState(Integer state){
		this.state = state;
	}
	public Integer getState(){
		return state;
	}
	public void setLastSafechcekYear(Integer lastSafechcekYear){
		this.lastSafechcekYear = lastSafechcekYear;
	}
	public Integer getLastSafechcekYear(){
		return lastSafechcekYear;
	}
	public void setLastSafecheckTime(Date lastSafecheckTime){
		this.lastSafecheckTime = lastSafecheckTime;
	}
	public Date getLastSafecheckTime(){
		return lastSafecheckTime;
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
