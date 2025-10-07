package com.silamoney.client.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Object sent in the Update ID Document method
 *
 */
public class AddIdDocumentMsg {
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

  @SerializedName("doc_country")
  private final String docCountry;

  public AddIdDocumentMsg(String userHandle,
                          String appHandle,
                          String uuid,
                          String docType,
                          String docId,
                          String docState,
                          String docCountry,
                          String reference) {
    this.header = new Header(userHandle, appHandle);
    this.header.setReference(reference);
    this.uuid = uuid;
    this.docType = docType;
    this.docId = docId;
    this.docState = docState;
    this.docCountry = docCountry;
  }

}