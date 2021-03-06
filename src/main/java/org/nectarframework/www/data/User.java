package org.nectarframework.www.data;

import org.nectarframework.base.service.ServiceRegister;
import org.nectarframework.base.service.datastore.DataStoreObject;
import org.nectarframework.base.service.datastore.DataStoreObjectDescriptor;
import org.nectarframework.base.service.datastore.DataStoreObjectDescriptorColumn;
import org.nectarframework.base.service.datastore.DataStoreObjectDescriptorKey;
import org.nectarframework.base.service.datastore.DataStoreService;

// THIS CLASS IS AUTO GENERATED by nectar.base.service.datastore.dsobuilder.DataStoreObjectBuilder, and configured by config/dataStoreObjects.xml . 
// Edits to this file will be overwritten!
public class User extends DataStoreObject {
	
	public User() {
	}
	
	@Override
	public void initDataStoreObjectDescriptor(DataStoreService dss) {
		dss.initDataStoreObjectDescriptor(new DataStoreObjectDescriptor("org_nectarframework_www_user", new DataStoreObjectDescriptorKey(new DataStoreObjectDescriptorColumn("id", DataStoreObjectDescriptorColumn.Type.LONG, false), 8, false), new DataStoreObjectDescriptorColumn[] {new DataStoreObjectDescriptorColumn("false", DataStoreObjectDescriptorColumn.Type.LONG,false), new DataStoreObjectDescriptorColumn("false", DataStoreObjectDescriptorColumn.Type.LONG,false), new DataStoreObjectDescriptorColumn("false", DataStoreObjectDescriptorColumn.Type.LONG,false), new DataStoreObjectDescriptorColumn("false", DataStoreObjectDescriptorColumn.Type.LONG,false), new DataStoreObjectDescriptorColumn("false", DataStoreObjectDescriptorColumn.Type.LONG,false), new DataStoreObjectDescriptorColumn("true", DataStoreObjectDescriptorColumn.Type.LONG,true), new DataStoreObjectDescriptorColumn("true", DataStoreObjectDescriptorColumn.Type.LONG,true), new DataStoreObjectDescriptorColumn("true", DataStoreObjectDescriptorColumn.Type.LONG,true), new DataStoreObjectDescriptorColumn("true", DataStoreObjectDescriptorColumn.Type.LONG,true), new DataStoreObjectDescriptorColumn("true", DataStoreObjectDescriptorColumn.Type.LONG,true), new DataStoreObjectDescriptorColumn("true", DataStoreObjectDescriptorColumn.Type.LONG,true), new DataStoreObjectDescriptorColumn("true", DataStoreObjectDescriptorColumn.Type.LONG,true), new DataStoreObjectDescriptorColumn("true", DataStoreObjectDescriptorColumn.Type.LONG,true), new DataStoreObjectDescriptorColumn("true", DataStoreObjectDescriptorColumn.Type.LONG,true), new DataStoreObjectDescriptorColumn("true", DataStoreObjectDescriptorColumn.Type.LONG,true), new DataStoreObjectDescriptorColumn("true", DataStoreObjectDescriptorColumn.Type.LONG,true), new DataStoreObjectDescriptorColumn("true", DataStoreObjectDescriptorColumn.Type.LONG,true), new DataStoreObjectDescriptorColumn("true", DataStoreObjectDescriptorColumn.Type.LONG,true), new DataStoreObjectDescriptorColumn("true", DataStoreObjectDescriptorColumn.Type.LONG,true), new DataStoreObjectDescriptorColumn("true", DataStoreObjectDescriptorColumn.Type.LONG,true), new DataStoreObjectDescriptorColumn("true", DataStoreObjectDescriptorColumn.Type.LONG,true), new DataStoreObjectDescriptorColumn("true", DataStoreObjectDescriptorColumn.Type.LONG,true)}, User.class));
	}
	
