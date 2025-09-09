package com.silamoney.client.domain;

import com.google.gson.annotations.SerializedName;

public class IdDocumentMsg {
  @SerializedName("header")
  private Header header;
  @SerializedName("doc_type")
  private String docType;
  @SerializedName("doc_id")
  private String docId;
  @SerializedName("doc_country")
  private String docCountry;
  @SerializedName("doc_state")
  private String docState;

  public IdDocumentMsg(String authHandle, UserHandleMessage user, IdentityDocument idDocument) {
    this.header = new Header(user.getUserHandle(), authHandle);
    this.header.setReference(user.getReference());
    this.docType = idDocument.getDocType();
    this.docId = idDocument.getDocId();
    this.docCountry = idDocument.getDocCountry();
    this.docState = idDocument.getDocState();
  }
}
