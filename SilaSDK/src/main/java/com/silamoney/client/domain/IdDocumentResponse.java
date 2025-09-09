package com.silamoney.client.domain;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public class IdDocumentResponse extends BaseResponse {
  @Getter
  @SerializedName("id_document")
  private IdentityDocumentResponse identityDocument;
}
