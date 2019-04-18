package com.zed.base_demo.entity;

import com.zed.base_demo.base.BaseEntity;
import java.util.Date;

public class BetRecord extends BaseEntity {
    /**
     * 主键
     */
    private String id;

    /**
     * ID
     */
    private String betRecordCode;

    /**
     * 租户
     */
    private String tenantCode;

    /**
     * 聊天室ID
     */
    private String roomId;

    /**
     * 
     */
    private String createdBy;

    /**
     * 
     */
    private Date createdDate;

    /**
     * 
     */
    private String lastModifiedBy;

    /**
     * 
     */
    private Date lastModifiedDate;

    /**
     * 账户
     */
    private String accounts;

    /**
     * 主键
     * @return ID 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * ID
     * @return BET_RECORD_CODE ID
     */
    public String getBetRecordCode() {
        return betRecordCode;
    }

    /**
     * ID
     * @param betRecordCode ID
     */
    public void setBetRecordCode(String betRecordCode) {
        this.betRecordCode = betRecordCode == null ? null : betRecordCode.trim();
    }

    /**
     * 租户
     * @return TENANT_CODE 租户
     */
    public String getTenantCode() {
        return tenantCode;
    }

    /**
     * 租户
     * @param tenantCode 租户
     */
    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode == null ? null : tenantCode.trim();
    }

    /**
     * 聊天室ID
     * @return ROOM_ID 聊天室ID
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * 聊天室ID
     * @param roomId 聊天室ID
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    /**
     * 
     * @return CREATED_BY 
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 
     * @param createdBy 
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * 
     * @return CREATED_DATE 
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * 
     * @param createdDate 
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * 
     * @return LAST_MODIFIED_BY 
     */
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * 
     * @param lastModifiedBy 
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy == null ? null : lastModifiedBy.trim();
    }

    /**
     * 
     * @return LAST_MODIFIED_DATE 
     */
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * 
     * @param lastModifiedDate 
     */
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * 账户
     * @return ACCOUNTS 账户
     */
    public String getAccounts() {
        return accounts;
    }

    /**
     * 账户
     * @param accounts 账户
     */
    public void setAccounts(String accounts) {
        this.accounts = accounts == null ? null : accounts.trim();
    }
}