package cc.eslink.shardingjdbcdemo.domain.entity;
import java.util.*;
import javax.persistence.Table;
import cc.eslink.common.base.BaseDomain;


/**
 * 地址
 *
 * @author zyk 
 */
@Table(name ="biz_address")
public class BizAddress extends BaseDomain {

	private static final long serialVersionUID = 1L;

	//=================================================

	/** 地址ID */
	private String addressId;

	/** 外部地址ID */
	private String outAddressId;

	/** 用户ID */
	private String userId;

	/** 次序号 */
	private Integer sortNo;

	/** 字符型排序 */
	private String sortNoNotNumeric;

	/** 省 */
	private String province;

	/** 市 */
	private String city;

	/** 区/县 */
	private String county;

	/** 街道 */
	private String street;

	/** 小区 */
	private String housingEstateId;

	/** 楼栋号 */
	private String buildingNo;

	/** 单元号 */
	private String unitNo;

	/** 楼层 */
	private String floorNo;

	/** 门牌号 */
	private String houseNo;

	/** 地址描述 */
	private String addressDesc;

	/** 地址类型 */
	private String addressType;

	/** 房屋面积 */
	private String houseSpace;

	/** 房产证号 */
	private String houseCertNo;

	/** 建造年代 */
	private Integer buildingAge;

	/** 用气类型 */
	private String gasType;

	/** 片区 */
	private String areasId;

	/** 状态 */
	private Integer state;

	/** 是否隐藏 0-显示 1-隐藏 */
	private Integer hideFlag;

	/** 编制标识 */
	private String drawupFlag;

	/** 批次号 */
	private String batchNo;

	/** 管理所 */
	private String manageOrg;

	/** 分配标识（0-未分配，1-已分配） */
	private Integer distributeFlag;

	/** 开户时间 */
	private Date openDate;

	/** 是否采暖 0-否 1-是 */
	private Integer cnFlag;

	/** 是否村村通 0-否 1-是 */
	private Integer cctFlag;

	/** 上次安检年份 */
	private Integer lastSafechcekYear;

	/** 上次安检时间 */
	private Date lastSafecheckTime;

	/** 重点用户 */
	private Integer majorFlag;

	/** 租户ID */
	private String tenantId;

	/** 来源 1：同步；2：新增 */
	private Integer sourceType;

	/** 修改状态 0：未修改；1：已修改； */
	private Integer modifyState;

	/** 审核标识 0：未审核；1：审核通过；2：审核驳回 */
	private Integer auditState;

	/** 确认标识 0：未确认；1：确认通过 */
	private Integer confirmState;

	/** 0-etbc 数据录入，其余为对应的前置ID  */
	private Integer originPreId;

	/** 修改备注 */
	private String updateRemark;

	/** 创建时间 */
	private Date createTime;

	/** 修改时间 */
	private Date modifyTime;

	//=================================================

