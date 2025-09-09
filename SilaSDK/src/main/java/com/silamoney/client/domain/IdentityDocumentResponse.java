package com.silamoney.client.domain;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class IdentityDocumentResponse {
  @SerializedName("added_epoch")
  private Long addedEpoch;
  @SerializedName("modified_epoch")
  private Long modifiedEpoch;
  @SerializedName("uuid")
  private String uuid;
  @SerializedName("doc_type")
  private String docType;
  @SerializedName("doc_id")
  private String docId;
  @SerializedName("doc_country")
  private String docCountry;
  @SerializedName("doc_state")
  private String docState;
}
