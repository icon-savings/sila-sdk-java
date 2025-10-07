package com.silamoney.client.domain;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;
import java.util.Map;

@Getter
public class GetVerificationResponse extends BaseResponse {
    @SerializedName(value = "verification_uuid")
    private String verificationUuid;

    @SerializedName("flow")
    private String flow;

    @SerializedName(value = "verification_status")
    private String verificationStatus;

    @SerializedName(value = "checks_performed")
    private List<String> checksPerformed;

    @SerializedName(value = "entity_type")
    private String entityType;

    @SerializedName(value = "parent_verification")
    private String parent_verification;

    @SerializedName(value = "reasons")
    private Map reasons;

    @SerializedName("kyc_action")
    private String kycAction;

    @SerializedName("certification_status")
    private String certificationStatus;

    @SerializedName(value = "requested_at")
    private int requestedAt;

}