	public void setAddressId(String addressId){
		this.addressId = addressId;
	}
	public String getAddressId(){
		return addressId;
	}
	public void setOutAddressId(String outAddressId){
		this.outAddressId = outAddressId;
	}
	public String getOutAddressId(){
		return outAddressId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}
	public String getUserId(){
		return userId;
	}
	public void setSortNo(Integer sortNo){
		this.sortNo = sortNo;
	}
	public Integer getSortNo(){
		return sortNo;
	}
	public void setSortNoNotNumeric(String sortNoNotNumeric){
		this.sortNoNotNumeric = sortNoNotNumeric;
	}
	public String getSortNoNotNumeric(){
		return sortNoNotNumeric;
	}
	public void setProvince(String province){
		this.province = province;
	}
	public String getProvince(){
		return province;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return city;
	}
	public void setCounty(String county){
		this.county = county;
	}
	public String getCounty(){
		return county;
	}
	public void setStreet(String street){
		this.street = street;
	}
	public String getStreet(){
		return street;
	}
	public void setHousingEstateId(String housingEstateId){
		this.housingEstateId = housingEstateId;
	}
	public String getHousingEstateId(){
		return housingEstateId;
	}
	public void setBuildingNo(String buildingNo){
		this.buildingNo = buildingNo;
	}
	public String getBuildingNo(){
		return buildingNo;
	}
	public void setUnitNo(String unitNo){
		this.unitNo = unitNo;
	}
	public String getUnitNo(){
		return unitNo;
	}
	public void setFloorNo(String floorNo){
		this.floorNo = floorNo;
	}
	public String getFloorNo(){
		return floorNo;
	}
	public void setHouseNo(String houseNo){
		this.houseNo = houseNo;
	}
	public String getHouseNo(){
		return houseNo;
	}
	public void setAddressDesc(String addressDesc){
		this.addressDesc = addressDesc;
	}
	public String getAddressDesc(){
		return addressDesc;
	}
	public void setAddressType(String addressType){
		this.addressType = addressType;
	}
	public String getAddressType(){
		return addressType;
	}
	public void setHouseSpace(String houseSpace){
		this.houseSpace = houseSpace;
	}
	public String getHouseSpace(){
		return houseSpace;
	}
	public void setHouseCertNo(String houseCertNo){
		this.houseCertNo = houseCertNo;
	}
	public String getHouseCertNo(){
		return houseCertNo;
	}
	public void setBuildingAge(Integer buildingAge){
		this.buildingAge = buildingAge;
	}
	public Integer getBuildingAge(){
		return buildingAge;
	}
	public void setGasType(String gasType){
		this.gasType = gasType;
	}
	public String getGasType(){
		return gasType;
	}
	public void setAreasId(String areasId){
		this.areasId = areasId;
	}
	public String getAreasId(){
		return areasId;
	}
	public void setState(Integer state){
		this.state = state;
	}
	public Integer getState(){
		return state;
	}
	public void setHideFlag(Integer hideFlag){
		this.hideFlag = hideFlag;
	}
	public Integer getHideFlag(){
		return hideFlag;
	}
	public void setDrawupFlag(String drawupFlag){
		this.drawupFlag = drawupFlag;
	}
	public String getDrawupFlag(){
		return drawupFlag;
	}
	public void setBatchNo(String batchNo){
		this.batchNo = batchNo;
	}
	public String getBatchNo(){
		return batchNo;
	}
	public void setManageOrg(String manageOrg){
		this.manageOrg = manageOrg;
	}
	public String getManageOrg(){
		return manageOrg;
	}
	public void setDistributeFlag(Integer distributeFlag){
		this.distributeFlag = distributeFlag;
	}
	public Integer getDistributeFlag(){
		return distributeFlag;
	}
	public void setOpenDate(Date openDate){
		this.openDate = openDate;
	}
	public Date getOpenDate(){
		return openDate;
	}
	public void setCnFlag(Integer cnFlag){
		this.cnFlag = cnFlag;
	}
	public Integer getCnFlag(){
		return cnFlag;
	}
	public void setCctFlag(Integer cctFlag){
		this.cctFlag = cctFlag;
	}
	public Integer getCctFlag(){
		return cctFlag;
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
	public void setMajorFlag(Integer majorFlag){
		this.majorFlag = majorFlag;
	}
	public Integer getMajorFlag(){
		return majorFlag;
	}
	public void setTenantId(String tenantId){
		this.tenantId = tenantId;
	}
	public String getTenantId(){
		return tenantId;
	}
	public void setSourceType(Integer sourceType){
		this.sourceType = sourceType;
	}
	public Integer getSourceType(){
		return sourceType;
	}
	public void setModifyState(Integer modifyState){
		this.modifyState = modifyState;
	}
	public Integer getModifyState(){
		return modifyState;
	}
	public void setAuditState(Integer auditState){
		this.auditState = auditState;
	}
	public Integer getAuditState(){
		return auditState;
	}
	public void setConfirmState(Integer confirmState){
		this.confirmState = confirmState;
	}
	public Integer getConfirmState(){
		return confirmState;
	}
	public void setOriginPreId(Integer originPreId){
		this.originPreId = originPreId;
	}
	public Integer getOriginPreId(){
		return originPreId;
	}
	public void setUpdateRemark(String updateRemark){
		this.updateRemark = updateRemark;
	}
	public String getUpdateRemark(){
		return updateRemark;
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
