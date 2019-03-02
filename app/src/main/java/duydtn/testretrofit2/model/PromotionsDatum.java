package duydtn.testretrofit2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PromotionsDatum {
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("code")
    @Expose
    public String code;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("type")
    @Expose
    public Integer type;
    @SerializedName("detail_apply_type")
    @Expose
    public Integer detailApplyType;
    @SerializedName("apply_level")
    @Expose
    public Integer applyLevel;
    @SerializedName("is_for_member")
    @Expose
    public Boolean isForMember;
    @SerializedName("has_time_attributes")
    @Expose
    public Boolean hasTimeAttributes;
    @SerializedName("from_date")
    @Expose
    public String fromDate;
    @SerializedName("to_date")
    @Expose
    public String toDate;
    @SerializedName("begin_time")
    @Expose
    public String beginTime;
    @SerializedName("end_time")
    @Expose
    public String endTime;
    @SerializedName("is_voucher")
    @Expose
    public Boolean isVoucher;
    @SerializedName("is_stamp")
    @Expose
    public Boolean isStamp;
    @SerializedName("stamp_children_amount")
    @Expose
    public Object stampChildrenAmount;
    @SerializedName("stamp_award_of_promotion_code")
    @Expose
    public Object stampAwardOfPromotionCode;
    @SerializedName("is_apply_once")
    @Expose
    public Boolean isApplyOnce;
    @SerializedName("allow_apply_with_others")
    @Expose
    public Boolean allowApplyWithOthers;
    @SerializedName("brand_code")
    @Expose
    public String brandCode;
    @SerializedName("active")
    @Expose
    public Boolean active;
    @SerializedName("voucher_used_quantity")
    @Expose
    public Integer voucherUsedQuantity;
    @SerializedName("voucher_length")
    @Expose
    public Integer voucherLength;
    @SerializedName("voucher_allow_use_quantity")
    @Expose
    public Integer voucherAllowUseQuantity;
    @SerializedName("image_url")
    @Expose
    public String imageUrl;
    @SerializedName("days_of_week")
    @Expose
    public String daysOfWeek;
    @SerializedName("apply_quantity")
    @Expose
    public Integer applyQuantity;
    @SerializedName("applied_quantity")
    @Expose
    public Integer appliedQuantity;
    @SerializedName("voucher_quantity")
    @Expose
    public Integer voucherQuantity;
    @SerializedName("prefix")
    @Expose
    public String prefix;
    @SerializedName("postfix")
    @Expose
    public String postfix;
    @SerializedName("voucher_pattern")
    @Expose
    public String voucherPattern;
    @SerializedName("allow_auto_create_voucher")
    @Expose
    public Boolean allowAutoCreateVoucher;
    @SerializedName("voucher_expired_after_hours")
    @Expose
    public Integer voucherExpiredAfterHours;
    @SerializedName("has_payment_attributes")
    @Expose
    public Boolean hasPaymentAttributes;
    @SerializedName("payment_type")
    @Expose
    public Integer paymentType;
    @SerializedName("payment_partner_code")
    @Expose
    public String paymentPartnerCode;
    @SerializedName("has_sale_mode_attributes")
    @Expose
    public Boolean hasSaleModeAttributes;
    @SerializedName("order_type")
    @Expose
    public Integer orderType;
    @SerializedName("has_event_attributes")
    @Expose
    public Boolean hasEventAttributes;
    @SerializedName("event_type")
    @Expose
    public Integer eventType;
    @SerializedName("event_value")
    @Expose
    public Integer eventValue;

    public PromotionsDatum(String name, String description, String brandCode, String imageUrl, String beginTime, String endTime) {
        this.name = name;
        this.description = description;
        this.brandCode = brandCode;
        this.imageUrl = imageUrl;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    @SerializedName("is_public")
    @Expose

    public Boolean isPublic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDetailApplyType() {
        return detailApplyType;
    }

    public void setDetailApplyType(Integer detailApplyType) {
        this.detailApplyType = detailApplyType;
    }

    public Integer getApplyLevel() {
        return applyLevel;
    }

    public void setApplyLevel(Integer applyLevel) {
        this.applyLevel = applyLevel;
    }

    public Boolean getForMember() {
        return isForMember;
    }

    public void setForMember(Boolean forMember) {
        isForMember = forMember;
    }

    public Boolean getHasTimeAttributes() {
        return hasTimeAttributes;
    }

    public void setHasTimeAttributes(Boolean hasTimeAttributes) {
        this.hasTimeAttributes = hasTimeAttributes;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Boolean getVoucher() {
        return isVoucher;
    }

    public void setVoucher(Boolean voucher) {
        isVoucher = voucher;
    }

    public Boolean getStamp() {
        return isStamp;
    }

    public void setStamp(Boolean stamp) {
        isStamp = stamp;
    }

    public Object getStampChildrenAmount() {
        return stampChildrenAmount;
    }

    public void setStampChildrenAmount(Object stampChildrenAmount) {
        this.stampChildrenAmount = stampChildrenAmount;
    }

    public Object getStampAwardOfPromotionCode() {
        return stampAwardOfPromotionCode;
    }

    public void setStampAwardOfPromotionCode(Object stampAwardOfPromotionCode) {
        this.stampAwardOfPromotionCode = stampAwardOfPromotionCode;
    }

    public Boolean getApplyOnce() {
        return isApplyOnce;
    }

    public void setApplyOnce(Boolean applyOnce) {
        isApplyOnce = applyOnce;
    }

    public Boolean getAllowApplyWithOthers() {
        return allowApplyWithOthers;
    }

    public void setAllowApplyWithOthers(Boolean allowApplyWithOthers) {
        this.allowApplyWithOthers = allowApplyWithOthers;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getVoucherUsedQuantity() {
        return voucherUsedQuantity;
    }

    public void setVoucherUsedQuantity(Integer voucherUsedQuantity) {
        this.voucherUsedQuantity = voucherUsedQuantity;
    }

    public Integer getVoucherLength() {
        return voucherLength;
    }

    public void setVoucherLength(Integer voucherLength) {
        this.voucherLength = voucherLength;
    }

    public Integer getVoucherAllowUseQuantity() {
        return voucherAllowUseQuantity;
    }

    public void setVoucherAllowUseQuantity(Integer voucherAllowUseQuantity) {
        this.voucherAllowUseQuantity = voucherAllowUseQuantity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public Integer getApplyQuantity() {
        return applyQuantity;
    }

    public void setApplyQuantity(Integer applyQuantity) {
        this.applyQuantity = applyQuantity;
    }

    public Integer getAppliedQuantity() {
        return appliedQuantity;
    }

    public void setAppliedQuantity(Integer appliedQuantity) {
        this.appliedQuantity = appliedQuantity;
    }

    public Integer getVoucherQuantity() {
        return voucherQuantity;
    }

    public void setVoucherQuantity(Integer voucherQuantity) {
        this.voucherQuantity = voucherQuantity;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPostfix() {
        return postfix;
    }

    public void setPostfix(String postfix) {
        this.postfix = postfix;
    }

    public String getVoucherPattern() {
        return voucherPattern;
    }

    public void setVoucherPattern(String voucherPattern) {
        this.voucherPattern = voucherPattern;
    }

    public Boolean getAllowAutoCreateVoucher() {
        return allowAutoCreateVoucher;
    }

    public void setAllowAutoCreateVoucher(Boolean allowAutoCreateVoucher) {
        this.allowAutoCreateVoucher = allowAutoCreateVoucher;
    }

    public Integer getVoucherExpiredAfterHours() {
        return voucherExpiredAfterHours;
    }

    public void setVoucherExpiredAfterHours(Integer voucherExpiredAfterHours) {
        this.voucherExpiredAfterHours = voucherExpiredAfterHours;
    }

    public Boolean getHasPaymentAttributes() {
        return hasPaymentAttributes;
    }

    public void setHasPaymentAttributes(Boolean hasPaymentAttributes) {
        this.hasPaymentAttributes = hasPaymentAttributes;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentPartnerCode() {
        return paymentPartnerCode;
    }

    public void setPaymentPartnerCode(String paymentPartnerCode) {
        this.paymentPartnerCode = paymentPartnerCode;
    }

    public Boolean getHasSaleModeAttributes() {
        return hasSaleModeAttributes;
    }

    public void setHasSaleModeAttributes(Boolean hasSaleModeAttributes) {
        this.hasSaleModeAttributes = hasSaleModeAttributes;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Boolean getHasEventAttributes() {
        return hasEventAttributes;
    }

    public void setHasEventAttributes(Boolean hasEventAttributes) {
        this.hasEventAttributes = hasEventAttributes;
    }

    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public Integer getEventValue() {
        return eventValue;
    }

    public void setEventValue(Integer eventValue) {
        this.eventValue = eventValue;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }
}

