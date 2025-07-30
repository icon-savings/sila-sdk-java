package com.silamoney.client.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Object sent in the Update ID Document method
 *
 */
public class UpdateIdDocumentMsg {
  @SerializedName("header")
  private final Header header;

  @SerializedName("uuid")
  private final String uuid;

  @SerializedName("doc_type")
  private final String docType;

  @SerializedName("doc_id")
  private final String docId;

  @SerializedName("doc_state")
  private final String docState;

  public UpdateIdDocumentMsg(String userHandle,
                             String appHandle,
                             String uuid,
                             String docType,
                             String docId,
                             String docState) {
    this.header = new Header(userHandle, appHandle);
    this.uuid = uuid;
    this.docType = docType;
    this.docId = docId;
    this.docState = docState;
  }
} 