	public static User load(Long key) throws Exception {
		DataStoreService dss = (DataStoreService) ServiceRegister.getService(DataStoreService.class);
		DataStoreObject dso = dss.loadDSO(dss.getDataStoreObjectDescriptor(User.class), key);
		if (dso == null) 
			return null;
		return (User)dso;
	}
	
	public Long getId() {
		return getLong("id");
	}
	
	public void setId(Long id) {
		set("id", id);
	}
	
	public Byte getUserType() {
		return getByte("userType");
	}
	
	public void setUserType(Byte userType) {
		set("userType", userType);
	}
	
	public Long getHomeGroup() {
		return getLong("homeGroup");
	}
	
	public void setHomeGroup(Long homeGroup) {
		set("homeGroup", homeGroup);
	}
	
	public String getLogin() {
		return getString("login");
	}
	
	public void setLogin(String login) {
		set("login", login);
	}
	
	public String getPublicUserName() {
		return getString("publicUserName");
	}
	
	public void setPublicUserName(String publicUserName) {
		set("publicUserName", publicUserName);
	}
	
	public String getPermission() {
		return getString("permission");
	}
	
	public void setPermission(String permission) {
		set("permission", permission);
	}
	
	public String getLastUserIp() {
		return getString("lastUserIp");
	}
	
	public void setLastUserIp(String lastUserIp) {
		set("lastUserIp", lastUserIp);
	}
	
	public Long getRegistrationTimestamp() {
		return getLong("registrationTimestamp");
	}
	
	public void setRegistrationTimestamp(Long registrationTimestamp) {
		set("registrationTimestamp", registrationTimestamp);
	}
	
	public String getEmailAddress() {
		return getString("emailAddress");
	}
	
	public void setEmailAddress(String emailAddress) {
		set("emailAddress", emailAddress);
	}
	
	public Long getLastVisit() {
		return getLong("lastVisit");
	}
	
	public void setLastVisit(Long lastVisit) {
		set("lastVisit", lastVisit);
	}
	
	public String getLocaleLanguage() {
		return getString("localeLanguage");
	}
	
	public void setLocaleLanguage(String localeLanguage) {
		set("localeLanguage", localeLanguage);
	}
	
	public String getLocaleCountry() {
		return getString("localeCountry");
	}
	
	public void setLocaleCountry(String localeCountry) {
		set("localeCountry", localeCountry);
	}
	
	public String getLocaleVariant() {
		return getString("localeVariant");
	}
	
	public void setLocaleVariant(String localeVariant) {
		set("localeVariant", localeVariant);
	}
	
	public String getOptions() {
		return getString("options");
	}
	
	public void setOptions(String options) {
		set("options", options);
	}
	
	public String getTimezone() {
		return getString("timezone");
	}
	
	public void setTimezone(String timezone) {
		set("timezone", timezone);
	}
	
	public String getAvatar() {
		return getString("avatar");
	}
	
	public void setAvatar(String avatar) {
		set("avatar", avatar);
	}
	
	public Byte getAvatarType() {
		return getByte("avatarType");
	}
	
	public void setAvatarType(Byte avatarType) {
		set("avatarType", avatarType);
	}
	
	public String getAvatarWidth() {
		return getString("avatarWidth");
	}
	
	public void setAvatarWidth(String avatarWidth) {
		set("avatarWidth", avatarWidth);
	}
	
	public String getAvatarHeight() {
		return getString("avatarHeight");
	}
	
	public void setAvatarHeight(String avatarHeight) {
		set("avatarHeight", avatarHeight);
	}
	
	public String getSignature() {
		return getString("signature");
	}
	
	public void setSignature(String signature) {
		set("signature", signature);
	}
	
	public String getAbout() {
		return getString("about");
	}
	
	public void setAbout(String about) {
		set("about", about);
	}
	
	public Byte getRegistrationStatus() {
		return getByte("registrationStatus");
	}
	
	public void setRegistrationStatus(Byte registrationStatus) {
		set("registrationStatus", registrationStatus);
	}
	
}
